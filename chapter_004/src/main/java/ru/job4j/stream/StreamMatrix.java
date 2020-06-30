package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6),
                List.of(7, 8)
        );

        System.out.println(matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList()));

        Integer[][] ara = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        Stream.of(ara).flatMap(e -> Arrays.stream(e)).collect(Collectors.toList());
    };
}
