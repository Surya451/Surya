package com.surya.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPhUtility {
	
	
	public static boolean isValidPhNum(String phNum) {
    boolean valid = true;
	Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
	Matcher matcher =pattern.matcher(phNum);
	
	if (matcher.find()&&matcher.group().equalsIgnoreCase(phNum)) {
		System.out.println("Valid phone no");
		
	}
	else {
		System.out.println("InValid phone no");
		valid = false;
	}
	return valid;
	
	}
}
