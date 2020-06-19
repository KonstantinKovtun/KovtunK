package ru.job4j.stream;

import java.util.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentListTest {
    /**
     * Test whenInputListOutPutMap.
     */
    @Test
    public void whenInputListOutPutMap() {
        StudentList studentList = new StudentList();
        List<Student> list = new ArrayList<>(
                Arrays.asList(
                        new Student(85, "Pavel"),
                        new Student(100, "Ivan"),
                        new Student(79, "Vlad"),
                        new Student(79, "Vlad"),
                        new Student(19, "Vika"),
                        new Student(19, "Vika")
                ));

        Map<String, Student> result = studentList.sortMap(list);

        Map<String, Student> expected = new HashMap<>(Map.of(
                "Pavel", new Student(85, "Pavel"),
                "Ivan", new Student(100, "Ivan"),
                "Vlad", new Student(79, "Vlad"),
                "Vika", new Student(19, "Vika")
        ));
        assertThat(result, is(expected));
    }
}
