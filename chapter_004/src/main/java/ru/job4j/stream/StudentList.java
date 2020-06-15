package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(
                Arrays.asList(
                        new Student(85, "Pavel"),
                        new Student(100, "Ivan"),
                        new Student(79, "Vlad"),
                        new Student(19, "Vika")
                ));

//        System.out.println(
//                List.of(new Student(85, "Pavel").getSurname(), new Student(85, "Pavel"),
//                        new Student(100, "Ivan").getSurname(), new Student(100, "Ivan"))
//                        .stream().distinct().collect(
//                        Collectors.toMap(
//                                e -> e,
//                                e -> e
//                        ))
//        );
//        Map<String, Class<Student>> map;
//        map = list.stream().
//                collect(Collectors.toMap(Student::getSurname, ));

//        for (Student st : list) {
//            st
//        }
    }
}
