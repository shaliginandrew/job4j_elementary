package ru.job4j.array;

public class MinDiapason {

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = (start + 1); index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {10, 5, 3, 1};
        int result = findMin(array, 1, 3);
        System.out.println(result);
    }
}
