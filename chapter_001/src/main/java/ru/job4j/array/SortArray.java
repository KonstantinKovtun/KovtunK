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
     */
    public int[] insertElements(int[] array1, int[] array2) {
        int[] ara3 = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, ara3, 0, array1.length);
        System.arraycopy(array2, 0, ara3, ara3.length / 2, array2.length);
        return ara3;
    }
    public static void main(String[] args) {
 /*
        int[] ara1 = {4, -2, 0};
        int[] ara2 = {5, -1, 28, -100};
*/
        int[] ara1 = {1, 2};
        int[] ara2 = {3, 4};

        SortArray sortArray = new SortArray();

        System.out.println(Arrays.toString(sortArray.insertElements(ara1, ara2)));
    }
}