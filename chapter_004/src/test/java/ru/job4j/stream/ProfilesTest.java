package ru.job4j.stream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void valueTest() {
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
        List<Address> expected = List.of(new Address("Климовск", "Заводская", 1, 10),
                new Address("Москва", "Проспект Вернадского", 2, 5),
                new Address("Подольск", "Ревпроспект", 20, 36)
        );
        assertThat(rsl, is(expected));
    }
}
