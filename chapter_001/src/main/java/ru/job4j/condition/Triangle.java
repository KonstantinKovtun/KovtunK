package ru.job4j.condition;

/**
 * Class Triangle calculates the area of the triangle.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    /**
     * The value using in the formula of perimeter.
     */
    public static final int PERIMETER = 2;

    /**
     * Variables which use to create class Point.
     */
	private Point first;
	private Point second;
	private Point third;

    /**
     * Construct the class Triangle.
	 * @param ap first point of the figure.
	 * @param bp second point of the figure.
	 * @param cp third point of the figure.
     */
	public Triangle(Point ap, Point bp, Point cp) {
		this.first = ap;
		this.second = bp;
		this.third = cp;
	}

	/**
	 * Method of calculating the semi-perimeter along the lengths of the sides.
	 * <p>
	 * Formula.
	 * <p>
	 * (ab + ac + bc) / 2
	 *
	 * @param a distance between points a b
	 * @param b distance between points a c
	 * @param c distance between points b c
	 * @return Perimeter.
	 */
	public double period(double a, double b, double c) {
		return (a + b + c) / PERIMETER;
	}

	/**
	 * Method calculates the area of triangle.
	 *
	 * @return Return the are, if triangle exists or -1, if triangle doesn't exist.
	 */
	public double area() {
		double rsl = -1;
		double a = this.first.distanceTo(this.second);
		double b = this.first.distanceTo(this.third);
		double c = this.second.distanceTo(this.third);
		double p = this.period(a, b, c);

		if (this.exist(a, c, b)) {
			rsl = Math.sqrt(this.period(a, b, c) * (this.period(a, b, c) - a) * (this.period(a, b, c) - b) * (this.period(a, b, c) - c));
		}

		return rsl;
	}

	/**
	 * The method checks whether it is possible to construct a triangle with such lengths of sides.
	 * <p>
	 *
	 * @param a Length from point a to b.
	 * @param c Length from point a to c.
	 * @param b Length from point b to c.
	 * @return the boolean result.
	 */
	private boolean exist(double a, double c, double b) {
		return (a + b > c) && (b + c > a) && (c + a > b);
	}

	public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(1, 5), new Point(3, 7), new Point(2, 4));

        System.out.println("Area = " + triangle.area());
    }
}