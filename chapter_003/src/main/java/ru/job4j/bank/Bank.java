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
        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                this.users.get(entry).add(account);
            }
        }
    }

    public List<Account> getUserAccounts(String passport) {
        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                return this.users.get(entry.getValue());
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