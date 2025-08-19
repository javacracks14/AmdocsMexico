package com.amdocs;
//import java.util.Scanner;
//
//public class DecisionControlDemo {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int time;
//	System.out.print("Enter the time: ");
//	time = sc.nextInt();
//	//System.out.println("Number enter is: "+time);
//	if(time==9) {
//	System.out.println("Welcome to amdocs java session");
//	}
//	else {
//		System.out.println("Error.......");
//	}
//	
//}
//}
//import java.util.Scanner;
//
//public class DecisionControlDemo {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int number;
//	System.out.print("Enter the number: ");
//	number = sc.nextInt();
//	//System.out.println("Number enter is: "+time);
//	if(number>=0) {
//		if(number == 0) {//inner or nested if
//			System.out.println("Neither");
//		}
//		else {
//			System.out.println("Positive number");
//		}
//	}
//	else {
//		System.out.println("Negative number");
//	}
//	
//}
//}
import java.util.Scanner;

public class DecisionControlDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int time;
	System.out.print("Enter the time: ");
	time = sc.nextInt();
	//System.out.println("Number enter is: "+time);
	if(time>=9 && time <11 || time>11 && time<13 || time>=14 && time<16 || time >16 && time<18) {
	System.out.println("Welcome to amdocs java session");
	}
	else if(time == 11 || time == 16){
		System.out.println("break");
	}
	else if(time == 13){
		System.out.println("Lunch time");
	}
	else if(time >=18 && time <=24){
		System.out.println("break");
	}
	else if(time >0 && time <9){
		System.out.println("Yet to start the session. Please wait till 9:00AM");
	}
	else{
		System.out.println("Invalid");
	}
}
}
