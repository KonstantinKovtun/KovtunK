package ru.job4j.coffeemachine;

import org.hamcrest.Matchers;
import org.junit.Test;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.ImpossibleMoveException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

/**
 * Test class CoffeeMachine.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class CoffeeMachineTest {

    /**
     * Test whenCoffeeMachineReturnsChange.
     */
    @Test
    public void whenCoffeeMachineReturnsChange() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        int[] result = coffeeMachine.changes(30, 2);
        int[] ara = {10, 10, 5, 2, 1};

        assertArrayEquals(result, ara);
    }
}
