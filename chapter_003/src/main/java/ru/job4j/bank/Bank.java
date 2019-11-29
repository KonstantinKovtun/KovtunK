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
        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().equals(user)) {
                this.users.remove(user);
            }
        }
    }

    public void addAccountToUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().getpassport().equals(passport)) {
                this.users.get(entry).add(account);
            }
        }
    }
}
