package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenTwoMissed() {
        List<String> input = Arrays.asList("K2/SK1/SSK1");
        List<String> expect = List.of("K2", "K2/SK1", "K2/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }
    public void sortNaturalOrdering() {
        List<String> input = Arrays.asList("K2/SK1", "K2/SK1/SSK1", "K2");
        List<String> expect = List.of("K2", "K2/SK1", "K2/SK1/SSK1");
        Departments.sortAsc(input);
        assertThat(input, is(expect));
    }
    @Test
    public void sortComparatoUse() {
        List<String> input = Arrays.asList("K1/SK1", "K2/SK1");
        List<String> expect = List.of("K2/SK1", "K1/SK1");
        Departments.sortDesc(input);
        assertThat(input, is(expect));
    }
}