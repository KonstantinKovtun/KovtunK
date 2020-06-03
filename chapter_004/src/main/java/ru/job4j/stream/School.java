package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class School. This class describes how we can filter data's.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class School {
    /**
     * Method collect.
     * @return list of the Current Students.
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {

        List<Student> list = students.stream().filter(predict).collect(Collectors.toList());

//        for (Student att : students) {
//            if (predict.test(att)) {
//                list.add(att);
//            }
//        }
        list.forEach(System.out::print);

        return list;
    }
}
