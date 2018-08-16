package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test class TriangleTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    /**
     * Test whenDrawTriangle.
     */
    @Test
    public void whenDrawTriangle() {
        Triangle tr = new Triangle();

        assertThat(
                tr.draw(),
                is(new StringBuilder()
                        .append("  + ").append(System.lineSeparator())
                        .append(" +++").append(System.lineSeparator())
                        .append("+++++").append(System.lineSeparator())
                        .toString()
                )
        );
    }
}
