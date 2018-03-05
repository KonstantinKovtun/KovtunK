package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class FindLoopTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class FindLoopTest {
    /**
     * Test whenFindsYourIndexInArray.
     */
    @Test
    public void whenFindsYourIndexInArray() {
        FindLoop findLoop = new FindLoop();
        int[] array = {11, 23, 24, 45, 0, 33, 28};
        int result = findLoop.indexOf(array, 28);
        int expected = 6;
        assertThat(result, is(expected));
    }

    /**
     * Test whenFindsWrongYourIndexInArray.
     */
    @Test
    public void whenFindsWrongYourIndexInArray() {
        FindLoop findLoop = new FindLoop();
        int[] array = {11, 23, 24, 45, 0, 33, 28};
        int result = findLoop.indexOf(array, 100);
        int expected = -1;
        assertThat(result, is(expected));
    }
}