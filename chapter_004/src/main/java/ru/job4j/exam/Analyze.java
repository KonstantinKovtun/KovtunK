package ru.job4j.exam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .map(pupil -> pupil.getSubjects())
                .flatMap(score -> score.stream())
                .mapToDouble(score -> score.getScore())
                .average()
                .orElse(0.);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(pupil -> pupil.getSubjects())
                .mapToDouble(score -> score.getScore())
                .
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return List.of();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}
