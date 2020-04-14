package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {

        HashSet<String> tmp = new HashSet<>();
        String name = "";

        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
               // start = start.isBlank() ? el : start + "/" + el;
                 //tmp.add(start + el);
                tmp.add(start);
            }
        }

        for (int i = 0; i < tmp.size(); i++) {
            if (!tmp.contains("k1")) {
                tmp.add("k1");
            } else if (!tmp.contains("k1/sk1")) {
                tmp.add("k1/sk1");
            } else if (tmp.contains("sk1")) {
                tmp.remove("sk1");
            }
        }
        sortAsc(new ArrayList<>(tmp));

        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}
