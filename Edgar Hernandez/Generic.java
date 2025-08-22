package com.amdocs;

//public class Generic <T>{
//	private T num;
//	
//	public Generic(T num) {
//		this.num = num;
//	}
//	
//	public T getNum() {
//		return num;
//	}
//}

public class Generic <T extends Number>{
	private T num;
	
	public Generic(T num) {
		this.num = num;
	}
	
	public T getNum() {
		return num;
	}
}
