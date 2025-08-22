package com.amdocs;

public class CalculatorExceptions {
	public void divide(int n1, int n2) {
		if (n2 == 0) {
			throw new ArithmeticException("Number cannot be divided by zero");

		} else {
			System.out.println(n1 / n2);
		}
	}
//	public void divide(int n1,int n2) throws ArithmeticException{
//		System.out.println(n1/n2);
//	}
}
