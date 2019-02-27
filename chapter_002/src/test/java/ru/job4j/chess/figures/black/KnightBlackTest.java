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
public class KnightBlackTest {

    @Test
    public void whenStepOneThenStepTwo() {
        KnightBlack qeenBlack = new KnightBlack(Cell.B8);
        Cell[] result = new Cell[1];
        try {
            result = qeenBlack.way(Cell.C6, Cell.A5);
        } catch (ImpossibleMoveException ex) {
            ex.getMessage();
        }
        Cell expected = Cell.A5;
        assertThat(result[0], is(expected));
    }
}