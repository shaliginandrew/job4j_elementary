package ru.job4j.profession;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName() {
     return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getbirthday() {
       return birthday;
    }

    public static void main(String[] args) {
        Profession profession = new Profession();
        Doctor doctor = new Doctor();
        Engineer engineer = new Engineer();
        Dentist dentist = new Dentist();
        Surgeon surgeon = new Surgeon();
        Programmer programmer = new Programmer();
        Builder builder = new Builder();
        Pacient pacient = new Pacient();
    }
}
