package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        School school = new School();
        Predicate<Student> predict10A =  student10A -> student10A.getScore() >= 70 && student10A.getScore() < 100;
        List<Student> students = List.of(
                new Student(80, "Иванов"),
                new Student(90, "Зайцев"),
                new Student(60, "Петров"),
                new Student(40, "Сидоров")
        );
        List<Student> student10A = school.collect(students, predict10A);
        System.out.println("10А");
        student10A.forEach(System.out::println);
        Predicate<Student> predict10B =  student10B -> student10B.getScore() >= 50 && student10B.getScore() < 70;
        List<Student> student10B = school.collect(students, predict10B);
        System.out.println("10Б");
        student10B.forEach(System.out::println);
        Predicate<Student> predict10V =  student10V -> student10V.getScore() >= 0 && student10V.getScore() < 50;
        List<Student> student10V = school.collect(students, predict10V);
        System.out.println("10В");
        student10V.forEach(System.out::println);
    }
}
