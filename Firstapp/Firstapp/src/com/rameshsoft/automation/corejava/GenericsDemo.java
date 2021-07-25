package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsDemo {
	public static void main(String[] args) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		map.put('s', 44);
		map.put('e', 444);
		map.put('w', 3244);
		map.put('a', 776);
		map.put('t', 490);
		//System.out.println(map);
		
		Object obj = map.containsKey('a');
		
		System.out.println(obj);
		
		
		
		
		
		
		
		
		
		/*
		 * List<Integer> l =new ArrayList<Integer>(); l.add(33); l.add(22); l.add(3443);
		 * l.add(343); l.add(33333); l.add(233);
		 * 
		 * Iterator<Integer> itr= l.iterator();
		 * 
		 * while(itr.hasNext()) { Integer i = itr.next(); if(i==34443) {
		 * System.out.println("I understand Generic Methods"); } else {
		 * System.out.println("Not understand Generics"); }
		 * 
		 * }
		 */

}
}
