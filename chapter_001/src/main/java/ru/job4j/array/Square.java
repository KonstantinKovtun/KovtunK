package ru.job4j.array;

import java.util.Arrays;

/**
 * Square fills the array with numbers in squared.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Square {
    /**
     * Calculate. Fills the array with numbers in squared.
     * @param bound, bound index of array.
     * @return rst.
     */
    public int[] calculate(int bound) {

        int[] rst = new int[bound];

        for (int i = 1; i <= rst.length; i++) {
            rst[i - 1] = i * i;
        }

        return rst;
    }

    public static void main(String[] args) {
        final int COUNT = 5;
        Square square = new Square();

        System.out.println("Array : " + Arrays.toString(square.calculate(COUNT)));
    }
}