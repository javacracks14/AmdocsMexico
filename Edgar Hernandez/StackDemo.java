package com.amdocs;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("Unix");
		st.push("SQL");
		st.push("PLSQL");
		st.push("Agile");
		st.push("DevOps");
		st.push("Java");
		
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search("SQL"));
	}
}
