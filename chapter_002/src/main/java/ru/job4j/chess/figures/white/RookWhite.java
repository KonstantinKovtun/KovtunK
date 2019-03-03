package ru.job4j.chess.figures.white;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.ImpossibleMoveException;

import java.util.Arrays;

/**
 * Class RookWhite. This class describe the behavior of the figure.
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class RookWhite implements Figure {

    /**
     * The position contains the coordinate.
     */
    private final Cell position;

    /**
     * The constructor RookWhite. Build the object figure RookBlack.
     * @param position the steps of figure.
     */
    public RookWhite(final Cell position) {
        this.position = position;
    }

    /**
     * Method position. This method return the current position of figure.
     * @return position return the positions.
     */
    @Override
    public Cell position() {
        return this.position;
    }

    /**
     * Method way. This method checks if the figure can move.
     * @param source the current position of the figure.
     * @param dest the cell where the figure should go.
     * @return way returns the array which contains steps.
     */
    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        int diffX = source.x - dest.x;
        int diffY = source.y - dest.y;
        int len = 0;
        int counter = 0;

        Cell[] way = new Cell[] {source};

        if (diffX != 0 & diffY == 0) {
            len = Math.abs(diffX);
        } else {
            len = Math.abs(diffY);
        }

        Cell[] steps = new Cell[len];

        if (diffX != 0 & diffY == 0) {
            if (diffX < 0) {
                for (int i = 0; i < len; i++) {
                    counter = 8 * (source.x + i + 1) + (source.y);
                    steps[i] = Cell.values()[counter];
                }
            } else  {
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
        if (diffY != 0 & diffX != 0) {
            throw new ImpossibleMoveException("The figure cannot moves");
        }
        way = Arrays.copyOf(steps, steps.length);

        return way;
    }

    /**
     * Method copy. This method copies the position of figure.
     * @param dest the position of the figure.
     * @return figure the new step of figure.
     */
    @Override
    public Figure copy(Cell dest) {
        return new RookWhite(dest);
    }
}