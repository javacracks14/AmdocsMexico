//package com.amdocs;
//
//public class DateMain {
//	public static void main(String[] args) {
//		MyDate dateObj = new MyDate();
//		dateObj.initDateday();
//		dateObj.dispdate();
//
//	}
//}
//package com.amdocs;
//
//public class DateMain {
//	public static void main(String[] args) {
//		MyDate dateObj = new MyDate();
//		dateObj.dispdate();
//		MyDate dateObj1 = new MyDate(25,12,2025);
//		dateObj1.dispdate();
//	}
//}
package com.amdocs;

public class DateMain {
	public static void main(String[] args) {
		
		MyDate dateObj = new MyDate(25,12,2025);
		dateObj.dispdate();
		dateObj.setDay(31);
		System.out.println("Day is changed to "+dateObj.getDay());
		dateObj.dispdate();
	}
}
