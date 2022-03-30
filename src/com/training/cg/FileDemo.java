package com.training.cg;

import java.io.*;
//BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException{
		// Instantiating a File object
		@SuppressWarnings("unused")
		File file = new File("Letter.txt");
		
		
		// Creating a new File
		
//		boolean val = false;
//		try {
//			val = file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		if(val) {
//			System.out.println("File Created Successfully");
//		}
//		else {
//			System.out.println("Unable to create file");
//		}
		
		
		// Reading a file using FileReader
		
//		char[]  arr = new char[(int)file.length()];
//		FileReader input = null;
//		try {
//			input = new FileReader("Letter.txt");
//			input.read(arr);
//			System.out.print(arr);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			input.close();
//		}
		
		
		// Reading a file using BufferedReader
		
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader(file));
//			br.lines().forEach(System.out::println);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally {
//			br.close();
//		}
		
		
		// Writing in a file using BufferedWriter
		
//		FileWriter fw = new FileWriter(file);
//		BufferedWriter bw = null;
//		try {
//			bw = new BufferedWriter(fw);
//			bw.write("This statement is written through the Java code");
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally {
//			bw.close();
//		}
		
		// Writing in a file using only FileWriter
		
//		FileWriter fw = new FileWriter(file);
//		String str = "This string is added to this file";
//		char[] arr = str.toCharArray();
//		
//		try {
//			fw.write(arr);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			fw.close();
//		}
		
		
		
		// Deleting a file
		
//		if(file.delete()) {
//			System.out.println("The file is deleted Successfully");
//		}
//		else {
//			System.out.println("Unable to delete file");
//		}
		
		
		
	}
}
