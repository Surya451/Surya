package com.surya.automation.customisedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsDemo {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		try {
			
		FileInputStream fip =new FileInputStream("D:\\Java Programs\\frameworks\\config1.properties");
	
		}
		catch(FileNotFoundException fne)
		{
			System.out.println("FNE");
		}
		catch(Exception e){
			System.out.println("catch block");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
             System.out.println(e.toString()); 		
		}
		
		System.out.println("3");
		System.out.println("4");
		
	}
	
	

}
