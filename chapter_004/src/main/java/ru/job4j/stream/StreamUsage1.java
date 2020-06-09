package ru.job4j.stream;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Class StreamUsage1. This class describes how we can filter data's.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 09.06.2020
 */
public class StreamUsage1 {
    /**
     * Class StreamUsage1. This class describes how we can filter data's.
     * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
     * @version $Id$
     * @since 09.06.2020
     */
    public static class Task {
        /**
         * Contains the name of the bug.
         */
        private final String name;
        /**
         * Contains the value of the time.
         */
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>(
                Arrays.asList(
                new Task("Bug #1", 10),
                new Task("Task #2", 20),
                new Task("Bug #3", 40)
        ));
        tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spent > 30)
                .map(task -> task.name + " " + task.spent)
                .forEach(System.out::println);
    }
}
