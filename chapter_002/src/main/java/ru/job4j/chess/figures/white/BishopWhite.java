package ru.job4j.chess.figures.white;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;


/**
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BishopWhite implements Figure {
    private final Cell position;

    public BishopWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[Math.abs(dest.x - source.x)];

        int deltaX = (dest.x - source.x) < 0 ? -1 : 1;
        int deltaY = (dest.y - source.y) < 0 ? -1 : 1;

        if (impossibleMoveBishop(source, dest)) {
           // throw new ImpossibleMoveException("fdfd");
        } else {
            for (int index = 0; index < steps.length; index++) {
                steps[index] = Cell.values()[(source.x + deltaX * (index + 1)) * 8 + (source.y + deltaY * (index + 1))];
            }
        }
        return steps;
    }

    public boolean impossibleMoveBishop(Cell source, Cell dest) {
        boolean rst = false;

        if (Math.abs(dest.x - source.x) != Math.abs(dest.y - source.y)) {
            rst = true;
        }
        return rst;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopWhite(dest);
    }
}