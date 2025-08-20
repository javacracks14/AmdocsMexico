package com.amdocs;

public class OperatorsDemo {
	public static void main(String[] args) {
		int number1=10, number2=8,number3 = 8, output;
		output = number1 + number2;
		System.out.println("addition output is: "+output);
		output = number1 - number2;
		System.out.println("addition output is: "+output);
		output = number1 * number2;
		System.out.println("addition output is: "+output);
		output = number1 / number2;
		System.out.println("addition output is: "+output);
		output = number1 % number2;
		System.out.println("addition output is: "+output);
		
		System.out.println("number1 values is: "+ number1 + "\tNumber2 values is : "+number2);
		number1+=number2;
		number1-=number2;
		number1*=number2;
		number2/=number1;
		System.out.println("Number1 value is: "+number1+"\tNumber2 Values is: "+number2);
		System.out.println("Logical AND operator value is: "+(number1>number2 && number1==3));
		System.out.println("Logical OR operator value is: "+(number1>number2 || number1==3));
		System.out.println("Logical NOT operator value is: "+(number1>number2 && number1!=3));
		
		System.out.println("Value of number is:"+ number1);
		System.out.println("Increment operation: "+(number1++));
		System.out.println("Value of number after increment is: "+number1);
		System.out.println();
		System.out.println("Value of number is:"+ number1);
		System.out.println("Increment operation: "+(++number1));
		System.out.println("Value of number after increment is: "+number1);
		System.out.println();
		System.out.println("Value of number is:"+ number1);
		System.out.println("Increment operation: "+(number1--));
		System.out.println("Value of number after decrement is: "+number1);
		System.out.println();
		System.out.println("Value of number is:"+ number1);
		System.out.println("Increment operation: "+(--number1));
		System.out.println("Value of number after decrement is: "+number1);
		System.out.println();
		
		
		System.out.println(number1>number2? "number1 is greater":"number2 is greater");
		
		
		
	}
}
