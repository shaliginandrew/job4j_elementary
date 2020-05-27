package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[] {3, 5, 1, 2, 4};
        int[] result = sort(data);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
