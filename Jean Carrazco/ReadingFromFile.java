package com.amdocs;

import java.io.DataOutputStream;

//import java.io.FileReader;
//import java.io.IOException;
//
//public class ReadingFromFile {
//    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("character.txt"); // Opening the file
//        int ch;
//        while ((ch = fr.read()) != -1) { // Reading character by character
//            System.out.print((char) ch); // Convert int to char before printing
//        }
//        fr.close();
//        System.out.println("\nCharacter file is read successfully");
//    }
//}
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class ReadingFromFile {
//    public static void main(String[] args) throws IOException {
//    	FileInputStream fr = new FileInputStream("bytes.txt"); // Opening the file
//        int ch;
//        while ((ch = fr.read()) != -1) { // Reading character by character
//            System.out.print((char) ch); // Convert int to char before printing
//        }
//        fr.close();
//        System.out.println("\nCharacter file is read successfully");
//    }
//}

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("data.txt"); // Opening the file
        DataInputStream dis = new DataInputStream(fr); // Reading binary data

        int highScore = dis.readInt(); // Read an int
        dis.close();
        fr.close();

        System.out.println(highScore);
        System.out.println("Data read successfully");
    }
}



