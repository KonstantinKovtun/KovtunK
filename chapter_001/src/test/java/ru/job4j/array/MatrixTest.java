package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test class MatrixTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixTest {
    /**
     * Test whenPutSizeThenOutPutTable.
     */
    @Test
    public void whenPutSizeThenOutPutTable() {
        int input = 4;
        int[][] expect = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(input);
        assertThat(result, is(expect));
    }
}