package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = k;
                System.out.println("table" + "[" + i + "]" + "[" + j + "]" + "=" + table[i][j]);
                k++;
            }
        }
        }
    }
