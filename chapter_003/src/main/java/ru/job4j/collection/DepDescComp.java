package ru.job4j.collection;

import java.util.Comparator;

/**
 * Test class DepDescComp.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 10.04.2020
 */
public class DepDescComp implements Comparator<String> {

    /**
     * Method compare. The method compare two input objects for its sorting.
     * @param o1, the first object for sorting.
     * @param o2, the second object for sorting.
     * @return result, a decimal result of sorting.
     */
    @Override
    public int compare(String o1, String o2) {
        String[] deps1 = o1.split("/");
        String[] deps2 = o2.split("/");
        int result = deps2[0].compareTo(deps1[0]);
        return result != 0 ? result : o1.compareTo(o2);
    }
}