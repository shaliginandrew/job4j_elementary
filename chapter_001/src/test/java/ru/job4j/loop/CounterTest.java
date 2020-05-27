package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
@SuppressWarnings("deprecation")
public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTwelveThenFourtyTwo() {
        int rsl = Counter.sumByEven(1, 12);
        int expected = 42;
        assertThat(rsl, is(expected));
    }
}