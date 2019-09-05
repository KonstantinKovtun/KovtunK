package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ConvertList2Array. This class describes behavior of ConvertList2Array.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ConvertList2Array {

    /**
     * Method toArray. The method returns the array from list.
     * @param list contains the number of elements.
     * @param rows contain rows of array.
     * @return the array.
     */
    public int[][] toArray(List<Integer> list, int rows) {

        int sizeOfList = list.size();
        while (sizeOfList % rows != 0) {
            sizeOfList++;
        }

        int cells = sizeOfList / rows;
        int[][] array = new int[rows][cells];
        int indexOfNewList = 0;

        for (int[] i : array) {
            int index = 0;
            for (int j : i) {
                if (indexOfNewList < list.size()) {
                    i[index++] = list.get(indexOfNewList++);
                }
            }
        }
        return array;
    }
}