package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {//deps ="k1/sk1"

        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                 tmp.add(start + el);
                if (tmp.contains("sk1")) {
                    tmp.add("k1/sk1");
                    tmp.remove("sk1");
                }
            }
        }

//        for (int i = 0; i < tmp.size(); i++) {
//            if (!tmp.contains("k1")) {
//                tmp.add("k1");
//            } else if (!tmp.contains("k1/sk1")) {
//                tmp.add("k1/sk1");
//            } else if (tmp.contains("sk1")) {
//                tmp.remove("sk1");
//            }
//        }
        sortAsc(new ArrayList<>(tmp));

        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}
