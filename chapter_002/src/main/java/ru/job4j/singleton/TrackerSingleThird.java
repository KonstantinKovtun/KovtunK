package ru.job4j.singleton;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Random;

/**
 * Class TrackerSingleThird checks how the singleton works.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class TrackerSingleThird {

    /**
     * The constructor, constructs the object.
     * @return only one object.
     */
    private TrackerSingleThird() {
    }

    /**
     * A method which returns the object go TrackerSingleThird class.
     * @return item, return an array of item.
     */
    public static TrackerSingleThird getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * Class Holder.
     */
    private static final class Holder {
        private static final TrackerSingleThird INSTANCE = new TrackerSingleThird();
    }

    public Item add(Item model) {
        return model;
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        TrackerSingleThird tracker = TrackerSingleThird.getInstance();
    }
}