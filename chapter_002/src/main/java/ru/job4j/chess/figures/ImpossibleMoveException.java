package ru.job4j.chess.figures;

/**
 * Class ImpossibleMoveException the exception figure cannot move.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class ImpossibleMoveException extends Exception {

    public ImpossibleMoveException(String message) {
        super(message);
    }
}
