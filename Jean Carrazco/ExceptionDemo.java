package com.amdocs;

//public class ExceptionDemo {
//	public static void main(String[] args) {
//		System.out.println("Start");
//		int number1=10, number2 =0, output;
//		output = number1/number2;
//		System.out.println("Result: "+output);
//		System.out.println("stop");
//	}
//
//}
//public class ExceptionDemo {
//	public static void main(String[] args) {
//		System.out.println("Start");
//		int number1=10, number2 =0, output;
//		try {
//			output = number1/number2;
//			System.out.println("Result: "+output);
//		}
//		catch(ArithmeticException ex){
//			System.out.println(ex);
//		}
//		System.out.println("stop");
//	}
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start");
		int number1=10, number2 =0, output;
		try {
			Calculator cal = new Calculator();
			cal.add(number1, number2);
		}
		catch(ArithmeticException ex){
			ex.printStackTrace();
		}
		finally {
			System.out.println("finallyblock");
		}
		System.out.println("stop");
	}

}
