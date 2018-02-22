package ru.job4j.calculator;

/**
 * Class Fit calculates the weight of people.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Fit {

    public static final int MAN_COEF = 100;
    public static final int WOMAN_COEF = 110;
    public static final double COEF = 1.15;
    /**
     * The value of human weigth.
     */
    private double height;

    /**
     * An ideal weight for a man.
     * @param height Height.
     * @return An ideal weight.
     */
    double manWeight(double height) {
        this.height = (height - MAN_COEF) * COEF;
        return  this.height;
    }

    /**
     * An ideal weight for a woman.
     * @param height Height.
     * @return An ideal weight.
     */
    double womanWeight(double height) {
        this.height = (height - WOMAN_COEF) * COEF;
        return  this.height;
    }

    public static void main(String[] args) {
        final double MAN = 165;
        final double WEMAN = 170;

        Fit fit = new Fit();

        fit.manWeight(MAN);
        fit.womanWeight(WEMAN);
    }
}