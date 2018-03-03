package ru.job4j.loop;

/**
 * Class Factorial calculates the factorial of a number.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

    /**
     * calc. The method calculates the factorial of a number.
     * @param number, the value of a number.
     * @return result.
     */
    public int calc(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        final int START = 0;
        Factorial factorial = new Factorial();
        System.out.println("Factorial START! = " + factorial.calc(START));
    }
}