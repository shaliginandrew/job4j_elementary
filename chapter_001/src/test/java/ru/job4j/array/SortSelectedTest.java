package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortWith3() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortWith5() {
        int[] input = new int[] {10, 14, 1, 45, 15};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 10, 14, 15, 45};
        assertThat(result, is(expect));
    }


}