package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.figures.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test class PawnBlackTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class PawnBlackTest {
    @Test
    public void whenStepOneThenStepTwo()  {
        PawnBlack pawnBlack = new PawnBlack(Cell.A7);
        Cell[] result = new Cell[0];
        result = pawnBlack.way(Cell.A7, Cell.A6);
        Cell expected = Cell.A6;
        assertThat(result[0], is(expected));
    }
}