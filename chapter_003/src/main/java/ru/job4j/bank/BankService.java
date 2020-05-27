package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            } else {
                System.out.println("Такой счет у пользователя уже есть");
            }
        } else {
            System.out.println("Пользователь не существует");
        }
    }

        public User findByPassport(String passport) {
        return users.keySet().stream().filter(user -> user.getPassport().equals(passport)).findFirst().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user).stream().filter(account -> account.getRequisite().equals(requisite)).findFirst().orElse(null);
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account valueDest = findByRequisite(destPassport, destRequisite);
        Account valueSrc = findByRequisite(srcPassport, srcRequisite);
        if ((valueSrc != null && valueDest != null) && (valueSrc.getBalance() >= amount)) {
        valueDest.setBalance(valueDest.getBalance() + amount);
        valueSrc.setBalance(valueSrc.getBalance() - amount);
        rsl = true;
        }
        return rsl;
    }
}