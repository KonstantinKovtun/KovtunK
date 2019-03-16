package ru.job4j.singleton;

/**
 * Class TrackerSingleSecond checks how the singleton works.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class TrackerSingleSecond {

    /**
     * A variable instance.
     */
    private static TrackerSingleSecond instance;

    /**
     * The constructor, constructs the object.
     */
    private TrackerSingleSecond() {
    }

    /**
     * getInstance.
     * @return only one object .
     */
    public static TrackerSingleSecond getInstance() {
        if (instance == null) {
            instance = new TrackerSingleSecond();
        }
        return instance;
    }

    public static void main(String[] args) {
        TrackerSingleSecond tracker = TrackerSingleSecond.getInstance();
    }
}