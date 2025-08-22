package com.amdocs;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

//public class StoreDataInFile {
//	public static void main(String[] args) throws IOException {
//		File file = new File("demo.txt");
//		if (file.exists()) {
//			System.out.println("File is available in specified path");
//		} else {
//			file.createNewFile();
//			System.out.println("File is created");
//		}
//	}
//}

//public class StoreDataInFile{
//	public static void main(String[] args) throws IOException{
//		String data = "We are learning File Handling in Java";
//		FileWriter fw = new FileWriter("Character.text");
//		fw.write(data);
//		fw.close();
//		System.out.println("Data is stored in character.txt file");
//	}
//}


public class StoreDataInFile{
	public static void main(String[] args) throws IOException{
		int highScore = 101;
		FileOutputStream fw = new FileOutputStream("data.txt");
		DataOutputStream ds = new DataOutputStream(fw);
		ds.writeInt(highScore);
		ds.close();
		fw.close();
		System.out.println("Data is stored in data.txt file");
	}
}