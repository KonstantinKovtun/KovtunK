package ru.job4j.stream;

import org.w3c.dom.ls.LSOutput;
import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeMap {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(21, "Andrew"),
                new Student(25, "Andrew"),
                new Student(19, "Anna"),
                new Student(24, "Anna"),
                new Student(28, "Maria"),
                new Student(18, "Maria")
        );

        Map<String, Student> map = list.stream()
                .collect(Collectors.toMap(
                        p -> p.getSurname(), /*тут пишем что использовать в качестве ключа*/
                        p -> p, /*тут пишем что использовать в качестве значения*/
                        (first, second) -> second)/*тут пишем какое значение использовать при дулблировании
                        от первого ключа или от второго*/
                );
        System.out.println(map);
    }
}
