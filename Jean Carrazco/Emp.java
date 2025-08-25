package com.amdocs;

public class Emp {
	private int empid;
	private String name;
	private double salary;
	private static int count;
	
	public Emp(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		count ++;
	}
	public void displayEmployeeRecords() {
		System.out.println("Empid: "+empid+"\nName: "+name+"\nSalary: "+salary);
	}
	public static void displayTotalEmployeeCount() {
		System.out.println("Total Employee: "+ count);
	}
}
