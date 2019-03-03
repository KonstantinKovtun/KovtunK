package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.ImpossibleMoveException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test class RockBlackTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class RookBlackTest {

    @Test
    public void whenStepOneThenStepTwo() {
        RookBlack pawnBlack = new RookBlack(Cell.A8);
        Cell[] result = new Cell[5];
        try {
            result = pawnBlack.way(Cell.A8, Cell.A3);
        } catch (ImpossibleMoveException ex) {
            ex.getMessage();
        }
        Cell expected = Cell.A3;
        assertThat(result[4], is(expected));
    }
}