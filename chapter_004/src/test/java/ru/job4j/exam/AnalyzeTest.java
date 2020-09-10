package ru.job4j.exam;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.util.List;

public class AnalyzeTest {
    @Test
    public void whenSinglePupil() {
        double average = Analyze.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100)))
                ).stream()
        );
        assertThat(average, is(100D));
    }

    @Test
    public void whenPupilAverage() {
        double average = Analyze.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60)))
                ).stream()
        );
        assertThat(average, is(80D));
    }

//    @Test
//    public void whenPupilAverageAndMoreThenOneSubject() {
//        double average = Analyze.averageScore(
//                List.of(
//                        new Pupil("Ivanov", List.of(new Subject("Math", 100),
//                                new Subject("English", 80))),
//                        new Pupil("Petrov", List.of(new Subject("Math", 60)))
//                ).stream()
//        );
//        assertThat(average, is(75D));
//    }

    @Test
    public void whenListOfPupilAverage() {
        List<Tuple> average = Analyze.averageScoreBySubject(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 70), new Subject("Lang", 30))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60), new Subject("Lang", 40)))
                ).stream()
        );
        assertThat(average, is(List.of(
                new Tuple("Ivanov", 50D),
                new Tuple("Petrov", 50D)
        )));
    }

    @Test
    public void whenListOfSubjectAverage() {
        List<Tuple> average = Analyze.averageScoreByPupil(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100), new Subject("Lang", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60), new Subject("Lang", 60)))
                ).stream()
        );
        assertThat(average, is(List.of(
                new Tuple("Math", 80D),
                new Tuple("Lang", 80D)
        )));
    }

    @Test
    public void whenBestPupil() {
        Tuple best = Analyze.bestStudent(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100), new Subject("Lang", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60), new Subject("Lang", 60)))
                ).stream()
        );
        assertThat(best, is(new Tuple("Ivanov", 200D)));
    }

    @Test
    public void whenBestSubject() {
        Tuple best = Analyze.bestSubject(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100), new Subject("Lang", 40))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60), new Subject("Lang", 60)))
                ).stream()
        );
        assertThat(best, is(new Tuple("Math", 160D)));
    }
}
