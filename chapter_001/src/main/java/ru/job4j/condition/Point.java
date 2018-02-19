package ru.job4j.condition;
/**
 * Point. Class calculates the distance between two points.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
*/
public class Point {
	
	private int x;
	private int y;
 	
	/**
     * Method construct. Initializes the object by default values.
	 * @param x, x value.
	 * @param y - y value.
     * @return result of the distance.
     */
	public  Point(int x, int y) {
	  this.x = x;
	  this.y = y;
	}
	
	/**
     * Method distanceTo. Calculates the distance between two points .
     * @return result of distance.
     */
	public double distanceTo(Point that) {
		Point a = this;
		Point b = that;

		return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
	}
	
	/**
     * Main.
     * @param args - args.
     */
	public static void main(String[] args) {
		Point a = new Point(0, 1);
		Point b = new Point(3, 5);
		
		System.out.println("x1 = " + a.x);
		System.out.println("y1 = " + a.y);
		System.out.println("x2 = " + b.x);
		System.out.println("y2 = " + b.y);
		
		double result = a.distanceTo(b);
		
		System.out.println("Расстояние между точками А и В : " + result);
	}
}