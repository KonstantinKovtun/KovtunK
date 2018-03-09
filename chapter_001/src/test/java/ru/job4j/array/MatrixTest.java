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
     * Test whenSortArrayWithTenElementsThenSortedArray.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        Matrix matrixTest = new Matrix();
        int[][] result = matrixTest.multiple(10);
        String expected = "* | 1| 2| 3| 4| 5| 6| 7| 8| 9|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 1 | 1| 2| 3| 4| 5| 6| 7| 8| 9|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 2 | 2| 4| 6| 8|10|12|14|16|18|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 3 | 3| 6| 9|12|15|18|21|24|27|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 4 | 4| 8|12|16|20|24|28|32|36|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 5 | 5|10|15|20|25|30|35|40|45|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 6 | 6|12|18|24|30|36|42|48|54|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 7 | 7|14|21|28|35|42|49|56|63|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 8 | 8|16|24|32|40|48|56|64|72|\n" +
                "---|--|--|--|--|--|--|--|--|--|\n" +
                " 9 | 9|18|27|36|45|54|63|72|81|\n" +
                "---|--|--|--|--|--|--|--|--|--|";
        assertThat(result, is(expected));
    }
}