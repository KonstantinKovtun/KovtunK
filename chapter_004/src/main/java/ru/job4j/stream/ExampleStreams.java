package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Class ExampleStreams. This class explains how to work with streams.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 26.06.2020
 */
public class ExampleStreams {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(
                Arrays.asList(
                        new Student(85, "Pavel"),
                        new Student(100, "Ivan"),
                        new Student(79, "Vlad")
                ));
        System.out.println("args = " + Arrays.deepToString(args));
//        List<Student> result = list.stream().collect(toList()); // the same
        List<Student> result = list.stream().collect(Collectors.toList()); // the same
        result.forEach(System.out::println);
        result.forEach(x -> System.out.println());
        result.forEach(x -> System.out.println(x));

        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
        System.out.println();
        System.out.println();
        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .filter(s -> {
                    System.out.println("Фильтр: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("Печать с использованием forEach: " + s));
        List<String> lists = Stream.of("qw", "er", "ty", "uirer")
                .filter(s -> s.length() <= 2)
                .collect(Collectors.toList());

        IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::println);
    }
}