package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
/**
 * Test class TriangleTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
 @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Create three oblects Point.
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        // Create the Triangle object and pass Point objects to it.
        Triangle triangle = new Triangle(a, b, c);
        // Calculate an area.
        double result = triangle.area();
        // Define the expected result.
        double expected = 2D;
        //Check the result and the expected value.
        assertThat(result, closeTo(expected, 0.1));
     }
}