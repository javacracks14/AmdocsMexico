package com.amdocs;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

//public class ReadingFromFile {
//	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("character.txt");
//		int ch;
//		while((ch=fr.read()) != -1) {
//			System.out.println(ch);
//		}
//		System.out.println("\nCharacter.txt file is read successfully");
//		fr.close();
//	}
//}

public class ReadingFromFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("data.txt");
		DataInputStream ds = new DataInputStream(fr);
		
		int highScore = ds.readInt();
		System.out.println(highScore);
		
		System.out.println("data.txt file is read successfully");
		ds.close();
		fr.close();
	}
}
