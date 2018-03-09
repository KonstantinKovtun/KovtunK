package ru.job4j.array;

import java.util.Arrays;

/**
 * Class Matrix creates a multiplication table.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Matrix {
    /**
     * multiple. Create a table.
     * @param size, size of array.
     * @return an array which shows a table.
     */
    public int[][] multiple(int size) {
        int[][] array = new int[size][size];
        System.out.printf(" * |");
        for (int i = 1; i < array.length; i++) {
            System.out.printf("%2d|", i);
        }
        System.out.printf("\n---|--|--|--|--|--|--|--|--|--|\n");
        for (int i = 1; i < array.length; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j < array.length; j++) {
                System.out.printf("%2d|", array[i][j] = i * j);
            }
            System.out.printf("\n---|--|--|--|--|--|--|--|--|--|\n");
        }
        return array;
    }
    public String toString(int[][] mass) {
        return "";
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.multiple(10);
    }
}