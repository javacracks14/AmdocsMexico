package com.amdocs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> arr = new HashSet<>();
		arr.add("Unix");
		arr.add("SQL");
		arr.add("PLSQL");
		arr.add("Agile");
		arr.add("DevOps");
		arr.add("Java");
		arr.add("GenAI");
		
		System.out.println(arr);
		
		System.out.println("/nUsing iterator");
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
