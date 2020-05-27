package ru.job4j.loop;

public class Factorial {

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
        result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int otv = Factorial.calc(1);
        System.out.println(otv);
    }
}
