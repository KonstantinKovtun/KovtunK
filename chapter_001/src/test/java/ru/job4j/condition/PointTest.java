package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Point. Class calculates the distance between two points.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
*/
public class PointTest {
	
	/**
     * Method construct. Initializes the object by default values.
	 * @param x, x value.
	 * @param y - y value.
     * @return result of the distance.
     */

	
	/**
     * Method distanceTo. Calculates the distance between two points .
     * @return result of distance.
     */

	
	/**
     * Main.
     * @param args - args.
     */
	 
	 
	/**
     * Test whenAddOnePlusOneThenTwo.
     */ @Test
    public void whenAddOnePlusOneThenTwo() {
		/*
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
		*/
		Point a = new Point(0, 1);
		Point b = new Point(3, 5);
		
		double result = a.distanceTo(b);
		double expected = 5;
		assertThat(result, is(expected));
    }
	/*
	public static void main(String[] args) {
		Point a = new Point(0, 1);
		Point b = new Point(2, 5);
		
		double result = a.distanceTo(b);
				
	}
	*/
}