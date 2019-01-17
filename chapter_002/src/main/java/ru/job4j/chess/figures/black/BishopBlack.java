package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

import java.util.Arrays;

/**
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[Math.abs(dest.x - source.x)];

        int diffX = source.x - dest.x;
        int diffY = source.y - dest.y;
        int len = 0;

        Cell[] way = new Cell[] {source};

        //if (diffX != 0 & diffY == 0) {
            len = Math.abs(diffX) + 1;
        //}
//        if (diffY != 0 & diffX == 0) {
//            len = Math.abs(diffY) + 1;
//        }

        Cell[] step = new Cell[len];

        if (diffX > 0 & diffY > 0) {
            int counter = 0;
            for (int i = 0; i < len; i++) {
                counter = 8 * (source.x + i) + (source.y);
                step[i] = Cell.values()[counter];
            }
        } else if (diffY < 0 & diffX < 0) {
            int counter = 0;
            for (int i = 0; i < len; i++) {
                counter = 8 * (source.x) + (source.y + i);
                step[i] = Cell.values()[counter];
            }
        }
        way = Arrays.copyOf(steps, steps.length);

        return way;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}