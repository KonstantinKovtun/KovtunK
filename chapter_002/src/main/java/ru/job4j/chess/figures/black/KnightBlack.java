package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.ImpossibleMoveException;

/**
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class KnightBlack implements Figure {
    private final Cell position;

    public KnightBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        Cell[] steps = new Cell[0];

        if ((source.y == dest.y + 2 && source.x == dest.x - 1)
                || (source.y == dest.y + 2 && source.x == dest.x + 1)
                || (source.y == dest.y - 2 && source.x == dest.x + 1)
                || (source.y == dest.y - 2 && source.x == dest.x - 1)
                || (source.y == dest.y + 1 && source.x == dest.x - 2)
                || (source.y == dest.y + 1 && source.x == dest.x + 2)
                || (source.y == dest.y - 1 && source.x == dest.x + 2)
                || (source.y == dest.y - 1 && source.x == dest.x - 2)) {
            steps = new Cell[] {dest};
        } else {
            throw new ImpossibleMoveException("The figure cannot moves!!!");
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightBlack(dest);
    }
}