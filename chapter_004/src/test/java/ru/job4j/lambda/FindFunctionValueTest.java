package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.lambda.FindFunctionValue.diapason;

public class FindFunctionValueTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenLinearFunctionThenLinearResults2() {
        List<Double> result = diapason(2, 5, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(5D, 7D, 9D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenQuadraticFunction() {
        List<Double> result = diapason(2, 5, x -> 2 * x * x + 3 * x + 5);
        List<Double> expected = Arrays.asList(19D, 32D, 49D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenExponentialFunction() {
        List<Double> result = diapason(2, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(4D, 8D, 16D);
        assertThat(result, is(expected));
    }

}