package ru.job4j.collection;

import java.util.*;

/**
 * Test class Departments.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 10.04.2020
 */
public class Departments {

    /**
     * Method fillGaps. The method prepares a List for sorting.
     * @param deps, name of the List.
     * @return list, sorted List.
     */
    public static List<String> fillGaps(List<String> deps) {

        HashSet<String> tmp = new HashSet<>();

        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = start.isBlank() ? el : start + "/" + el;
                tmp.add(start);
            }
        }

        List<String> list = new ArrayList<>(tmp);

        sortAsc(list);

        return (list);
    }

    /**
     * Method sortAsc. The method sorts a List in ascending order.
     * @param orgs, name of the List.
     */
    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
    }

    /**
     * Method sortDesc. The method sorts a List in descending order.
     * @param orgs, name of the List.
     */
    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}