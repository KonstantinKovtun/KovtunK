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
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d|", i + 1);
        }
        System.out.printf("\n---|--|--|--|--|--|--|--|--|--|--|\n");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d |", i + 1);
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.printf("%2d|", array[i][j]);
            }
            System.out.printf("\n---|--|--|--|--|--|--|--|--|--|--|\n");
        }
        return array;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] ara = matrix.multiple(10);
        for (int i = 0; i < ara.length; i++) {
            for (int j = 0; j < ara.length; j++) {
                System.out.print(" " + ara[i][j]);
            }
            System.out.println();
        }
    }
}