package ru.job4j.sort;

import java.util.*;

public class SortUser implements Comparator<User> {

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

    public List<User> sortByAllFields(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                final int rs1 = o1.getName().compareTo(o2.getName());
                return rs1 != 0 ? rs1 : Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        return list;
    }

    @Override
    public int compare(User o1, User o2) {
        final int rs1 = o1.getName().compareTo(o2.getName());
        return rs1 != 0 ? rs1 : Integer.compare(o1.getAge(), o2.getAge());
    }
}
