package com.rameshsoft.automation.corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		//Set set =new HashSet<>();
		//HashSet set=new HashSet<>();
		//Set set = new LinkedHashSet<>();
		LinkedHashSet set =new LinkedHashSet<>();
		System.out.println(set.add(55));
		System.out.println(set.add('w'));
		System.out.println(set.add("hello"));
		System.out.println(set.add(55));
		System.out.println(set.add('r'));
		System.out.println(set.add(323.33));
		System.out.println(set);
	}

}
