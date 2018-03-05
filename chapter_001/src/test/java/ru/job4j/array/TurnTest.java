package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class TurnTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class TurnTest {
    /**
     * Test whenTurnArrayWithOddAmountOfElementsThenTurnedArray.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = {1, 2, 3, 4, 5};
        int[] result = turn.back(array);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
    /**
     * Test whenTurnArrayWithEvenAmountOfElementsThenTurnedArray.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] result = turn.back(array);
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}