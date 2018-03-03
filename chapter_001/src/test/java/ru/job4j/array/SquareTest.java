package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class SquareTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {
    /**
     * Test whenFillArrayElementsInSquare.
     */
    @Test
    public void whenFillArrayElementsInSquare() {
        Square square = new Square();

        int[] result = square.calculate(5);
        int[] expected = {1, 4, 9, 16, 25};
        assertThat(result, is(expected));
    }
}