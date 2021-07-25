package com.surya.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File ;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file =new File("D:\\Java Programs\\frameworks\\src\\com\\surya\\automation\\supporters\\demo.txt");
		boolean status =file.createNewFile();
		
		if(status) {
			System.out.println("new file is created");
		}
		else {
			System.out.println("Returns existing file");
		}
		
		FileReader fr=new FileReader(file);
		BufferedReader br =new BufferedReader(fr);
		while(br.ready()) {
			String data=br.readLine();
			System.out.println(data);
		}
		
		
		
		
		
		/*
		 * //FileWriter fw =new FileWriter(file); FileWriter fw =new
		 * FileWriter(file,true); BufferedWriter bw= new BufferedWriter(fw);
		 * 
		 * bw.write("Hello"); bw.newLine(); bw.write("Java"); bw.newLine();
		 * bw.write("C"); bw.newLine(); bw.write("New"); bw.newLine(); bw.flush();
		 */
		
		
	}
	
	

}
