package ru.job4j.loop;

/**
 * Class Factorial calculates the factorial of a number.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

    public static final int RESULT = 1;

    /**
     * calc. The method calculates the factorial of a number.
     * @param number, the value of a number.
     * @return result.
     */
    public int calc(int number) {
        int result = RESULT;

        for (int i = RESULT; i <= number; i++) {
            if (number == 0 || number == 1) {
                result = RESULT;
            } else {
                result *= i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final int START = 5;

        Factorial  factorial  = new Factorial ();

        System.out.println("Factorial 5 = " + factorial.calc(START));
    }
}