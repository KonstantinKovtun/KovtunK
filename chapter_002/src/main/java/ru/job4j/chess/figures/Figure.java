package ru.job4j.chess.figures;

public abstract class Figure {

    public static final Cell position = Cell.A1;


    public abstract Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException;

    String icon() {
        return String.format(
                "%s.png", this.getClass().getSimpleName()
        );
    }

    public abstract Figure copy(Cell dest);

    public Figure() {
    }
}