package ru.job4j.array;

import java.util.Arrays;
/**
 * Class FindLoop searches an element in array by index.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class FindLoop {
    /**
     * indexOf. Finds an element in array.
     * @param data, name of array.
     * @param element, element in array which we search.
     * @return rst.
     */
    public int indexOf(int[] data, int element) {
        int rst = -1; // if there is no element in the array, then -1 is returned.

        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        final int COUNT = 45;
        int[] mass = {11, 23, 24, 45, 0, 33, 28};
        FindLoop findLoop = new FindLoop();
        System.out.println("Array : " + (findLoop.indexOf(mass, COUNT)));
    }
}