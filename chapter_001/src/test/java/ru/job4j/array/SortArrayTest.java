package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class SortArrayTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class SortArrayTest {
    /**
     * Test whenOneArrayPlusTwoArrayThenThirdArraySorted.
     */
    @Test
    public void whenOneArrayPlusTwoArrayThenThirdArraySorted() {
        SortArray sortArray = new SortArray();
        int[] ara1 = {4, -2, 0};
        int[] ara2 = {5, -1, 28, -100};
        int[] result = sortArray.insertElements(ara1, ara2);
        int[] expected = {4, -2, 0, 5, -1, 28,-100};
        assertThat(result, is(expected));
    }
}