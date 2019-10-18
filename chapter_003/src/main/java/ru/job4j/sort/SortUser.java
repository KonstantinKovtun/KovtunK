package ru.job4j.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {

    public Set<User> sort (List<User> list) {

        TreeSet<User>  tr = new TreeSet<>();

        for (User user : list) {
            tr.add(user);
        }

        return tr;
    }
}
