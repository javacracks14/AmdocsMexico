package com.amdocs;

public class ShapeMain {
	public static void main(String[] args) {
		// Shape s1 = new Shape(); not allowed because of abstract class
		Shape rect = new Rectangle();
		rect.area();
	}
}
