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
public class QeenBlackTest {

    @Test
    public void whenStepOneThenStepTwo() {
        QeenBlack qeenBlack = new QeenBlack(Cell.D8);
        Cell[] result = new Cell[4];
        try {
            result = qeenBlack.way(Cell.D6, Cell.D3);
        } catch (ImpossibleMoveException ex) {
            ex.getMessage();
        }
        Cell expected = Cell.D3;
        assertThat(result[3], is(expected));
    }
}