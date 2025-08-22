package com.amdocs;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> arr = new TreeSet<>();

		arr.add("Unix");
		arr.add("SQL");
		arr.add("PLSQL");
		arr.add("Agile");
		arr.add("DevOps");
		arr.add("Java");
		arr.add("GenAI");

		System.out.println(arr);

		System.out.println(arr.ceiling("B"));
		System.out.println(arr.floor("B"));
		System.out.println(arr.higher("D"));
		System.out.println(arr.lower("A"));
	}

}
