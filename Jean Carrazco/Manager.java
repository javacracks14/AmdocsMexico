//package com.amdocs;
//
//public class Manager extends Employee {
//
//	private int totalReportees;
//	private double bonus;
//
//	public Manager() {
//		totalReportees = 10;
//		bonus = 10000.0;
//		System.out.println("Manager default constructor");
//	}
//
//	public Manager(int totalReportees, double bonus) {
//		this.totalReportees = 10;
//		this.bonus = 10000.0;
//		System.out.println("Manager parameter constructor");
//	}
//
//	public void dispManagerRecords() {
//		System.out.println("Reportees: " + totalReportees + "\nBonus: " + bonus);
//	}
//}
package com.amdocs;

public class Manager extends Employee {

	private int totalReportees;
	private double bonus;

	public Manager() {
		totalReportees = 10;
		bonus = 10000.0;
		System.out.println("Manager default constructor");
	}

	public Manager(int totalReportees, double bonus) {
		this.totalReportees = 10;
		this.bonus = 10000.0;
		System.out.println("Manager parameter constructor");
	}

	public void dispManagerRecords() {
		System.out.println("Reportees: " + totalReportees + "\nBonus: " + bonus);
	}
	@Override
	public void CalculateSalary() {
		System.out.println("Deduction: 500\nNet Salary:"+((super.getSalary()+bonus)-500));
	}
}
