package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
    @Test
    public void getSection() {
        Map<String, Set<String>> rsl = Group.sections(List.of(new Student("Андрей", Set.of("Баскетбол", "Футбол")),
                new Student("Сергей", Set.of("Баскетбол", "Хоккей"))));
        assertThat(rsl.get("Баскетбол"), is(Set.of("Андрей", "Сергей")));
    }
}
