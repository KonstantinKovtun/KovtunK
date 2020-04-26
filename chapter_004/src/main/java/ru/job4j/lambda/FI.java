package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class FI sort elements of array in difference ways by names and sizes.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 26.04.2020
 */
public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };

//        Comparator<Attachment> comparator = new Comparator<Attachment>() {
//            @Override
//            public int compare(Attachment left, Attachment right) {
//                return left.getSize() - right.getSize();
//            }
//        };

        Comparator<Attachment> cmpText = (left, right) -> left.getName().compareTo(right.getName());
        Comparator<Attachment> cmpDescSize = (left, right) -> right.getSize() - left.getSize();

        Arrays.sort(atts, cmpText);
        System.out.println(Arrays.toString(atts));
        Arrays.sort(atts, cmpDescSize);
        System.out.println(Arrays.toString(atts));
    }
}
