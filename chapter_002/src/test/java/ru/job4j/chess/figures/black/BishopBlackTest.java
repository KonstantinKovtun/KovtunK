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
public class BishopBlackTest {
    @Test
    public void whenStepOneThenStepTwo() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] result = new Cell[3];
        try {
            result = bishopBlack.way(Cell.C8, Cell.F5);
        } catch (ImpossibleMoveException ex) {
            ex.getMessage();
        }
        Cell expected = Cell.F5;
        assertThat(result[2], is(expected));
    }
}