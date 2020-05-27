package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int k = start; k <= finish; k++) {
            if ((k % 2) == 0) {
                sum = sum + k;
            }
        }
        return sum;
    }
/**
*Выводим сумму всех числе в диапазоне и выводим четные числа в дипазоне
 */
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(55, 100));
        System.out.println(sum(30, 40));
        System.out.println(sum(-1, 10));
        int chet = Counter.sumByEven(1, 10);
        System.out.println("Сумма четных чисел " + chet);
    }
}
