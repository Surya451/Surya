package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List l=new ArrayList();
		System.out.println(l.add(55));
		System.out.println(l.add('s'));
		
		
		System.out.println(l.add(22));
		System.out.println(l.add('w'));
		
		System.out.println(l.add(5.88988));
		System.out.println(l.add("Hello"));
		
		System.out.println(l.add(55));
		System.out.println(l.add('s'));
		
		System.out.println(l.add(55));
		System.out.println(l.add('s'));
		
		System.out.println(l);
		
		System.out.println(l.get(7));;
		
		System.out.println(l.remove(8));
		
		
	}

}
