package ru.job4j.chess.figures.black;

import ru.job4j.chess.Logic;
import ru.job4j.chess.figures.*;

import java.util.Arrays;

/**
 * Class BishopBlack. This class describe the behavior of the figure.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {

    /**
     * The position contains the coordinate.
     */
    private final Cell position;

    /**
     * The constructor BishopBlack. Build the object figure RookBlack.
     * @param position the steps of figure.
     */
    public BishopBlack(final Cell position) {
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
        Cell[] steps = new Cell[Math.abs(dest.x - source.x)];

        int deltaX = (dest.x - source.x) < 0 ? -1 : 1;
        int deltaY = (dest.y - source.y) < 0 ? -1 : 1;

        if (isDiagonal(source, dest)) {
            for (int index = 0; index < steps.length; index++) {
                steps[index] = Cell.values()[(source.x + deltaX * (index + 1)) * 8 + (source.y + deltaY * (index + 1))];
            }
        }
        return steps;
    }

    /**
     * Method impossibleMoveBishop. This checks if figure can move.
     * @param source start point of current figure.
     * @param dest the cell where the figure should go.
     * @return true is figure can make step.
     */
    public boolean isDiagonal(Cell source, Cell dest) throws ImpossibleMoveException {
        if (Math.abs(dest.x - source.x) != Math.abs(dest.y - source.y)) {
            throw new ImpossibleMoveException("The figure cannot moves!!!");
        }
        return true;
    }

    /**
     * Method copy. This method copies the position of figure.
     * @param dest the position of the figure.
     * @return figure the new step of figure.
     */
    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}