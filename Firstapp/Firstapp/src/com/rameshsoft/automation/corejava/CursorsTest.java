package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CursorsTest {
	public static void main(String[] args) {
		
		Set set=new HashSet(); 
		set.add("Hello");
		set.add("java");
		set.add("program");
	    set.add("practice");
		set.add("work");
		set.add("job");
		  
		  for(Object obj:set)
		  {
			  
			  String str=(String) obj;
		  if(str.equalsIgnoreCase("java"))
		  {
			  System.out.println("It is Working");
			  }
		 System.out.println(str);
		 }

		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * int[] a= {1,33,45,533,62,655};
		 * 
		 * for(int i :a) { if(i==533) { System.out.println("It is working"); }
		 * System.out.println(i); }
		 */
		
		
		
		
		
		
		
		/* normal forloop
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		/*
		 * Set set=new HashSet(); set.add("Hello"); set.add("java"); set.add("program");
		 * set.add("practice"); set.add("work"); set.add("job");
		 * 
		 * Iterator itr= set.iterator();
		 * 
		 * while(itr.hasNext()) { Object obj=itr.next(); String str=(String) obj;
		 * if(str.equalsIgnoreCase("java")) { System.out.println("It is Working"); }
		 * System.out.println(str); }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * List list =new ArrayList<>(); list.add(33); list.add(232); list.add(324);
		 * list.add(54); list.add(3); list.add(1);
		 * 
		 * //System.out.println(list); ListIterator itr= list.listIterator();
		 * 
		 * //to check whether the element is their or not we have a method called
		 * hasnext while(itr.hasNext()) { Object obj = itr.next();
		 * System.out.println(obj); Integer i=(Integer) obj; if(i==1) {
		 * System.out.println("It is explicit type "); } }
		 */

	}

}
