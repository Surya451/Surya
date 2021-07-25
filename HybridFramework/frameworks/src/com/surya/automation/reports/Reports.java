 package com.surya.automation.reports;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.surya.automation.base.Base_Test;

public class Reports {

	public static void main(String[] args) {
		
		ExtentReports extentReports=new ExtentReports("D:\\Java Programs\\frameworks\\Reports\\report.html"); 
		Map<String, String> map =new HashedMap();
		map.put("User", "Surya");
		map.put("Ph_NO", "8885547576");
		extentReports.addSystemInfo(map);
		
		ExtentTest extentTest = extentReports.startTest("demo");
		
		extentTest.log(LogStatus.PASS, "Browser is opened");
		extentTest.log(LogStatus.PASS, "un is entered");
		extentTest.log(LogStatus.PASS, "cliked on the next button");
		
		extentReports.endTest(extentTest);
		extentReports.flush();
		extentReports.close();
		
		
		
		
		
	}
	
	
	
	
}
