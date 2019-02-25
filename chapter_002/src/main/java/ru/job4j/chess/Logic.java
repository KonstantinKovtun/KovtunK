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
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);

        try {
            if (index != -1) {
                Cell[] steps = this.figures[index].way(source, dest);
           //     if (occupiedWay(steps)) {
                    if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
                        rst = true;
                        this.figures[index] = this.figures[index].copy(dest);
                    }
             //   } else {
              //      throw new OccupiedWayException("The is ouccupieted!!!");
              //  }
            } else {
                throw new FigureNotFoundException("The figure not found!!!");
            }
        } catch (ImpossibleMoveException ex) {
            System.out.println(ex.getMessage());
        } catch (FigureNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (OccupiedWayException ex) {
            System.out.println(ex.getMessage());
        }
        return rst;
    }
/*
    public boolean occupiedWay(Cell[] steps) {
        boolean place = true;

        for (int i = 0; i < steps.length; i++) {

            if (this.findBy(steps[i]) != -1) {
                place = false;
                break;
            }
        }
        return place;
    }
*/
    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

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