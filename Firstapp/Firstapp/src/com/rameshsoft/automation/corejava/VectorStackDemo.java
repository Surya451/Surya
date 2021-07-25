package com.rameshsoft.automation.corejava;

import java.util.Stack;
import java.util.Vector;

public class VectorStackDemo {
	public static void main(String[] args) {
		
		Stack stack=new Stack<>();
		stack.add(889);
		stack.add(0, 's');
		stack.addElement(77);
        System.out.println(stack);
        System.out.println(stack.push("hello"));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Vector vector=new Vector<>(); vector.add(44); vector.add(0, 's');
		 * vector.addElement("hello"); vector.add(44);
		 * 
		 * System.out.println(vector); System.out.println(vector.firstElement());
		 * System.out.println(vector.remove(2)); System.out.println(vector);
		 */
		
	}

}
