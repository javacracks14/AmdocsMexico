package com.amdocs;

public class BranchingDemo {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i + ". Hello java developers");

		}
		System.out.println("Outside loop");
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i + ". Hello java developers");

		}
		System.out.println("Outside loop");
	}
}
