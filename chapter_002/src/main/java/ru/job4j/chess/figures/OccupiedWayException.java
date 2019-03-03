package ru.job4j.chess.figures;

/**
 * Class OccupiedWayException the exception falls when the spot is occupied.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class OccupiedWayException extends Exception {

    public OccupiedWayException(String message) {
        super(message);
    }
}
