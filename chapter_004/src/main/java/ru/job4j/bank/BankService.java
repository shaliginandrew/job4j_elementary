package ru.job4j.bank;

import java.util.*;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
            } else {
                System.out.println("Такой счет у пользователя уже есть");
            }
        } else {
            System.out.println("Пользователь не существует");
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> result = Optional.empty();
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                result = Optional.of(key);
                break;
            }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            for (Account value : list) {
                if (value.getRequisite().equals(requisite)) {
                    result = value;
                    break;
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account valueDest = findByRequisite(destPassport, destRequisite);
        Account valueSrc = findByRequisite(srcPassport, srcRequisite);
        if (valueSrc.getBalance() >= amount && valueSrc != null && valueDest != null) {
            valueDest.setBalance(valueDest.getBalance() + amount);
            valueSrc.setBalance(valueSrc.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.addUser(new User("321", "Petr Arsentev"));
        Optional<User> opt = bank.findByPassport("3211");
        if (opt.isPresent()) {
            System.out.println(opt.get().getUsername());
        }
    }
}