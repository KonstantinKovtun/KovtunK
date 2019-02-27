package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.ImpossibleMoveException;

import java.util.Arrays;

/**
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class QeenBlack implements Figure {
    private final Cell position;

    public QeenBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        Cell[] steps;
        int deltaX = (dest.x - source.x) < 0 ? -1 : 1;
        int deltaY = (dest.y - source.y) < 0 ? -1 : 1;
        int diffX = source.x - dest.x;
        int diffY = source.y - dest.y;
        int len = 0;
        int counter = 0;

        Cell[] way = new Cell[] {source};

        if (impossibleMoveBishop(source, dest)) {
            steps = new Cell[Math.abs(dest.x - source.x)];

            for (int index = 0; index < steps.length; index++) {
                steps[index] = Cell.values()[(source.x + deltaX * (index + 1)) * 8 + (source.y + deltaY * (index + 1))];
            }
        } else {
            if (diffX != 0 & diffY == 0) {
                len = Math.abs(diffX);
            } else {
                len = Math.abs(diffY);
            }

            steps = new Cell[len];

            if (diffX != 0 & diffY == 0) {
                if (diffX < 0) {
                    for (int i = 0; i < len; i++) {
                        counter = 8 * (source.x + i + 1) + (source.y);
                        steps[i] = Cell.values()[counter];
                    }
                } else {
                    for (int i = 0; i < len; i++) {
                        counter = 8 * (source.x - i - 1) + (source.y);
                        steps[i] = Cell.values()[counter];
                    }
                }
            } else if (diffY != 0 & diffX == 0) {
                if (diffY < 0) {
                    for (int i = 0; i < len; i++) {
                        counter = 8 * (source.x) + (source.y + i + 1);
                        steps[i] = Cell.values()[counter];
                    }
                } else {
                    for (int i = 0; i < len; i++) {
                        counter = 8 * (source.x) + (source.y - i - 1);
                        steps[i] = Cell.values()[counter];
                    }
                }
            }
        } if (diffX != 0 & diffY != 0) {
            throw new ImpossibleMoveException("The figure cannot moves!!!");
        }
        way = Arrays.copyOf(steps, steps.length);

        return way;
    }

    public boolean impossibleMoveBishop(Cell source, Cell dest) {
        boolean rst = false;

        if (Math.abs(dest.x - source.x) == Math.abs(dest.y - source.y)) {
            rst = true;
        }
        return rst;
    }

    @Override
    public Figure copy(Cell dest) {
        return new QeenBlack(dest);
    }
}