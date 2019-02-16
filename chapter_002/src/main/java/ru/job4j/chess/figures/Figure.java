package ru.job4j.chess.figures;

public interface Figure {
    Cell position();
    Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException, FigureNotFoundException, OccupiedWayException;

    default String icon() {
        return String.format(
                "%s.png", this.getClass().getSimpleName()
        );
    }
    Figure copy(Cell dest);
}
