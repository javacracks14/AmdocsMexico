package com.amdocs;

import java.util.Scanner;

public class DecisionControlDemo {
	public static void main(String[] args) {
		int time;
		System.out.println("Enter the time");
		Scanner sc = new Scanner(System.in);
		
		time = sc.nextInt();
		System.out.println("The number entered is: "+time);
		
		if(time >= 9 && time <11 || time>11 && time<13 || time >=14 && time<16 || time>16 &&time <18) {
			System.out.println("Welcome to amdocs java session");
		}else if (time == 11 || time == 16) {
			System.out.println("15 minutes tea break");
		}else if (time == 13) {
			System.out.println("Lunch break");
		}else if (time >=18 && time<=24) {
			System.out.println("Session has ended. We will start it next day");
		}else if (time > 0 && time <9) {
			System.out.println("Yet to Start the session. Please wait till 9:00AM");
		}else {
			System.out.println("Invalid time...");
		}
		
	}
}
