package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void addAccount() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        bank.addAccount(user.get().getPassport(), new Account("113", 50D));
        bank.transferMoney(user.get().getPassport(), "5546", user.get().getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.get().getPassport(), "113").getBalance(), is(200D));
    }
    @Test
    public void transferMoney2() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        Optional<User> user2 = Optional.of(new User("4606", "Andrey Shalygin"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addUser(user2.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        bank.addAccount(user2.get().getPassport(), new Account("113", 50D));
        bank.transferMoney(user.get().getPassport(), "5546", user2.get().getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user2.get().getPassport(), "113").getBalance(), is(200D));
    }
}