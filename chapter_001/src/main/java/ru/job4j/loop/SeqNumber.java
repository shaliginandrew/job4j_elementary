package ru.job4j.loop;
/*Программа будет выводить на консоль числа, последовательная сумма которых равны заданному
 числу.Например, задано число 6. Его можно получить сложив 1, 2, 3.
Если последовательное сложение не дает нужного числа, то выйти.
 */
public class SeqNumber {

    public static void main(String[] args) {
        calc(6);
    }
    public static void calc(int n) {
        int hold = 0;
        for (int index = 1; index <= n; index++) {
            hold += index;
            if (hold == n) {
                for (int i = 1; i <= index; i++) {
                    System.out.println(i);
                }
                break;
            } else if (hold > n) {
                System.out.println("Not possible");
                break;
            }
        }
    }
}

