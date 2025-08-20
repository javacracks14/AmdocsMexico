package com.amdocs;

import java.util.Iterator;

public class IterativeDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello java developers!");
		}
		System.out.println("Outside loop");
		System.out.println();
		int i = 0;
		while(i<7) {
			System.out.println("Hello java developers!");
			i++;
		}
		System.out.println("Outside loop");
		System.out.println();
		i = 10;
		do {
			System.out.println("Hello java developers!");
		}while(i<0);
		System.out.println("Outside loop");
		System.out.println();
		
		
		for (int row = 1;row<=5;row++ ) {
			for(int col = 1; col<=5;col++) {
				System.out.print(row+ " ");
			}
			System.out.println();
		}
		
	}
}
