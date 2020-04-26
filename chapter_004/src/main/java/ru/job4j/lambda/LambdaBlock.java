package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class LambdaBlock sort elements of array by and sizes.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 26.04.2020
 */
public class LambdaBlock {
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
        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("compare - " + right.getSize() + " : " + left.getSize());
            return right.getSize() - left.getSize();
        };

        Arrays.sort(atts, comparator);
        System.out.println(Arrays.toString(atts));
    }
}
