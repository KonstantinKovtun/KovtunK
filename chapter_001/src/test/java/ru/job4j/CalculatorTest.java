package ru.job4j.calculator;

public class Calculator {
    
	private double result;
	
	private static void add(double first, double second) {
		this.result = first + second;
	}
	
	private static void subtract(double first, double second) {
		this.result = first - second;
	}
	
	private static void div(double first, double second) {
		this.result = first / second;
	}
	
	private static void multiple(double first, double second) {
		this.result = first * second;
	}
	
	public double getResultResult(double first, double second) {
		return this.result;
	}
	
	public static void main(String{} args) {
	    
	}		
}