package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Class ListCompare compares two char arrays by every symbol.
 *
 * @author Konstantin
 * @version $Id$
 * @since 0.1
 */
public class ListCompare implements Comparator<String> {
    /**
     * A method which compares two char arrays.
     *
     * compare.
     * @param left, item value.
     * @param right, item value.
     * @return result, a numeric of comparing.
     */
    @Override
    public int compare(String left, String right) {
        int result = left.length() - right.length();
        int size = Math.min(left.length(), right.length());
        char[] charsLeft = left.toCharArray();
        char[] charsRight = right.toCharArray();

        for (int i = 0; i < size && result == 0; i++) {
            result = Character.compare(charsLeft[i], charsRight[i]);
        }
        return result;
    }
}
