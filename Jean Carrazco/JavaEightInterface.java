package com.amdocs;

public class JavaEightInterface implements Demo {
    @Override
    public void showMessage() {
        System.out.println("We have overridden the showMessage method");
    }

    // No need to override sayHi() if it's static in the interface
}
