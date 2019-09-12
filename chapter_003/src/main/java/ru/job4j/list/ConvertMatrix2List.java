package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {

        List<Integer> list = new ArrayList<>();
        int index = 0;
        int indexrow = 0;

        for (int[] i : array) {
            for (int j : i) {
                list.add(new Integer(array[index][indexrow++]));
                if (indexrow == array.length) {
                    indexrow = 0;
                    index++;
                    break;
                }
            }
        }
        return list;
    }
}