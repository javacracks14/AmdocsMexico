package DynamicCollections;

import java.util.ArrayDeque;

public class ArrayDequeue {
	public static void main(String[] args) {
		ArrayDeque<String> pObj = new ArrayDeque<String>();
		pObj.add("Unix");
		pObj.add("SQL");
		pObj.add("PL/SQL");
		pObj.add("Agile");
		pObj.add("DevOps");
		pObj.add("Java");
		pObj.add("GenAI");
		
		System.out.println(pObj);
		pObj.remove();
		System.out.println(pObj);
		pObj.offer("Case study");
		System.out.println(pObj);
		pObj.addFirst("Case study");
		System.out.println(pObj);
}
}
