package com.amdocs;

public class EmpMain {
    public static void main(String[] args) {
        Emp e1 = new Emp(101, "Alice", 50000);
        Emp e2 = new Emp(102, "Bob", 60000);
        
        e1.displayEmployeeRecords();
        e2.displayEmployeeRecords();
        
        Emp.displayTotalEmployeeCount();
    }
}
