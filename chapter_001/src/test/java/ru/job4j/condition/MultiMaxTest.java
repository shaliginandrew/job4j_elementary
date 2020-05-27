package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(15, 4, 2);
        assertThat(result, is(15));
    }

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThridMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenEquals() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 10, 10);
        assertThat(result, is(10));
    }

}
