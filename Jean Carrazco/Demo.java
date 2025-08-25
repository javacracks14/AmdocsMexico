package com.amdocs;

public interface Demo {
    default void showMessage() {
    	System.out.println("Weare learning java 8 interface");
    }

    static void sayHi() {
        System.out.println("hello from java 8");
    }
}

