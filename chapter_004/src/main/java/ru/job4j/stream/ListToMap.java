package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static Map<String, Student> convertListToMap(List<Student> students) {
        return  students.stream().collect(Collectors.toMap(Student::getSurname, student -> student));
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(80, "Иванов"),
                new Student(90, "Зайцев"),
                new Student(60, "Петров"),
                new Student(40, "Сидоров")
        );
        System.out.println(convertListToMap(students).values());
    }
}