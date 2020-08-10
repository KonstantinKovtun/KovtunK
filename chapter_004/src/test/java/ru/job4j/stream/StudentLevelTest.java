package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentLevelTest {
    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(128, "Pert"));
        input.add(new Student(28, "Masha"));
        List<Student> expected = List.of(
                new Student(28, "Masha"),
                new Student(128, "Pert")
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(500, "Kenshi"));
        input.add(new Student(315, "Kenanobi"));
        List<Student> expected = List.of(
                new Student(315, "Kenanobi"),
                new Student(500, "Kenshi")
        );
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
//        List<Student> input = new ArrayList<>();
//        input.add( null);
//        input.add(new Student("Pety",28));
//        List<Student> expected = List.of(new Student("Pety",28));
//        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }
}
