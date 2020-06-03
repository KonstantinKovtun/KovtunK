package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class StreamUsage. This class describes how we can filter data's.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{"
                    +
                    "name='" + name + '\''
                    +
                    ", spent=" + spent
                    +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>(
                Arrays.asList(
                        new Task("Bug #1", 100),
                        new Task("Task #2", 100),
                        new Task("Bug #3", 100)
                ));
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}
