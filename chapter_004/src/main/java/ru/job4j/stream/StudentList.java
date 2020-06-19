package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentList {

    public static Map<String, Student> sortMap(List<Student> list) {
        Map<String, Student> map;
        map = list.stream().collect(toMap(
                e -> e.getSurname(),
                e -> e,
                (s, a) -> s)
        );

        return map;
    }

//    public static void main(String[] args) {
//        List<Student> list = new ArrayList<>(
//                Arrays.asList(
//                        new Student(85, "Pavel"),
//                        new Student(100, "Ivan"),
//                        new Student(79, "Vlad"),
//                        new Student(19, "Vika")
//                ));
//
//        Map<String, Student> map = sortMap(list);
//
//        for (Map.Entry<String, Student> entry : map.entrySet()) {
//            String key = entry.getKey();
//            Student value = entry.getValue();
//            System.out.println("key = " + key + " value = " + value);
//        }
//    }
}
