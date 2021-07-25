package com.surya.automation.fp.businessscripts;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.surya.automation.base.Base_Test;
import com.surya.automation.customisedexceptions.FrameworkExceptions;
import com.surya.automation.utilities.PojoUtility;


public class Gmail_Test extends Base_Test {

	@Test
	public void gmail_Test() throws IOException, FrameworkExceptions {
		
		getExtentTest().log(LogStatus.PASS, "Browser id opened");
		String url = PojoUtility.getPrConf().getPropertiesValue("gmail_url");
		getWebDriver().get(url);
		
		getExtentTest().log(LogStatus.PASS, "url is entered as: "+url);
		
		String  un_Id =PojoUtility.getPrOr().getPropertiesValue("gmail_un_id");

		String un_Data = PojoUtility.getExcelReader().getCellData("sheetName","Sheet1", 1, 1);
		WebElement un = getWebDriver().findElement(By.id(un_Id));
		un.clear();
		getExtentTest().log(LogStatus.PASS, "clearing user name field ");
		un.sendKeys(un_Data);
		
		getExtentTest().log(LogStatus.PASS, "Data typing action is done on username with test data: "+un_Data);

		String nxt_xpath = PojoUtility.getPrOr().getPropertiesValue("gmail_nxt_xpath");
		WebElement nxt = getWebDriver().findElement(By.xpath(nxt_xpath));
		nxt.click();
		
		getExtentTest().log(LogStatus.PASS, "Clicked on the next button");
		  
		 

	}

}
