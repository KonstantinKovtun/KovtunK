package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class CounterTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class CounterTest {
    /**
     * Test whenSumEvenNumbersFromOneToTenThenThirty.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counterTest = new Counter();

        int result = counterTest.add(1, 10);

        assertThat(result, is(30));
    }
}