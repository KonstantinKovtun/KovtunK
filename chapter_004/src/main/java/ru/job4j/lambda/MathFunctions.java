package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Class MathFunctions. This class count functions in the range.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 26.04.2020
 */
public class MathFunctions {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();

        for (int i = start; i < end; i++) {
            list.add(func.apply((double) i));
        }
        return list;
    }
}
