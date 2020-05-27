package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public void printAll() {
        for (Map.Entry<String, Citizen> entry : citizens.entrySet()) {
            String key = entry.getKey();
            Citizen value = entry.getValue();
            System.out.println(key + " = " + value.getUsername());
        }
    }

    public Citizen get(String passport) {
        System.out.println("Информация по паспорту " + passport + " : " + citizens.get(passport).getUsername());
        return citizens.get(passport);
    }

    public static void main(String[] args) {
        PassportOffice office = new PassportOffice();
        Citizen citizen1 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2543", "Andrey Shalygin");
        Citizen citizen3 = new Citizen("2543", "Masha");
        office.add(citizen1);
        office.add(citizen2);
        office.add(citizen3);
        office.printAll();
        office.get("2543");
    }
}