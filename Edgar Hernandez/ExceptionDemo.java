package com.amdocs;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start");
		int number1 = 10, number2 = 0, output;
		try {
			CalculatorExceptions calc = new CalculatorExceptions();
			calc.divide(number1, number2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block");
		}
		System.out.println("STOP");
	}
}
