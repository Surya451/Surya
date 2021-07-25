package com.rameshsoft.automation.corejava;

import java.util.Scanner;

public class Test3 {
	int id;
	String name;
	public void display() {
      System.out.println(id+"********"+name);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id");
		int consId=scanner.nextInt();
	}
  
}
