package com.rameshsoft.automation.corejava;
//Static methods by creating object


public class Demo2 {
	 int a=33;
	static int b=222;
	public static void display() {
   System.out.println("hiii");
	}
	public static void hello() {
   System.out.println("helllllo");
	}
	public static void main(String[] args) {
		Demo2 demo2=new Demo2();
		int c=demo2.a;
		System.out.println(c);
		Demo2.display();
		Demo2.hello();
		
		
	}

}
