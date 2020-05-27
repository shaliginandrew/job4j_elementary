package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("ABC", 5),
                new Job("ABC", 4),
                new Job("AB", 2),
                new Job("A", 0)
        );
        jobs.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Comparator<Job> compareName = Comparator.comparing(Job::getName);
        jobs.sort(compareName);
        System.out.println(jobs);
        Comparator<Job> comparePriority = Comparator.comparingInt(Job::getPriority);
        jobs.sort(comparePriority);
        System.out.println(jobs);
        Comparator<Job> combine = compareName.thenComparing(comparePriority);
        jobs.sort(combine);
        System.out.println(jobs);
    }
}
