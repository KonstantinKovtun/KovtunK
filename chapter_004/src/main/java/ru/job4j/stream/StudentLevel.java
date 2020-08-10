package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> !st.equals(null))
//                .sorted(Comparator.nullsLast((o1, o2) -> o1.getScore() - o2.getScore()))
                .sorted(Comparator.comparing(Student::getScore))
                .takeWhile(st -> st.getScore() > bound)
                .flatMap(Stream::ofNullable)
                .collect(Collectors.toList());
    }
}
