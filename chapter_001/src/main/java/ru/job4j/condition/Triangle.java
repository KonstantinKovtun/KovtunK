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
	private Point a;
	private Point b;
	private Point c;

    /**
     * Construct the class Triangle.
     */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Method of calculating the semi-perimeter along the lengths of the sides.
	 * <p>
	 * Formula.
	 * <p>
	 * (ab + ac + bc) / 2
	 *
	 * @param ab distance between points a b
	 * @param ac distance between points a c
	 * @param bc distance between points b c
	 * @return Perimeter.
	 */
	public double period(double ab, double ac, double bc) {
		return (ab + ac + bc) / PERIMETER;
	}

	/**
	 * Method calculates the area of triangle.
	 *
	 * @return Return the are, if triangle exists or -1, if triangle doesn't exist.
	 */
	public double area() {
		double rsl = -1;
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = this.period(ab, ac, bc);

		if (this.exist(ab, ac, bc)) {
			rsl = Math.sqrt(this.period(ab, ac, bc) * (this.period(ab, ac, bc) - ab) * (this.period(ab, ac, bc) - ac) * (this.period(ab, ac, bc) - bc));
		}

		return rsl;
	}

	/**
	 * The method checks whether it is possible to construct a triangle with such lengths of sides.
	 * <p>
	 *
	 * @param ab Length from point a to b.
	 * @param ac Length from point a to c.
	 * @param bc Length from point b to c.
	 * @return the boolean result.
	 */
	private boolean exist(double ab, double ac, double bc) {
		return (ab + bc > ac) && (bc + ac > ab) && (ac + ab > bc);
	}

	public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(1, 5), new Point(3, 7), new Point(2, 4));

        System.out.println("Area = " + triangle.area());
    }
}