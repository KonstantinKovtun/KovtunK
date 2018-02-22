package ru.job4j.calculator;

/**
 * Class Converter converts currency.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Converter {

    public static final int EURO_COEF = 70;
    public static final int USD_COEF = 60;
    /**
     * The value of a currency.
     */
    private int value;

    /**
     * Convert RUB to EUR.
     * @param value RUB.
     * @return EUR.
     */
    public int rubleToEuro(int value) {
        this.value = value / EURO_COEF;
        return this.value;
    }

    /**
     * Convert RUB to USD.
     * @param value RUB.
     * @return USD
     */
    public int rubleToDollar(int value) {
        this.value = value / USD_COEF;
        return this.value;
    }

    /**
     * Convert EUR to RUB.
     * @param value RUB.
     * @return EUR
     */
    public int euroToRuble(int value) {
        this.value = value * EURO_COEF;
        return this.value;
    }

    /**
     * Convert RUB to USD.
     * @param value RUB.
     * @return USD
     */
    public int dollarToRuble(int value) {
        this.value = value * USD_COEF;
        return this.value;
    }

    public static void main(String[] args) {
        final int CURRENCY_DOLLAR = 120;
        final int CURRENCY_EURO = 140;
        final int CURRENCY_TO_RUBLE = 7;

        Converter converter  = new Converter();

        converter.rubleToDollar(CURRENCY_DOLLAR);
        converter.rubleToEuro(CURRENCY_EURO);
        converter.euroToRuble(CURRENCY_TO_RUBLE);
        converter.dollarToRuble(CURRENCY_TO_RUBLE);
    }
}