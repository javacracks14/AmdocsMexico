package com.amdocs;

//import java.io.File;
//import java.io.IOException;
//
//public class StoreDataInFile {
//	public static void main(String[] args) throws IOException {
//		File file = new File("demo.txt");
//		if(file.exists()) {
//			System.out.println("File is avilable");
//		}
//		else {
//			file.createNewFile();
//			System.out.println("Unable to locate a file");
//		}
//	}
//
//}
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class StoreDataInFile {
//	public static void main(String[] args) throws IOException {
//		
//		String data = "We are learning File Handling in Java";
//		FileWriter fw = new FileWriter("character.txt");//opening a file
//		fw.write(data);
//		fw.close();
//		System.out.println("Data is stored");
//	}
//
//}
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class StoreDataInFile {
//	public static void main(String[] args) throws IOException {
//		
//		String data = "We are learning File Handling in Java";
//		FileOutputStream fw = new FileOutputStream("character.txt");//opening a file
//		byte[] bData = data.getBytes();
//		fw.write(bData);
//		fw.close();
//		System.out.println("Data is stored");
//	}
//
//}
import java.io.File;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class StoreDataInFile {
	public static void main(String[] args) throws IOException {
		
		int highScore = 101;
		FileOutputStream fw = new FileOutputStream("data.txt");
		DataOutputStream ds = new DataOutputStream(fw);
		ds.writeInt(highScore);
		ds.close();
		fw.close();
		System.out.println("Data is stored ind data.txt");
	}

}

