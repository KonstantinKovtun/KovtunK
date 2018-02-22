package ru.job4j.max;

/**
 * Class Max makes some mathematical operations.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {
    /**
     * max. Method summarize two values.
     * @param first, first value.
     * @param second, second value.
     * @return maxValue result.
     */
	public int max(int first, int second) {
		return (first > second) ? (first) : (second);
	}

	public static void main(String[] args) {
	    final int MAX_VALUE = 100;
	    final int MIN_VALUE = 28;
        Max maxV = new Max();

        System.out.println(maxV.max(MAX_VALUE, MIN_VALUE));
    }
}