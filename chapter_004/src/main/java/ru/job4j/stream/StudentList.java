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

        Map<String, Student> map;
        map = list.stream()
                .distinct()
                .collect(Collectors.toMap(e -> e.getSurname(), e -> e));

        for (Map.Entry<String, Student> entry : map.entrySet()) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("key = " + key + " value = " + value);
        }
    }
}
