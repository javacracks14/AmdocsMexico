package com.amdocs;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
	PriorityQueue<String> pObj = new PriorityQueue<String>();
	
	pObj.add("Unix");
	pObj.add("SQL");
	pObj.add("PLSQL");
	pObj.add("Agile");
	pObj.add("DevOps");
	pObj.add("Java");
	
	System.out.println(pObj);
	pObj.remove();
	System.out.println("Case study");
	System.out.println(pObj);
}
}
