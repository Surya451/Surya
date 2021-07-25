package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayTest1 {
	public static void main(String[] args) {

		List list = new ArrayList<>();
		list.add(22);
		list.add(22);
		list.add(2);
		list.add(52);
		list.add(52);
		list.add(233);
		list.add(233);
		list.add(633);
		
		Set set=new HashSet<>();
		List list_Duplicate_Data=new ArrayList<>();
		
		for(int i=0;i<list.size();i++)
		{
			Object obj =list.get(i);
			boolean status =set.add(obj);
			if (status) {
				System.out.println(" ");
				}
			else {
				System.out.println("It is a duplicate element: "+obj);
				list_Duplicate_Data.add(obj);		
			}
			System.out.println("After removal of duplicate elements:"+set);
			System.out.println("Removed duplicate elements are: "+list_Duplicate_Data);
		}
		
		
		
		
		
		
		
		
		/*
		 * Set set=new HashSet<>(); for(int i=0;i<list.size();i++) { Object
		 * obj=list.get(i); set.add(obj); } System.out.println(set);
		 */
		
		
		
		
		
		
		
		
		
		

		/*
		 * Set set = new HashSet<>(list); System.out.println(set);
		 */
		/*
		 * set.addAll(list);
		 *  System.out.println(list);
		 * System.out.println(set);
		 */

		/*
		 * List list=new ArrayList<>(); list.add(33); list.add(233); list.add(2);
		 * list.add(87); list.add(876); System.out.println(list); //1.For sorting
		 * Collections.sort(list); System.out.println("After Sorting:-");
		 * System.out.println(list); //2.To get min&max no's Object min_num =
		 * list.get(0); Object max_num = list.get(list.size()-1);
		 * 
		 * System.out.println("Minimum no: "+min_num);
		 * System.out.println("Maximum no: "+max_num);
		 */

		/*
		 * int[] a={22,223,34,13,3,2,4}; for(int i=0;i<a.length;i++) {
		 * System.out.println(a[i]); } System.out.println("After Sorting : "); int key =
		 * Arrays.binarySearch(a, 13); System.out.println("KEY: "+ key); List list=
		 * Arrays.asList(a); Arrays.sort(a); for(int i=0;i<a.length;i++) {
		 * System.out.println(a[i]); }
		 */

	}
}
