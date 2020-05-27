package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;
import static ru.job4j.stream.ListToMap.convertListToMap;

public class ListToMapTest {
    @Test
    public void valueTest() {
        List<Student> students = List.of(
                new Student(80, "Иванов"),
                new Student(90, "Зайцев"),
                new Student(60, "Петров"),
                new Student(40, "Сидоров")
        );
        Map<String, Student> map = convertListToMap(students);
        assertThat(
                map.values(),
                containsInAnyOrder(students.toArray()));
    }
}


