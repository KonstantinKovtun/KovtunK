package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test class SquareTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {
    /**
     * Test whenDrawSquare.
     */
    @Test
    public void whenDrawSquare() {
        Square sq = new Square();

        assertThat(
                sq.draw(),
                is(new StringBuilder()
                        .append("++++").append(System.lineSeparator())
                        .append("++++").append(System.lineSeparator())
                        .append("++++").append(System.lineSeparator())
                        .toString()
                )
        );
    }
}
