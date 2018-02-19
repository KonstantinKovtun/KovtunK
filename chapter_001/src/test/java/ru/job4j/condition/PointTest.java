package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test class Point.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
*/
public class PointTest {

	 
	/**
     * Test whenCreateOneObjectAndMeasureDistanceOnTwoObject.
     */ @Test
    public void whenCreateOneObjectAndMeasureDistanceOnTwoObject() {
		Point a = new Point(0, 1);
		Point b = new Point(3, 5);
		
		double result = a.distanceTo(b);
		double expected = 5;		
		assertThat(result, is(expected));
    }
}