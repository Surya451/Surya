package com.surya.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {
	
	public static void main(String[] args) {
		
		String PhNo="8885547576";
		
		
		
		System.out.println(RegExPhUtility.isValidPhNum(PhNo));
		
		
		
		
		/*
		 * Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}"); Matcher matcher
		 * =pattern.matcher(PhNo);
		 * 
		 * if (matcher.find()&&matcher.group().equalsIgnoreCase(PhNo)) {
		 * System.out.println("Valid phone no");
		 * 
		 * } else { System.out.println("InValid phone no"); }
		 */
		
		
	}
	
	
	
	

}
