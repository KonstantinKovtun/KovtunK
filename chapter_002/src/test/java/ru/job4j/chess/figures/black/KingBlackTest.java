package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.ImpossibleMoveException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test class PawnBlackTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class KingBlackTest {
    @Test
    public void whenStepOneThenStepTwo() {
        KingBlack kingBlack = new KingBlack(Cell.E8);
        Cell[] result = new Cell[1];
        result = kingBlack.way(Cell.E8, Cell.E7);
        Cell expected = Cell.E7;
        assertThat(result[0], is(expected));
    }
}