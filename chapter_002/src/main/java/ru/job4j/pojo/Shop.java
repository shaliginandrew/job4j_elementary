package ru.job4j.pojo;

public class Shop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            }
        products[products.length - 1] = null;
        return products;
    }


        public static void main(String[]args) {
            Product[] products = new Product[4];
            System.out.println("Заполняем массив: ");
            products[0] = new Product("Milk", 10);
            products[1] = new Product("Bread", 4);
            products[2] = new Product("Water", 10);
            products[3] = new Product("Egg", 19);
            for (int i = 0; i < products.length; i++) {
                Product product = products[i];
                if (product != null) {
                    System.out.println(product.getName());
                } else {
                    System.out.println("null");
                }
            }
            products = delete(products, 0);
            System.out.println("Новый массив: ");

            for (int i = 0; i < products.length; i++) {
                Product product = products[i];
                if (product != null) {
                    System.out.println(product.getName());
                } else {
                    System.out.println("null");
                }
            }

        }
    }

