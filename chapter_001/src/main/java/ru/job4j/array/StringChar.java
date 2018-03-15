package ru.job4j.array;

import java.util.Arrays;
/**
 * Class StringChar searches an element in array by index.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StringChar {
    /**
     * back. Finds an element in array.
     * @param origin, name of array.
     * @param sub, name of array.
     * @return boolean.
     */
    boolean contains(String origin, String sub) {
        char[] chArrayOrigin = origin.toCharArray();
        char[] chArraySub = sub.toCharArray();
        int count = 0;

        for (int i = 0; i < chArrayOrigin.length; i++) {
            for (int j = 0; j < chArraySub.length; j++) {
                if (chArrayOrigin[i] == chArraySub[j]) {
                    if (chArraySub.length != j + 1) {
                        if (chArrayOrigin[i + 1] == chArraySub[j + 1]) {
                            count++;
                            break;
                        }
                    } else {
                        count++;
                        break;
                    }
                }
            }

            if (count == chArraySub.length) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String originStroka = "Приииивет люди, как там на Земле ?";
        String subStroka = "ивет";
        StringChar stringChar = new StringChar();
        System.out.println(stringChar.contains(originStroka, subStroka));
    }
}