package ru.job4j.loop;

/**
 * Class Board builds a chessboard.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Board {
    /**
     * paint. The method builds the  chessboard.
     * @param width, the value of a width.
     * @param height, the value of a height.
     * @return chessboard.
     */
    public String paint(int width, int height) {

        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }

    public static void main(String[] args) {
        final int WIDTH = 5;
        final int HEIGHT = 3;

        Board board = new Board();

        System.out.println(board.paint(WIDTH, HEIGHT));

    }
}