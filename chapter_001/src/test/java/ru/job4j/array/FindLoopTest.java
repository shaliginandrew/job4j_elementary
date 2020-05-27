package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasMinus5Then6() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 14, 128, 45, -5};
        int value = -5;
        int result = find.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayNoHave4ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 14, 128, 45, -5};
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind10() {
        int[] input = new int[] {5, 2, 10, 2, 4, 8, 7};
        int value = 10;
        int start = 3;
        int finish = 6;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind8() {
        int[] input = new int[] {5, 2, 10, 2, 4, 8, 7};
        int value = 8;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }

  }