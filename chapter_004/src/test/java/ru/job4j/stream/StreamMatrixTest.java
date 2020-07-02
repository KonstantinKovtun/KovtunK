package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test class StreamMatrixTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 02.07.2020
 */
public class StreamMatrixTest {
    /**
     * Test whenInputMatrixOutPutArrayList.
     */
    @Test
    public void whenInputMatrixOutPutArrayList() {
        StreamMatrix streamMatrix = new StreamMatrix();
        Integer[][] ara = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        List<Integer> expect = streamMatrix.convertToList(ara);
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        assertThat(result, is(expect));
    }
}
