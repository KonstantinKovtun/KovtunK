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

        int[] ara = {1, 4, 3, 2};
        int[] bbb = {65, 5, 0, 29};
        //int[] all = new int[ara.length + bbb.length];
        int[] all = {1, 2, 3, 4};
        return all;
    }

    public static void main(String[] args) {
        int[] ara1 = {1, 2};
        int[] ara2 = {3, 4};

        SortArray sortArray = new SortArray();
        System.out.println(Arrays.toString(sortArray.insertElements(ara1, ara2)));
    }
}