package ru.job4j.pseudo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test class PaintTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class PaintTest {
    /**
     * Test whenDrawSquare.
     */
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(new StringBuilder()
                        .append("++++").append(System.lineSeparator())
                        .append("++++").append(System.lineSeparator())
                        .append("++++").append(System.lineSeparator())
                        .append(System.lineSeparator())
                        .toString()
                )
        );
        System.setOut(stdout);
    }

    /**
     * Test whenDrawSquare.
     */
    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(new StringBuilder()
                        .append("  + ").append(System.lineSeparator())
                        .append(" +++").append(System.lineSeparator())
                        .append("+++++").append(System.lineSeparator())
                        .append(System.lineSeparator())
                        .toString()
                )
        );
        System.setOut(stdout);
    }
}
