package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenIncreaseByPriority() {
        Comparator<Job> cmpPriority = new JobIncreaseByPriority();
        int rsl = cmpPriority.compare(
                new Job("AB", 1),
                new Job("A", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenIncreaseByName() {
        Comparator<Job> cmpName = new JobIncreaseByName();
        int rsl = cmpName.compare(
                new Job("AB", 0),
                new Job("A", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenDescByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("AB", 0),
                new Job("A", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenDescByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("AB", 0),
                new Job("A", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("AB", 0),
                new Job("A", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenCompatorByNameAndPrority2() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("AB", 1),
                new Job("AB", 0)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenCompatorByNameAndProrityIncrease() {
        Comparator<Job> cmpNamePriority = new JobIncreaseByName().thenComparing(new JobIncreaseByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("AB", 0),
                new Job("AB", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}