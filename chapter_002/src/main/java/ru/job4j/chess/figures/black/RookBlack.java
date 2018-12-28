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

        Cell[] steps;

        int count = 0;
        int i = 0;

        if (dest.x - source.x == 0) {
            steps = new Cell[Math.abs(dest.y - source.y)];
        } else {
            steps = new Cell[Math.abs(dest.x - source.x)];
        }

        for (int j = 0; j < Cell.values().length; j++) {
            if ( (dest.x == Cell.values()[j].x && dest.y == Cell.values()[j].y) || ()) {
                if (count == steps.length) {
                    break;
                }
                steps[i] = Cell.values()[j];
                i++;
                count++;
            }
        }

        return steps;
    }



    @Override
    public Figure copy(Cell dest) {
        return new RookBlack(dest);
    }
}