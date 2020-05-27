package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Гаврила Петрович");
        student.setGroupId(25);
        student.setData("01.09.2005");
        System.out.println("Студент: " + student.getFio() + System.lineSeparator() + "Группа: " + student.getGroupId() + System.lineSeparator() + "Дата поступления: " + student.getData());
    }
}
