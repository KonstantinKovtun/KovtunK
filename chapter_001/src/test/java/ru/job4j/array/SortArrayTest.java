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
        int[] ara1 = {1, 2};
        int[] ara2 = {3, 4};
        int[] result = sortArray.insertElements(ara1, ara2);
        int[] expected = {1, 2, 3, 4};
        assertThat(result, is(expected));
    }
}