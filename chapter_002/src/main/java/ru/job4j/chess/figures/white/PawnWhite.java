package ru.job4j.chess.figures.white;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.ImpossibleMoveException;

/**
 * Class PawnWhite. This class describe the behavior of the figure.
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PawnWhite implements Figure {

    /**
     * The position contains the coordinate.
     */
    private final Cell position;

    /**
     * The constructor PawnWhite. Build the object figure RookBlack.
     * @param position the steps of figure.
     */
    public PawnWhite(final Cell position) {
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
        if (source.y == dest.y - 1 && source.x == dest.x) {
            steps = new Cell[] {dest};
        } else {
            throw new ImpossibleMoveException("The figure cannot moves");
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
        return new PawnWhite(dest);
    }
}