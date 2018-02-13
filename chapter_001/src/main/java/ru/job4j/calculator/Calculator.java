package ru.job4j.calculator;

public class Calculator {
    
	private double result;
	
	private void add(double first, double second) {
		this.result = first + second;
	}
	
	private void subtract(double first, double second) {
		this.result = first - second;
	}
	
	private void div(double first, double second) {
		this.result = first / second;
	}
	
	private void multiple(double first, double second) {
		this.result = first * second;
	}
	
	public double getResultResult(double first, double second) {
		return this.result;
	}
/*	
	public static void main(String{} args) {
	    
	}	
*/	
}