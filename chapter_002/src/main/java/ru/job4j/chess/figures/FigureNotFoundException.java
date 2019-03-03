package ru.job4j.chess.figures;

/**
 * Class FigureNotFoundException the exception figure not found.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class FigureNotFoundException extends Exception {

    public FigureNotFoundException(String message) {
        super(message);
    }
}
