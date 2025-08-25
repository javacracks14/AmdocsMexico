//package com.amdocs;
//
//public class MyDate {
//	int day, month, year;
//
//	public void initDateday() {
//		day = 20;
//		month = 12;
//		year = 2002;
//
//	}
//
//	public void dispdate() {
//		System.out.println(day + " " + month + " " + year);
//	}
//}
//package com.amdocs;
//
//public class MyDate {
//	int day, month, year;
//
//	public MyDate() { //default
//		day = 20;
//		month = 12;
//		year = 2002;
//
//	}
//
//	public MyDate(int d, int m, int y) {
//		day = d;
//		month = m;
//		year = y;
//	}
//	public void dispdate() {
//		System.out.println(day + " " + month + " " + year);
//	}
//	//Accesor & Mutator
//	public int getDay() {
//		return day;
//	}
//	public void setDay(int d) {
//		 day = d;
//	}
//	public int getMonth() {
//		return day;
//	}
//	public void setMonth(int m) {
//		 month = m;
//	}
//	public int getYear() {
//		return day;
//	}
//	public void getYear(int y) {
//		 year = y;
//	}
//	
//}
package com.amdocs;

public class MyDate {
    private int day, month, year;

    public MyDate() {
        day = 20;
        month = 12;
        year = 2002;
}

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void dispdate() {
        System.out.println(this.getDay() + " " + this.getMonth() + " " + this.getYear());
    }

    // Accesssors (Getters)
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    // Mutators (Setters)
    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }
    public void setYear(int y) {
        year = y;
    }
}

