package ru.job4j.sort;

import java.util.*;

public class SortUser {

    public Set<User> sort(List<User> list) {

        TreeSet<User> tr = new TreeSet<>();

        for (User user : list) {
            tr.add(user);
        }

        return tr;
    }

    public List<User> sortNameLength(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });

        return list;
    }

//    public List<User> sortByAllFields(List<User>) {
//
//    }
}
