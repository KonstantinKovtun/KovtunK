package ru.job4j.chess.figures;

public class ImpossibleMoveException extends Exception {

    public ImpossibleMoveException(String message) {
        super(message);
    }
}
