package com.surya.automation.utilities;

import com.surya.automation.base.Base_Test;

public interface DriverPaths {
	
	String chromekey="webdriver.chrome.driver";
	String edgekey="webdriver.edge.driver";
	
	String chromevalue=Base_Test.getCurDir()+"\\Drivers\\chromedriver.exe";
	String edgevalue=Base_Test.getCurDir()+"\\Drivers\\msedgedriver.exe";

}
