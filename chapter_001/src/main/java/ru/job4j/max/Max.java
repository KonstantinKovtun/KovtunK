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

	    int maxValue = ((first > second) ? maxValue = first : (maxValue = second));

		return maxValue;
	}

	public static void main(String[] args) {
        Max max = new Max();

        System.out.println(max.max(0, 3));
    }
}