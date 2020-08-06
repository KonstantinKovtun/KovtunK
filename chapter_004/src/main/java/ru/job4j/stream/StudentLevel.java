package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> st.getScore() > bound)
                .sorted((left, right) -> left.getScore() - right.getScore())
                .takeWhile(st -> st.getScore() > bound)
               // .flatMap(student -> )
                .collect(Collectors.toList());
    }
}
