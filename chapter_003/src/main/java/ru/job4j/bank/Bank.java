package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    Map<User, List<Account>> users;

    public void addUser(User user) {
//        Account account = new Account(800, "MХ221144");
        this.users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void deleteUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());

        for (Map.Entry<User, List<Account>> entry : this.users.entrySet()) {
            if (entry.getKey().equals(user)) {
                this.users.remove(user);
            }
        }
    }
}
