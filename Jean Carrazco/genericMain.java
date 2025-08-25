package com.amdocs;

//public class genericMain {
//	public static void main(String[] args) {
//		generic<Integer>gen = new generic<Integer>(10);
//		System.out.println(gen.getNum());
//		generic<String>gen2 = new generic<String>("Hello");
//		System.out.println(gen2.getNum());
//	}
//
//}
public class genericMain {
	public static void main(String[] args) {
		generic<Integer>gen = new generic<Integer>(10);
		System.out.println(gen.getNum());
		
		generic<String>gen2 = new generic<String>("Hello");
		System.out.println(gen2.getNum());
	}

}
