package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam {
	
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add("Hello");
		l.add("Practice");
		l.add("JOB");
		l.add("HII");
		l.add("JIII");
		 
	    Iterator itr = l.iterator();
	    
	    for(Object obj:l)
	    {
			String str=(String) obj;
			
			if(str.equalsIgnoreCase("hello"))
			{
				System.out.println("Code is Working");
			}
			System.out.println(str);
	    }
	    
	    
	    
	    
		
		/*
		 * while(itr.hasNext()) { Object obj =itr.next(); String str=(String) obj;
		 * 
		 * if(str.equalsIgnoreCase("hello")) { System.out.println("Practice"); }
		 * System.out.println(l); }
		 */
		
		
		
		
	}

}
