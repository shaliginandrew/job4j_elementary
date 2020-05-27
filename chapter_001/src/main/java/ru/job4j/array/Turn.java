package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int i = 0; i <= (array.length - 1) / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] rsl = back(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}




