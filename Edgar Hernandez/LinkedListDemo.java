package com.amdocs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> arr = new LinkedList<>();
		arr.add("Unix");
		arr.add("SQL");
		arr.add("PLSQL");
		arr.add("Agile");
		arr.add("DevOps");
		arr.add("Java");
		arr.add("GenAI");
		
		System.out.println(arr);
		System.out.println(arr.get(5));
		
		arr.add(5, "Case study");
		System.out.println(arr);
		
		System.out.println(arr.contains("python"));
		System.out.println(arr.indexOf("Agile"));
		
		arr.remove("Case study");
		System.out.println(arr);
		
		System.out.println("Use loops");
		for(int i =0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("\nEnhanced for loop / foreach loop");
		for(String data : arr) {
			System.out.println(data);
		}
		
		System.out.println("/nUsing iterator");
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
