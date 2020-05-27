package ru.job4j.condition;

public class Max {

    public static int max(int one, int two) {
        int result = one > two ? one : two;
        return result;
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
     }

    public static int max(int one, int two, int three, int four) {
        return max(one, max(two, three, four));

    }

    public static void main(String[] args) {
        int rez1 = Max.max(7, 6);
        int rez2 = Max.max(9, 12, 11);
        int rez3 = Max.max(15, 11, 11, 18);
        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);
    }
}
