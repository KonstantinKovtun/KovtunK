package ru.job4j.singleton;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Random;

/**
 * Class TrackerSingleFirst checks how the singleton works.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class TrackerSingleSecond {

    /**
     * The constructor, constructs the object.
     * @return only one object.
     */
    private TrackerSingleSecond() {
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        TrackerSingleSecond tracker;
    }
}