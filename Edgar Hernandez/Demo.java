package com.amdocs;

public interface Demo {
	
	default void showMessage() {
		System.out.println("We are learning Java 8 Interfaces");
	}
	
	static void sayHi() {
		System.out.println("Hello from java 8");
	}

}
