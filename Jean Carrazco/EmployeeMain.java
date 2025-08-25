//package com.amdocs;
//
//public class EmployeeMain {
//	public static void main(String[] args) {
//		Manager manObj = new Manager();
//		manObj.dispEmployeeRecords();
//		manObj.dispManagerRecords();
//		manObj.CalculateSalary();
//		
//		Employee empObj = new Employee();
//		empObj.dispEmployeeRecords();
//		empObj.CalculateSalary();
//	}
//
//}
package com.amdocs;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee empObj = new Manager(25,1500.0);
		empObj.dispEmployeeRecords();
		empObj.CalculateSalary();
		((Manager)empObj).dispManagerRecords();
	}

}
