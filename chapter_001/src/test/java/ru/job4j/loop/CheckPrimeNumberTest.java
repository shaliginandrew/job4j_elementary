package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when12() {
        boolean rsl = CheckPrimeNumber.check(12);
        assertThat(rsl, is(false));
    }

    @Test
    public void when269() {
        boolean rsl = CheckPrimeNumber.check(269);
        assertThat(rsl, is(true));

    }

    @Test
    public void when268() {
        boolean rsl = CheckPrimeNumber.check(268);
        assertThat(rsl, is(false));
    }

    public static class PrimeNumberTest {
        @Test
        public void when5() {
            PrimeNumber prime = new PrimeNumber();
            int count = prime.calc(5);
            assertThat(count, is(3));
        }

        @Test
        public void when11() {
            PrimeNumber prime = new PrimeNumber();
            int count = prime.calc(11);
            assertThat(count, is(5));
        }

        @Test
        public void when2() {
            PrimeNumber prime = new PrimeNumber();
            int count = prime.calc(2);
            assertThat(count, is(1));
        }
    }
}