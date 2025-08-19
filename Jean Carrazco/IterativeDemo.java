package com.amdocs;

//public class IterativeDemo {
//	public static void main(String[] args) {
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("Hello Java Developers");
//		}
//		System.out.println("Outside of loop");
//	}
//}
//public class IterativeDemo {
//	public static void main(String[] args) {
//		int i =1;
//		while (i<=7) {
//			System.out.println("Hello Java Developers");
//			i++;
//		}
//		System.out.println("Outside of loop");
//	}
//}
//public class IterativeDemo {
//	public static void main(String[] args) {
//		int i =1;
//		do {
//			System.out.println("Hello Java Developers");
//			i++;
//		}
//		while(i<=7);
//		System.out.println("Outside of loop");
//	}
//}
public class IterativeDemo {
	public static void main(String[] args) {
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=5; col++) {
				System.out.print(row+" ");
		}
		System.out.println();
		}
		System.out.println("Outside");
}
}
