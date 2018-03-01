package ru.job4j.loop;

/**
 * Class Counter count the sum of all even numbers.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Counter {

    public static final int SUM = 0;

    /**
     * Convert RUB to EUR.
     * @param start,  start value.
     * @param finish, finish value.
     * @return sum.
     */
    public int add(int start, int finish) {
        int sum = SUM;

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        final int START = 1;
        final int FINISH = 28;

        Counter counter = new Counter();

        System.out.println("SUM : " + counter.add(START, FINISH));
    }
}