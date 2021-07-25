package com.surya.automation.fp.businessscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.surya.automation.base.Base_Test;
import com.surya.automation.customisedexceptions.FrameworkExceptions;
import com.surya.automation.supporters.PropertiesReader;
import com.surya.automation.utilities.PojoUtility;

public class FP_Test extends Base_Test   {
	
	@Test
	public void fp_Test() throws IOException, FrameworkExceptions {
		getExtentTest().log(LogStatus.PASS, "Browser id opened");
		
		String url =PojoUtility.getPrConf().getPropertiesValue("fp_url");
		getWebDriver().get(url);
		
		getExtentTest().log(LogStatus.PASS, "url is entered as: "+url);

	}
	

}
