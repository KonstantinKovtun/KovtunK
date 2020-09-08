package ru.job4j.exam;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .map(pupil -> pupil.getSubjects().stream()
                        .mapToDouble(subject -> subject.getScore())
                .average()
                .orElse(0.))
                .mapToDouble(x -> x)
                .average()
                .orElse(0.);
//                .flatMap(pupil -> pupil.getSubjects().stream())
//                .mapToDouble(score -> score.getScore())
//                .average()
//                .orElse(0.);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.getName(), pupil.getSubjects().stream()
                        .mapToDouble(x -> x.getScore())
                        .average().orElse(0.)))
                .collect(Collectors.toList());
    }

//    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
//        return stream
//                .flatMap(pupil -> pupil.getSubjects().stream())
////                .collect(Collectors.groupingBy(o -> o.getScore()))
//                .collect(Collectors.groupingBy())
//                .entrySet()
//                .stream()
//                .map(k -> (Tuple) k.getValue())
//                .collect(Collectors.toList());
//
//    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
//        return stream
//                .map(pupil -> new Tuple(pupil.getName(), pupil.getSubjects().stream()
//                        .mapToDouble(x -> x.getScore())
//                        .sum()))
//                .filter((o1, o2) -> o1 > o2)
//                .forEach(System.out::print);
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}
