package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

import java.util.Arrays;

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

        int diffX = source.x - dest.x;
        int diffY = source.y - dest.y;
        int len = 0;

        Cell[] way = new Cell[] {source};

        if (diffX != 0 & diffY == 0) {
            len = Math.abs(diffX) + 1;
        }
        if (diffY != 0 & diffX == 0) {
            len = Math.abs(diffY) + 1;
        }

        Cell[] steps = new Cell[len];

        if (diffX != 0 & diffY == 0) {
            if (diffX < 0) {
                int counter = 0;
                for (int i = 0; i < len; i++) {
                    counter = 8 * (source.x + i) + (source.y);
                    steps[i] = Cell.values()[counter];
                }
            } else if (diffX > 0) {
                int counter = 0;
                for (int i = 0; i < len; i++) {
                    counter = 8 * (source.x - i) + (source.y);
                    steps[i] = Cell.values()[counter];
                }
            }
        } else if (diffY != 0 & diffX == 0) {
            if (diffY < 0) {
                int counter = 0;
                for (int i = 0; i < len; i++) {
                    counter = 8 * (source.x) + (source.y + i);
                    steps[i] = Cell.values()[counter];
                }
            } else if (diffY > 0) {
                int counter = 0;
                for (int i = 0; i < len; i++) {
                    counter = 8 * (source.x) + (source.y - i);
                    steps[i] = Cell.values()[counter];
                }
            }
        }
        way = Arrays.copyOf(steps, steps.length);

        return way;
    }



    @Override
    public Figure copy(Cell dest) {
        return new RookBlack(dest);
    }
}