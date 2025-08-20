//package com.amdocs;
//
//public class MyDate {
//	int day,year,month;
//	
//	public void initDate() {
//		day = 20;
//		month = 7;
//		year = 2020;
//	}
//	
//	public void dispDate() {
//		System.out.println("Date is: "+month+"/"+day+"/"+year);
//	}
//}

package com.amdocs;

public class MyDate {
	private int day,year,month;
	
	public MyDate() {
		day = 20;
		month = 7;
		year = 2020;
	}
	
	public MyDate (int day, int month, int year) {
		this();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void dispDate() {
		System.out.println("Date is: "+month+"/"+day+"/"+year);
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
