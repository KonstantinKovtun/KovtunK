package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate sorts array elements.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * Checks that the word begins with a prefix.
     * @param array input array.
     * @return array without duplicate.
     */
    public String[] remove(String[] array) {
        int count = array.length;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[count - 1];
                    count--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, count);
    }
}