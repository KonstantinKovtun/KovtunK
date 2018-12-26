package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class RookBlack implements Figure {
    private final Cell position;

    public RookBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[Math.abs(dest.x - source.x) + Math.abs(dest.y - source.y)];

        for (int i = 0; i < steps.length; i++) {
            if ((source.x == dest.x && source.y != dest.y) || (source.x != dest.x + i && source.y == dest.y)) {
                steps[i] = Cell.values()[Cell.values().length - i - 1];
            }
        }
        return steps;
    }



    @Override
    public Figure copy(Cell dest) {
        return new RookBlack(dest);
    }
}