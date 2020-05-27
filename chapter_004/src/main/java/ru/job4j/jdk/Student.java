package ru.job4j.jdk;


public class Student implements Comparable<Student> {

    private String name;
    private int scope;

    public Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(scope, o.scope);
    }
}
