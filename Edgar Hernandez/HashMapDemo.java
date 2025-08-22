package com.amdocs;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap<>();
	
	map.put(11223,"IT Support");
	map.put(11233,"HR Support");
	map.put(12233,"Duty Manager");
	map.put(12323,"Floor SPOC");
	
	System.out.println(map);
	System.out.println(map.get(11233));
	System.out.println(map.remove(12233));
	
	for(Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey()+"\t"+data.getValue());
	}
}
}
