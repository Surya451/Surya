package com.surya.automation.fp.businessscripts;



import java.io.IOException;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.surya.automation.base.Base_Test;
import com.surya.automation.customisedexceptions.FrameworkExceptions;
import com.surya.automation.utilities.PojoUtility;

public class Inst_Test extends Base_Test {
	
	@Test
	public void instTest() throws IOException, FrameworkExceptions {
        
	    getExtentTest().log(LogStatus.PASS, "Browser id opened");
		String url =PojoUtility.getPrConf().getPropertiesValue("inst_test_url");
		getWebDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "url is entered as: "+url);
	}

}
