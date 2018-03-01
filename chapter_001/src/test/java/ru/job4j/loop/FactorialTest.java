package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class FactorialTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class FactorialTest {
    /**
     * Test whenCalculateFactorialForFiveThenOneHundreedTwenty.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();

        int result = factorial.calc(5);

        assertThat(result, is(120));
    }

    /**
     * Test whenCalculateFactorialForZeroThenOne.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();

        int result = factorial.calc(0);

        assertThat(result, is(1));
    }
}