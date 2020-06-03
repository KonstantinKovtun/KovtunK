package ru.job4j.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Class ClassForTests. This class uses for testing programs.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 01.06.2020
 */
public class ClassForTests {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // return string : 5 долларов
        System.out.println();
        System.out.println();

//        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<Integer> isPositive = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 0) {
                    return true;
                }
                return false;
            }
        };
        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false
    }
}
