package com.amdocs;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
	public static void main(String[] args) {
		ArrayDeque<String> pObj = new ArrayDeque<String>();
		
		pObj.add("Unix");
		pObj.add("SQL");
		pObj.add("PLSQL");
		pObj.add("Agile");
		pObj.add("DevOps");
		pObj.add("Java");
		
		System.out.println(pObj);
		
		System.out.println(pObj);
		pObj.remove();
		System.out.println(pObj);
		pObj.offer("Case study");
		System.out.println(pObj);
		pObj.addFirst("Introduction");
		System.out.println(pObj);
		
	}
}
