package ru.job4j.singleton;

/**
 * Enum TrackerSingleFirst checks how the singleton works.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public enum TrackerSingleFirst {
    INSTANCE;

    TrackerSingleFirst() {
    }

    public static void main(String[] args) {
        TrackerSingleFirst tracker = TrackerSingleFirst.INSTANCE;
    }
}
