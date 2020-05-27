package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
@SuppressWarnings("deprecation")
public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4, 5, 8, 78};
        int[] expect = {1, 3, 2, 4, 5, 8, 78 };
        int[] rsl = SwitchArray.swap(input, 1, input.length - 5);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap5to6() {
        int[] input = {1, 2, 3, 4, 5, 8, 78};
        int[] expect = {1, 2, 3, 4, 5, 78, 8 };
        int[] rsl = SwitchArray.swap(input, 5, input.length - 1);
        assertThat(rsl, is(expect));
    }
}