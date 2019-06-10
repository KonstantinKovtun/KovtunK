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
	 */
	@Test
	public void whenCreateOneObjectAndMeasureDistanceOnTwoObject() {
		Point a = new Point(0, 1);
		Point b = new Point(3, 5);

		double result = a.distanceTo(b);
		double expected = 5;
		assertThat(result, is(expected));
	}

	/**
	 * Test whenCreateOneObjectAndMeasureDistanceOnTwoObject.
	 */
	@Test
	public void whenCreateOneObjectAndMeasureDistanceOnThreeObject() {
		Point a = new Point(0, 2);
		Point c = new Point(3, 4, 6);

		double result = a.distance3d(c);
		double expected = 7;
		assertThat(result, is(expected));
	}

	/**
	 * Test whenShowInfo.
	 */
	@Test
	public void whenShowInfo() {
		Point first = new Point(1, 1);
		first.info();
		Point second = new Point(2, 2);
		second.info();
	}

	/**
	 * Test whenCheckItself.
	 */
	@Test
	public void whenCheckItself() {
		Point point = new Point(0, 0);
		double result = point.distanceTo(point);
		assertThat(result, is(0D));
	}
}