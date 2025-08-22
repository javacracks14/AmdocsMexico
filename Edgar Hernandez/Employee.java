package com.amdocs;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private static int count;
	
	public Employee() {
		empid = 101;
		name = "John";
		salary = 25000;
		System.out.println("Employee Default Constructor");
	}
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee parameter Constructor");
	}
	
	public void dispEmployeeRecords() {
		System.out.println("Empid: "+empid+"\nName"+name+"\nGross Salary"+salary);
	}
	
	public void calculateSalary() {
		System.out.println("Deduction: 200\nNET SALARY: "+(this.salary-200));
	}
	public double getSalary() {
		return salary;
	}
	
	public static void displayTotalEmployeeCount() {
		System.out.println("Total employees: "+count);
	}
}
