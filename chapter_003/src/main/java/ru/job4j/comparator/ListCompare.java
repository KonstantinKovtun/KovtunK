package ru.job4j.comparator;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int size = left.length() > right.length() ? left.length() : right.length();

        char[] charsLeft = left.toCharArray();
        char[] charsRight = right.toCharArray();

        int result = 0;

        for (int i = 0; i < size; i++) {
            result = Character.compare(charsLeft[i], charsRight[i]);
            if (result != 0) {
                break;
            }
        }

        return result;
    }
}
