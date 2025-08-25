package com.amdocs;

public class generic <T>{
	private T num;
	public generic (T num) {
		this.num=num;
	}
	public T getNum() {
		return num;
	}

}
//public class generic <T extends Integer>{
//	private T num;
//	public generic (T num) {
//		this.num=num;
//	}
//	public T getNum() {
//		return num;
//	}
//
//}
