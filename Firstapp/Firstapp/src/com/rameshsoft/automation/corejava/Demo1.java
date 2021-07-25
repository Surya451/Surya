package com.rameshsoft.automation.corejava;
//Static methods by calling their class names

public class Demo1 {
	static int a=22;
	static int b=66;
	static String id="hello";
	public static void display() {
     System.out.println("hii");
	}
  static public void hii() {
     System.out.println("innnn");
}
  public static void main(String[] args) {
	System.out.println(a);
	System.out.println(id);
	Demo1.display();
	Demo1.hii();
}
}
