package com.amdocs;

public class Manager extends Employee{
	private double bonus;
	private double totalReportees;
	
	public Manager() {
		totalReportees = 10;
		bonus = 10000;
		System.out.println("Manager default constructor");
	}
	
	public Manager(int totalReportees,double bonus) {
		super(102,"Juan",10000);
		this.totalReportees = totalReportees;
		this.bonus = bonus;
		System.out.println("Manager parameter constructor");
		
	}
	
	
	public void dispManagerRecords() {
		System.out.println("Total reportees: "+totalReportees+"\nBonus: "+bonus);
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("DEDUCTION: 500\nNET SALARY: "+((super.getSalary()+bonus)-500));
	}
	
}
