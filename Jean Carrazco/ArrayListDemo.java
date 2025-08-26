package DynamicCollections;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Unix");
		arr.add("SQL");
		arr.add("PL/SQL");
		arr.add("Agile");
		arr.add("DevOps");
		arr.add("Java");
		arr.add("GenAI");
		System.out.println(arr);
		System.out.println(arr.get(4));
		arr.add(5,"Case Study");
		System.out.println(arr);
		System.out.println(arr.contains("Python"));
		System.out.println(arr.indexOf("Agile"));
		arr.remove("Case study");
		System.out.println(arr);
		
		
		
		System.out.println("Use Loops: ");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("\nEnchanced for loop (For esch loop): ");
		for(String data: arr) {
			System.out.println(data);
		}
		System.out.println("\nUsing iterator interface: ");
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
