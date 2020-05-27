package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
    String word = "Неизвестное слово: " + eng;
    return word;
    }

    public static void main(String[] args) {
        DummyDic translate = new DummyDic();
        String result = translate.engToRus("row");
        System.out.println(result);
    }
}
