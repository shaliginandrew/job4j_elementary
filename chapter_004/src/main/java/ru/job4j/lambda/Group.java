package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(student -> student.getUnits().stream().map(unit -> new Holder(unit, student.getName())))  // собираем объект Holder с unit и name
                .collect(Collectors.groupingBy(t -> t.key, // определяем группировку
                        Collector.of(
                                HashSet::new, // аккумулятор.
                                (set, el) -> set.add(el.value), // как добавлять данные.
                                        (left, right) -> { // для агрегации.
                                            left.addAll(right);
                                            return left;
                                        }
                        )
                )
        );
    }
}