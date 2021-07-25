package com.rameshsoft.automation.corejava;

import java.util.Scanner;

public class Test2 {
	int a;
	int b;
	public void add() {
     int c=a+b;
     System.out.println("The value of c= "+c);
	}
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter a value: ");
	 int consA=scanner.nextInt();
	 System.out.println("Enter b value: ");
	 int consB=scanner.nextInt();
	 
	 Test2 addition =new  Test2();
	 addition.a=consA;
	 addition.b=consB;
	 addition.add();
	 
	
	}
	

}
	


