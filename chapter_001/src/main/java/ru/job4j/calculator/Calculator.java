package ru.job4j.calculator;

/**
 * Class Calculator makes some mathematical operations.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Calculator {
    /**
	 * A variable of mathematical operations value.
	 */
	private double result;
	
	/**
	 * add. Method summarize two values.
	 * @param first, first value.
	 * @param second, second value.
	 */
	public void add(double first, double second) {
		this.result = first + second;
	}
	
	/**
	 * subtract. Subtracts one values from the other one value.
	 * @param first, first value.
	 * @param second, second value.
	 */
	public void subtract(double first, double second) {
		this.result = first - second;
	}
	
	/**
	 * divide. Divides one number by another.
	 * @param first, first value.
	 * @param second, second value.
	 */
	public void div(double first, double second) {
		this.result = first / second;
	}
	
	/**
	 * multiple. Multiplies one number on another.
	 * @param first, first value.
	 * @param second, second value.
	 */
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	
	/**
	 * getResult. Ger the value of variable result.
	 * @return result.
	 */
	public double getResult() {
		return this.result;
	}
/*	
	public static void main(String{} args) {
	    
	}	
*/	
}