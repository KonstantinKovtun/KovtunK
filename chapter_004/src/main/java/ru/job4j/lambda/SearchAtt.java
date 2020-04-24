package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Class SearchAtt shows how to use Predicate interface with some input arguments.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SearchAtt {
    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getSize() > 100) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getName().contains("bug")) {
                rsl.add(att);
            }
        }
        return rsl;
    }
    /**
     * Method filter. The method filters element by using some condition.
     * @param list, input elements from List.
     * @param predicate, input elements from interface Predicate.
     * @return rsl, returns filtered elements in List.
     */
    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();

        for (Attachment att : list) {
            if (predicate.test(att)) {
                rsl.add(att);
            }
        }

        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> list = Arrays.asList(
                new Attachment("Name3", 300),
                new Attachment("bug", 200),
                new Attachment("bug", 500)
        );

        System.out.println(filter(list, x -> x.getSize() > 100 & x.getName().equals("bug")));
//        Predicate<Integer> negative = i -> i < 0;
//        System.out.println(negative.test(-6));
//        System.out.println(negative.test(6));
//        System.out.println(negative.test(0));
//        System.out.println("-----------");
//        Predicate<String> kk = i -> i .equals("1");
//        System.out.println(kk.test(Integer.toString(1)));
//        System.out.println(kk.test("1"));
//        System.out.println(kk.test("0"));
    }
}
