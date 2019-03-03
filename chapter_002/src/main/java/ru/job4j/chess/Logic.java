package ru.job4j.chess;

import ru.job4j.chess.figures.*;

import java.util.Optional;

/**
 *
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {

    /**
    * An array which contains figures.
    */
    private final Figure[] figures = new Figure[32];
    
    /**
     * An array index.
     */
    private int index = 0;

    /**
     * Method add. The method adds the figure to array .
     * @param figure the figure which adds to array.
     */
    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    /**
     * Method move. The method moves the figure.
     * @param source start point of current figure.
     * @param dest end point of current figure.
     * @return true if the figure can moves.
     */
    public boolean move(Cell source, Cell dest) throws ImpossibleMoveException, FigureNotFoundException, OccupiedWayException {
        boolean rst = false;
        int index = this.findBy(source);
            if (index != -1) {
                Cell[] steps = this.figures[index].way(source, dest);
                occupiedWay(steps);
                if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
                    rst = true;
                    this.figures[index] = this.figures[index].copy(dest);
                }
            } else {
                throw new FigureNotFoundException("The figure not found!!!");
            }
        return rst;
    }

    /**
     * Method occupiedWay. The method checks if the way of figure doesn't occupied.
     * @param steps array that contain steps.
     * @return true if the spot don't occupied.
     */
    public boolean occupiedWay(Cell[] steps) throws OccupiedWayException {
        for (int i = 0; i < steps.length; i++) {
            if (this.findBy(steps[i]) != -1) {
                throw new OccupiedWayException("The figure is occupied the way!!!");
            }
        }
        return true;
    }

    /**
     * Method clean. The method cleans the board if the move didn't happen.
     */
    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    /**
     * Method findBy. The method finds the index of the figure.
     * @param cell start point of current figure.
     * @return rst the index of figure of the board.
     */
    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}