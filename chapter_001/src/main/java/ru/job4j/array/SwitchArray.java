package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int tempsource = array[source];
        array[source] = array[dest];
        array[dest] = tempsource;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swap(nums, 1, 3);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
