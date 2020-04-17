package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
//        String str1 ="";
//        String str2 = "";
//        for (String value : deps) {
//            String start = "";
//            for (String el : value.split("/")) {
//                start = start.isBlank() ? el : start + "/" + el;
//                tmp.add(start);
//            }
//        }

        return o1.compareTo(o2);
    }
}
