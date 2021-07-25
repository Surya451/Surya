package com.rameshsoft.automation.corejava;

import java.util.Comparator;
import java.util.TreeSet;


class CustomSorting implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		//System.out.println(1);
		String s1= (String) o1;
		String s2= (String) o2;
		return -s2.compareTo(s1);
	}
	
}

public class SortingTest {
	public static void main(String[] args) {
		CustomSorting sorting= new CustomSorting();
		
		TreeSet set= new TreeSet<>(sorting);
		set.add("hello");
		set.add("practice");
		set.add("zwww");
		set.add("basic");
		set.add("action");
		System.out.println(set);
	}

}
