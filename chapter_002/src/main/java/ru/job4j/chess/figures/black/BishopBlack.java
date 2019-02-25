package ru.job4j.chess.figures.black;

import ru.job4j.chess.Logic;
import ru.job4j.chess.figures.*;

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
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException {
        Cell[] steps = new Cell[Math.abs(dest.x - source.x)];

        int deltaX = (dest.x - source.x) < 0 ? -1 : 1;
        int deltaY = (dest.y - source.y) < 0 ? -1 : 1;

        if (isDiagonal(source, dest)) {
            for (int index = 0; index < steps.length; index++) {
                steps[index] = Cell.values()[(source.x + deltaX * (index + 1)) * 8 + (source.y + deltaY * (index + 1))];
            }
//            if (!occupiedWay(steps)){
//                throw new OccupiedWayException("The is ouccupieted!!!");
//            }
        } else {
            throw new ImpossibleMoveException("The figure cannot moves");
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean rst = false;

        if (Math.abs(dest.x - source.x) == Math.abs(dest.y - source.y)) {
            rst = true;
        }
        return rst;
    }

    public boolean occupiedWay(Cell[] steps) {
        Figure[] figures = new Figure[32];
        Cell[] st = new Cell[steps.length];
        boolean rst = true;

        for (int index = 0; index != figures.length; index++) {
            st[index] = figures[index].position();

/*            if (steps[index] == figures[index].position()) {
                st[index]= figures[index].position();
            }
*/
        }
/*
        for (int index = 0; index != st.length; index++) {
            if (figures[index] != null && figures[index].position().equals(steps[index])) {
                rst = false;
                break;
            }
        }
*/
        return rst;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}