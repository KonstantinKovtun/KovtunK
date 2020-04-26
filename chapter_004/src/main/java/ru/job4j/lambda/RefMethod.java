package ru.job4j.lambda;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

/**
 * Class RefMethod. This class uses references on methods.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 26.04.2020
 */
public class RefMethod {
    public static void main(String[] args) {//Arrays.asList - convert array in to Collection
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
//        Consumer<String> out = (name) -> cutOut(name);
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }
    /**
     * Method cutOut. The method prints element when the conditions met.
     * @param value, input elements from List.
     */
    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
    }
}
