package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.ImpossibleMoveException;

/**
 * Class KnightBlack. This class describe the behavior of the figure.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class KnightBlack implements Figure {

    /**
     * The position contains the coordinate.
     */
    private final Cell position;

    /**
     * The constructor KnightBlack. Build the object figure RookBlack.
     * @param position the steps of figure.
     */
    public KnightBlack(final Cell position) {
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

    /**
     * Method copy. This method copies the position of figure.
     * @param dest the position of the figure.
     * @return figure the new step of figure.
     */
    @Override
    public Figure copy(Cell dest) {
        return new KnightBlack(dest);
    }
}