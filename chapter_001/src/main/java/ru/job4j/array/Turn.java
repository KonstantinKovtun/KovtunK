package ru.job4j.array;

import java.util.Arrays;
/**
 * Class Turn searches an element in array by index.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /**
     * back. Finds an element in array.
     * @param array, name of array.
     * @return array.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5};
        Turn turn = new Turn();
        System.out.println("Array : " + Arrays.toString(turn.back(mass)));
    }
}