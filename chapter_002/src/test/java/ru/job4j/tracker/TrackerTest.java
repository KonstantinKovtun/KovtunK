package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class TrackerTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class TrackerTest {
    /**
     * Test whenFillArrayElementsInSquare.
     */
    @Test
    public void whenFindArrayElementsNameInTracker() {
        Tracker tracker = new Tracker();
        tracker.findByName();
        int[] result = square.calculate(5);
        int[] expected = {1, 4, 9, 16, 25};
        assertThat(result, is(expected));
    }
}
