package ru.job4j.array;

import java.util.Arrays;
/**
 * Class SortArray creates new array and then sort it.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SortArray {
    /**
     * insertElements. Fill the elements of array.
     * @param array1, name of array.
     * @param array2, name of array.
     * @return all return sorted array.
     */
    public int[] insertElements(int[] array1, int[] array2) {

        int[] all = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, all, 0, array1.length);
        System.arraycopy(array2, 0, all, array1.length, array2.length);

        return all;
    }

    public static void main(String[] args) {
        int[] ara1 = {7, 6};
        int[] ara2 = {0, 3};

        SortArray sortArray = new SortArray();
        System.out.println(Arrays.toString(sortArray.insertElements(ara1, ara2)));
    }
}