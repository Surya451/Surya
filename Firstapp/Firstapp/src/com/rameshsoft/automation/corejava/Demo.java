package com.rameshsoft.automation.corejava;

//Static methods directly by calling their names
public class Demo {
	static int a=22;
	static int b=66;
	public static void hello() {
		System.out.println("hello");

	}
	public static void display() {
       System.out.println("hellow world");
	}
	public static void main(String[] args) {
		System.out.println("the value of a: "+a);
		System.out.println("the value of b: "+b);
		display();
		hello();
	}
	
	

}
