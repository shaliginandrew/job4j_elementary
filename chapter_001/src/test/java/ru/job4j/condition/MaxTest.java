package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax1To2Equality() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenOneTwoThree() {
        int result = Max.max(4, 4, 5);
        assertThat(result, is(5));
    }
    @Test
    public void whenOneTwoThreeFour() {
        int result = Max.max(4, 4, 5, 1);
        assertThat(result, is(5));
    }
}
