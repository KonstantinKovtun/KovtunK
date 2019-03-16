package ru.job4j.singleton;

/**
 * Class TrackerSingleThird checks how the singleton works.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class TrackerSingleThird {

    /**
     * A variable INSTANCE.
     */
    private static final TrackerSingleThird INSTANCE = new TrackerSingleThird();

    /**
     * The constructor, constructs the object.
     */
    private TrackerSingleThird() {
    }

    /**
     * A method which returns the object go TrackerSingleThird class.
     * @return TrackerSingleThird object.
     */
    public static TrackerSingleThird getInstance() {
        return INSTANCE;
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        TrackerSingleThird tracker = TrackerSingleThird.getInstance();
    }
}