package com.surya.automation.appln.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;
import com.surya.automation.base.Base_Test;

public class GmailHomePage extends Base_Test {

	@FindBy(id="identifierId")
	private static WebElement userName;
	
	@FindBy(xpath = "//button[contains(text(),'Forgot email?')]")
	private static WebElement forgotEmail;
	
	@FindBy(xpath = "//a[contains(text(),'Learn more')]")
	private static WebElement learnMore;
	
	@FindBy(xpath = "//span[contains(text(),'Create account')]")
	private static WebElement createAccount;
	
	@FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']" )
	private static WebElement next;
	
	public void enterUserName(String un) {
		SoftAssert softAssert =new SoftAssert();
		softAssert.assertTrue(userName.isDisplayed()&&userName.isEnabled());
        getExtentTest().log(LogStatus.PASS, "Doing Assertions on USERNAME");
		userName.clear();
		getExtentTest().log(LogStatus.PASS, "Cleared the user name field");
        userName.sendKeys(un);
        getExtentTest().log(LogStatus.PASS, "Data typing actions is done on USERNAME: "+un);
	}
	
	public void clickNextButton() {
     
		if (next.isDisplayed()&&next.isEnabled()) {
			getExtentTest().log(LogStatus.PASS, "Next element is available");
			next.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on Next button");
		}
	}
	
	public void clickForgotEmail() {
	     
		if (forgotEmail.isDisplayed()&&forgotEmail.isEnabled()) {
			getExtentTest().log(LogStatus.PASS, "ForgotEmail element is available");
			forgotEmail.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on ForgotEmail button");
		}
	}
	
	public void clickLearnMore() {
	     
		if (learnMore.isDisplayed()&&learnMore.isEnabled()) {
			getExtentTest().log(LogStatus.PASS, "Learn More element is available");
			learnMore.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on Learn More button");
		}
	}
	
	public void clickCreateAccount() {
	     
		if (createAccount.isDisplayed()&&createAccount.isEnabled()) {
			getExtentTest().log(LogStatus.PASS, "Create Account element is available");
			createAccount.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on CreateAccount button");
		}
	}
    
	
	
	
}
