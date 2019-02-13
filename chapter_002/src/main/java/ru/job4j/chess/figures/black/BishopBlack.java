package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.ImpossibleMoveException;
import ru.job4j.chess.figures.OccupiedWayException;
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

        int deltaX = (dest.x - source.x) < 0 ? -1 : 1;
        int deltaY = (dest.y - source.y) < 0 ? -1 : 1;

        try {
            if (isDiagonal(source, dest)) {
                for (int index = 0; index < steps.length; index++) {
                    steps[index] = Cell.values()[(source.x + deltaX * (index + 1)) * 8 + (source.y + deltaY * (index + 1))];
                }
            }
        } catch(ImpossibleMoveException ex) {
            System.out.println(ex.getMessage());
        }

        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest)  throws ImpossibleMoveException {
        boolean rst = false;

        if (Math.abs(dest.x - source.x) == Math.abs(dest.y - source.y)) {
            rst = true;
        } else {
            throw new ImpossibleMoveException("The figure cannot moves");
        }

        return rst;
    }
/*
    public boolean occupiedWayBishop(Cell source, Cell dest) {
        boolean place = false;

        if ()

        return place;
    }
*/
    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}