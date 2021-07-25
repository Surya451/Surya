package com.rameshsoft.automation.corejava;

import java.util.Scanner;

public class Demo4 {
int a,b;
String name;
public void display() {
  int c=a+b;
  System.out.println("The value of c= "+c);
  System.out.println("My name is:"+name);
}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a: ");
	int consA=scanner.nextInt();
	System.out.println("Enter b: ");
	int consB=scanner.nextInt();
	Demo4 demo=new Demo4();
	demo.a=consA;
	demo.b=consB;
	System.out.println("Enter name: ");
	String consNAME=scanner.next();
	demo.name=consNAME;
	demo.display();
}
}
