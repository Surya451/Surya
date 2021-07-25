package com.rameshsoft.automation.corejava;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet set=new TreeSet<>();
		set.add(55);
		set.add(98);
		set.add(5646);
		set.add(2);
		set.add(786);
		set.add(88);
		System.out.println(set);
		
		TreeSet set1=new TreeSet<>();
		set1.add("hello");
		set1.add("abc");
		set1.add("java");
		set1.add("surya");
		set1.add("practice");
		System.out.println(set1);
		
		TreeSet set2=new TreeSet<>();
		
		String s1="hiii";
		String s2="abc";
		String s3="bcd";
		String s4="cde";
		
		set2.add(s1);
		set2.add(s2);
		set2.add(s3);
		set2.add(s4);
		System.out.println(set2);
		
		
		
		
	}

}
