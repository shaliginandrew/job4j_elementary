package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String point = array[index];
            if (point == null) {
                int j = index + 1;
                while (j < array.length && array[j] == null) {
                    j++;
                }
                    if (j < array.length) {
                        array[index] = array[j];
                        array[j] = null;
                    }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
