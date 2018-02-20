package ru.job4j.calculator;

/**
 * Class Converter converts currency.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Converter {

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
        this.value = value;
        return this.value / 70;
    }

    /**
     * Convert RUB to USD.
     * @param value RUB.
     * @return USD
     */
    public int rubleToDollar(int value) {
        this.value = value;
        return this.value / 60;
    }

    /**
     * Convert EUR to RUB.
     * @param value RUB.
     * @return EUR
     */
    public int euroToRuble(int value) {
        this.value = value;
        return this.value * 70;
    }

    /**
     * Convert RUB to USD.
     * @param value RUB.
     * @return USD
     */
    public int dollarToRuble(int value) {
        this.value = value;
        return this.value * 60;
    }

    public static void main(String[] args) {
        final int CURRENCY_DOLLAR = 120;
        final int CURRENCY_EURO = 140;
        final int CURRENCY_TO_RUBLE = 5;

        Converter converter  = new Converter();

        converter.rubleToDollar(CURRENCY_DOLLAR);
        converter.rubleToEuro(CURRENCY_EURO);
        converter.euroToRuble(CURRENCY_TO_RUBLE);
        converter.dollarToRuble(CURRENCY_TO_RUBLE);
    }
}