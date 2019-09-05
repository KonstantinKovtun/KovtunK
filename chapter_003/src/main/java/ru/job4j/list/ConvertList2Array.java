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
        int index = 0;
        int j = 0;

        for (Integer i : list) {
            array[index][j++] = list.get(indexOfNewList++);
            if (j == array.length) {
                j = 0;
                index++;
            }
        }
        return array;
    }
 }