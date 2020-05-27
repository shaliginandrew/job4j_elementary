package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
    return profiles.stream().map(Profile::getAddress).sorted(Comparator.comparing(Address::getCity)).distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Profiles profil = new Profiles();
        Profile profile1 = new Profile(new Address("Подольск", "Ревпроспект", 20, 36));
        Profile profile2 = new Profile(new Address("Климовск", "Заводская", 1, 10));
        Profile profile3 = new Profile(new Address("Климовск", "Заводская", 1, 10));
        Profile profile4 =  new Profile(new Address("Москва", "Проспект Вернадского", 2, 5));
        List<Profile> st = new ArrayList<>();
        st.add(profile1);
        st.add(profile2);
        st.add(profile3);
        st.add(profile4);
        List<Address> rsl = profil.collect(st);
        System.out.println(rsl);
    }
}

