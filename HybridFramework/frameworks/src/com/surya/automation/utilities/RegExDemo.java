package com.surya.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegExDemo {
	public static void main(String[] args) {
		Pattern pattern =Pattern.compile("[0-9]");
	    Matcher matcher = pattern.matcher("keep !p@ractice32 unti13l Yo34u ge1t job");
	    int aCount=0;
	    int sum=0;
	    
	    while(matcher.find()) {
	    	aCount++;
	    	String matchedGroup =matcher.group();
	    	int i =Integer.parseInt(matchedGroup);
	    	sum=sum+i;
	    	
	    	System.out.println(matchedGroup);
	    	int start_Index = matcher.start();
	    	int end_Index =matcher.end();
	    	System.out.println(start_Index+" "+end_Index);
	    	
	    }
	
	System.out.println("No of occurence of a: "+aCount);
	
	System.out.println("sum is: "+sum);
	}
	
 
}
