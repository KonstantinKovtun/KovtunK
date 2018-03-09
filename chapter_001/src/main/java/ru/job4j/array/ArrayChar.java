package ru.job4j.array;

import java.util.Arrays;

/**
 * Class BubbleSort sorts array elements.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {
    /**
     * An array of characters.
     */
    private char[] data;

    /**
     * ArrayChar method. This method converts a string in array of characters.
     * @param line string.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Checks that the word begins with a prefix.
     * @param prefix prefix.
     * @return if the word begins with a prefix
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        System.out.println(Arrays.toString(value));
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                System.out.println(data[i]);
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayChar arrayChar = new ArrayChar("Hello Man, are you ready?");
        arrayChar.startWith("Hello Men");
    }
}