package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Class Paint builds a pyramid.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * The method builds the right triangle.
     * @param height, the value of a height.
     * @return right triangle.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * The method builds the left triangle.
     * @param height, the value of a height.
     * @return left triangle.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * The method builds the pyramid.
     * @param height, the value of a height.
     * @return pyramid.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }
    /**
     * The method has logic that builds the pyramid.
     * @param height, the value of a height.
     * @param weight, the value of a weight.
     * @param predict, the value of a predict.
     * @return pyramid.
     */
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    /**
     * The method builds the pyramid.
     * //@param height, the value of a height.
     * //@return pyramid.
     */
/*    public String pyramid(int height) {

        StringBuilder screen = new StringBuilder();

        int weight = 2 * height - 1;

        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
*/
    /**
     * The method builds the right triangle.
     * //@param height, the value of a height.
     * //@return right triangle.
     */
 /*   public String rightTrl(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        int weight = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != weight; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }
*/
    /**
     * The method builds the left triangle.
     * //@param height, the value of a height.
     * //@return left triangle.
     */
 /*   public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
*/
    public static void main(String[] args) {
        final int HEIGHT = 3;
        Paint paint = new Paint();
        System.out.println(paint.pyramid(HEIGHT));
    }
}