package com.amdocs;

//public class GenericMain {
//	public static void main(String[] args) {
//		Generic<Integer> gen = new Generic<>(10);
//		System.out.println(gen.getNum());
//		
//		Generic<String> gen2 = new Generic<>("Hello");
//		System.out.println(gen2.getNum());
//		
//	}
//}

public class GenericMain {
	public static void main(String[] args) {
		Generic<Integer> gen = new Generic<>(10);
		System.out.println(gen.getNum());
		
		Generic<Double> gen2 = new Generic<>(17.6);
		System.out.println(gen2.getNum());
		
	}
}