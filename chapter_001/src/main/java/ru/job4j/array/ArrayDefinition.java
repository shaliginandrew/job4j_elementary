package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Andrey Shalygin";
        names[2] = "Steve Jobs";
        names[3] = "Bill Gates";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
