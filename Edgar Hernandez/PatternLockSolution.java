package com.amdocs;

import java.util.Scanner;

public class PatternLockSolution {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			count++;
			if(count == 6||count == 12) {
				System.out.println("Pause for 30 seconds");
			}else if (count == 18) {
				System.out.println("Your account is locked");
				break;
			}else {
				System.out.println("Enter your password");
				int passKey = sc.nextInt();
				if(passKey == 1234) {
					System.out.println("Welcome user..");
					break;
				}
			}
		}
	}
}
