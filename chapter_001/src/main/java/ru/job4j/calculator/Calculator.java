package ru.job4j.calculator;
/**
 * Class Calculator для вычисления арифмечтических операций + , / , -
 * @author Andrey Shalygin(shaligin.andrew@gmail.com)
 */
public class Calculator {
    /**
     * Main
     * @param args-args.
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
