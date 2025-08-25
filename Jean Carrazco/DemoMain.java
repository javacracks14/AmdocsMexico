package com.amdocs;

public class DemoMain {
    public static void main(String[] args) {
        JavaEightInterface interObj = new JavaEightInterface();
        interObj.showMessage();     // Instance method
        Demo.sayHi();               // Static method from interface
    }
}
