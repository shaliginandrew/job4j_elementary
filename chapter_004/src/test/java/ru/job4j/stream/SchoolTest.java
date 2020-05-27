package ru.job4j.stream;
import org.junit.Test;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void student10ATest() {
        School school = new School();
        List<Student> students = List.of(
                new Student(80, "Иванов"),
                new Student(90, "Зайцев"),
                new Student(60, "Петров"),
                new Student(40, "Сидоров")
        );
        List<Student> expected10A = List.of(
                new Student(80, "Иванов"),
                new Student(90, "Зайцев")
        );
        Predicate<Student> predict10A = student10A -> student10A.getScore() >= 70 && student10A.getScore() < 100;
        List<Student> result10A = school.collect(students, predict10A);
        assertThat(result10A, is(expected10A));
    }

    @Test
    public void student10BTest() {
        School school = new School();
        List<Student> students = List.of(
                new Student(80, "Иванов"),
                new Student(90, "Зайцев"),
                new Student(60, "Петров"),
                new Student(40, "Сидоров")
        );
        List<Student> expected10B = List.of(
                new Student(60, "Петров")
        );
        Predicate<Student> predict10B =  student10B -> student10B.getScore() >= 50 && student10B.getScore() < 70;
        List<Student> result10B = school.collect(students, predict10B);
        assertThat(result10B, is(expected10B));
    }

    @Test
    public void student10VTest() {
        School school = new School();
        List<Student> students = List.of(
                new Student(80, "Иванов"),
                new Student(90, "Зайцев"),
                new Student(60, "Петров"),
                new Student(40, "Сидоров")
        );
        List<Student> expected10V = List.of(
                new Student(40, "Сидоров")
        );
        Predicate<Student> predict10V =  student10V -> student10V.getScore() >= 0 && student10V.getScore() < 50;
        List<Student> result10V = school.collect(students, predict10V);
        assertThat(result10V, is(expected10V));
    }
}
