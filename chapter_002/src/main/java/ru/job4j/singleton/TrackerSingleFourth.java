package ru.job4j.singleton;

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
     */
    private TrackerSingleFourth() {
    }

    /**
     * A method which returns the object of the TrackerSingleFirst class.
     * @return only one object.
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

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        TrackerSingleFourth tracker = TrackerSingleFourth.getInstance();
    }
}