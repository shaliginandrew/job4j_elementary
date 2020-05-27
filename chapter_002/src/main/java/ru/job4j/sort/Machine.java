package ru.job4j.sort;
import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        for (int i = 0; i < coins.length; i++) {
           while (balance - coins[i] >= 0) {
                rsl[size] = coins[i];
                balance = balance - coins[i];
                size++;
           }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
    Machine machine = new Machine();
    int[] result = machine.change(50, 35);
    for (int i = 0; i < result.length; i++) {
        System.out.println(result[i]);
    }
    }
}
