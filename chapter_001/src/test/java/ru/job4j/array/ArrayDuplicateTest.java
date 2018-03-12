package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;
/**
 * Test class ArrayDuplicateTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicateTest {
	/**
     * Test whenArrayHasDuplicatesThenDropIn.
     */
    @Test
    public void whenArrayHasDuplicatesThenDropIn() {
        String[] input = {"Hello", "World", "Hello", "Supper", "World"};
        String[] expect = {"Hello", "World", "Supper"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

	/**
     * Test whenArrayHasAllDuplicatesThenDropIn.
     */
    @Test
    public void whenArrayHasAllDuplicatesThenDropIn() {
        String[] input = {"28", "28", "28", "28", "28"};
        String[] expect = {"28"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}