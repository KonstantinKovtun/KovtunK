package ru.job4j.singleton;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Random;

/**
 * Class TrackerSingleFourth checks how the singleton works.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class TrackerSingleFourth {

    /**
     * The constructor, constructs the object.
     * @return only one object.
     */
    private TrackerSingleFourth() {
    }

    /**
     * A method which returns the object go TrackerSingleFirst class.
     * @return item, return an array of item.
     */
    public static TrackerSingleFourth getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * Class Holder.
     */
    private static final class Holder {
        private static final TrackerSingleFourth INSTANCE = new TrackerSingleFourth();
    }

    public Item add(Item model) {
        return model;
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        TrackerSingleFourth tracker = TrackerSingleFourth.getInstance();
    }
}