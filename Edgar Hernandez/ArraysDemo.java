package com.amdocs;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] marks = new int[6];
		marks[0] = 9;
		marks[1] = 10;
		marks[2] = 10;
		marks[3] = 8;
		marks[4] = 10;
		marks[5] = 10;
		System.out.println(marks[4]);
		for (int i = 0; i<marks.length;i++) {
			System.out.println("Module: "+(i+1)+" Score is: "+marks[i]);
		}
		System.out.println("\nUsing For each loop");
		int j = 1;
		for(int singleScore : marks) {
			System.out.println("Module: "+j+" Score is: "+singleScore);
			j++;
		}
		
		
	}
	
}
