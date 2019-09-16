package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;


/**
 * Class ConvertMatrix2List. This class describes behavior of returning array in List.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ConvertMatrix2List {

    /**
     * Method toList. The method returns the array of List.
     * @param array contains the two arrays.
     * @return the List with elements.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();

        for (int[] i : array) {
            for (int j : i) {
                list.add(j);
            }
        }
        return list;
    }
}