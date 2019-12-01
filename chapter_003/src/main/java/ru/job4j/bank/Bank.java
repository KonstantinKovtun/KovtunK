package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    Map<User, List<Account>> users;

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(User user) {
/*
        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().equals(user)) {
                this.users.remove(user);
            }
        }
*/
       this.users.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        this.users = new HashMap<User, List<Account>>();
        User user1 = new User("Tommy", "TFG888888");
        List<Account> list = new ArrayList<>();
        list.add(account);
        users.put(user1, list);
        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                entry.setValue(list);
            }
        }
    }

    public List<Account> getUserAccounts(String passport) {
        this.users = new HashMap<User, List<Account>>();
        User user1 = new User("Mickey", "ME451296");
        List<Account> list = new ArrayList<>();
        list.add(new Account(800, "UAH525dh"));
        users.put(user1, list);

        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void deleteAccountFromUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport) && entry.getValue().equals(account)) {
                this.users.remove(account);
            }
        }
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        return false;
    }
}