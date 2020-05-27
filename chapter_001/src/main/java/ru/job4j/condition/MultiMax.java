package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int thrid) {
        int max12 = (first > second) ? first : second;
        int result = max12 > thrid ? max12 : thrid;
        return result;
    }

    public static void main(String[] args) {
        int otv = MultiMax.max(1, 5, 8);
        System.out.println(otv);
    }
}
