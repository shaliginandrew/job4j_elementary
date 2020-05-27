package ru.job4j.condition;

public class SqMax {

    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = third;
                }
            }
        }   else if (second > third) {
            if (second > forth) {
                result = first;
            }
        }   else if (third > forth) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int otv = SqMax.max(4, 3, 2, 1);
        System.out.println(otv);
    }
}
