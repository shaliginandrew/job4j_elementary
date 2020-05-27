package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book one = new Book("Война и мир", 1500);
        Book two = new Book("Мертвые души", 1200);
        Book three = new Book("Евгений Онегин", 300);
        Book four = new Book("Clean code", 400);
        Book[] rsl = new Book[4];
        rsl[0] = one;
        rsl[1] = two;
        rsl[2] = three;
        rsl[3] = four;
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i].getName() + "-" + rsl[i].getCount());
        }
        Book temp = rsl[0];
        rsl[0] = rsl[3];
        rsl[3] = temp;
        System.out.println("Война и мир inversion Clean code");
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i].getName() + "-" + rsl[i].getCount());
        }
        System.out.println("Books with name Clean code");
        for (int i = 0; i < rsl.length; i++) {
            if (rsl[i].getName().equals("Clean code")) {
                System.out.println(rsl[i].getName() + "-" + rsl[i].getCount());
            }
        }
    }
}


