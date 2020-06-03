package ru.job4j.stream;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolTest {
    /**
     * Test whenInputOneGroupOutputThreeGroups100.
     */
    @Test
    public void whenInputOneGroupOutputThreeGroups100() {
        List<Student> list = new ArrayList<>(
                Arrays.asList(
                        new Student(85, "Pavel"),
                        new Student(100, "Ivan"),
                        new Student(79, "Vlad")
                ));
        School school = new School();
        List<Student> result = school.collect(list, x -> x.getScore() > 70 & x.getScore() < 100);
        List<Student> expected = Arrays.asList(
                new Student(85, "Pavel"),
                new Student(79, "Vlad")
        );
        assertThat(result, is(expected));
    }
    /**
     * Test whenInputOneGroupOutputThreeGroups70.
     */
    @Test
    public void whenInputOneGroupOutputThreeGroups70() {
        List<Student> list = new ArrayList<>(
                Arrays.asList(
                        new Student(51, "Pavel"),
                        new Student(100, "Ivan"),
                        new Student(69, "Vlad")
                ));
        School school = new School();
        List<Student> result = school.collect(list, x -> x.getScore() > 50 & x.getScore() < 70);
        List<Student> expected =                 Arrays.asList(
                new Student(51, "Pavel"),
                new Student(69, "Vlad")
        );
        assertThat(result, is(expected));
    }
    /**
     * Test whenInputOneGroupOutputThreeGroups50.
     */
    @Test
    public void whenInputOneGroupOutputThreeGroups50() {
        List<Student> list = new ArrayList<>(
                Arrays.asList(
                        new Student(85, "Pavel"),
                        new Student(10, "Ivan"),
                        new Student(19, "Vlad")
                ));
        School school = new School();
        List<Student> result = school.collect(list, x -> x.getScore() > 0 & x.getScore() < 50);
        List<Student> expected =                 Arrays.asList(
                new Student(10, "Ivan"),
                new Student(19, "Vlad")
        );
        assertThat(result, is(expected));
    }
}
