//package com.amdocs;
//
//public class Employee {
//	private int empid;
//	private String name;
//	private double salary;
//
//	public Employee() {
//		empid = 101;
//		name = "Jhon";
//		salary = 25000.0;
//		System.out.println("Employee default constructor");
//	}
//
//	public Employee(int empid, String name, double salary) {
//		this.empid = empid;
//		this.name = name;
//		this.salary = salary;
//		System.out.println("Employee Parameter Constructor");
//	}
//
//	public void dispEmployeeRecords() {
//		System.out.println("EmpId: " + empid + "\nName: " + name + "\nSalary: " + salary);
//	}
//
//}
package com.amdocs;

public class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee() {
		empid = 101;
		name = "Jhon";
		salary = 25000.0;
		System.out.println("Employee default constructor");
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee Parameter Constructor");
	}

	public void dispEmployeeRecords() {
		System.out.println("EmpId: " + empid + "\nName: " + name + "\nSalary: " + salary);
	}
	public void CalculateSalary() {
		System.out.println("Deduction: 200\nNet Salary: "+(this.salary-200));
	}
	public double getSalary() {
		return salary;
	}

}
