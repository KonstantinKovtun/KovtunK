package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class KingBlack implements Figure {
    private final Cell position;

    public KingBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];

        if ((source.y == dest.y + 1 && source.x == dest.x)
                || (source.y == dest.y - 1 && source.x == dest.x)
                || (source.y == dest.y && source.x == dest.x + 1)
                || (source.y == dest.y && source.x == dest.x - 1)
                || (source.y == dest.y - 1 && source.x == dest.x - 1)
                || (source.y == dest.y - 1 && source.x == dest.x + 1)
                || (source.y == dest.y + 1 && source.x == dest.x - 1)
                || (source.y == dest.y + 1 && source.x == dest.x + 1)) {
            steps = new Cell[] {dest};
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KingBlack(dest);
    }
}