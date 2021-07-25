package com.surya.automation.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.surya.automation.customisedexceptions.FrameworkExceptions;

abstract public class ActionEngine extends Base_Test{

	private static JavascriptExecutor javaScriptExecuter=(JavascriptExecutor) getWebDriver();
	private static Actions actions=new Actions(getWebDriver());
	
	public static void click(WebElement element) throws FrameworkExceptions {
		if(element.isDisplayed() && element.isEnabled()) {
			element.clear();
			element.click();
		}
		else {
			FrameworkExceptions fwe=new FrameworkExceptions("Element is not visible");
			throw fwe;
		}
	}
	
	public static void clickByJavaScriptExecuter(WebElement element) {
		Assert.assertTrue(element.isDisplayed() && element.isEnabled());
		javaScriptExecuter.executeScript("arguments[0].click", element);
	}
	
	public static void clickByActions(WebElement element) {
        actions.click(element).build().perform();
	}
	
	public static void doubleClickByActions(WebElement element) {
        actions.doubleClick(element).build().perform();
	}
	
	public static void DTA(WebElement element,String testData) {
		SoftAssert softAssert =new SoftAssert();
		softAssert.assertTrue(element.isDisplayed()&&element.isEnabled());
		element.clear();
		element.sendKeys(testData);
	}
	
	public static void DTAByActions(WebElement element,String testData) throws FrameworkExceptions {
		if (element.isDisplayed()&&element.isEnabled()) {
			actions.sendKeys(element, testData).build().perform();
		}
		else {
			FrameworkExceptions fwe=new FrameworkExceptions("Element is not visible");
			throw fwe;
		}
	}
	
	public static void selectDropDown(String how,String howValue,WebElement element) {
		Select select=new Select(element);
		if (how.equalsIgnoreCase("visibleText")) {
			select.selectByVisibleText(howValue);
		}
		else if (how.equalsIgnoreCase("value")) {
			select.selectByValue(howValue);
		}	
		else if (how.equalsIgnoreCase("index")) {
			int indx = Integer.parseInt(howValue);
			select.selectByIndex(indx);
		}
	}
	
	public static void main(String[] args) {
		selectDropDown("value", "practice", getWebDriver().findElement(By.id("day")));
	}
	
	public static String handleWindows() {
		String current_Window =getWebDriver().getWindowHandle(); 
        Set<String> windows = getWebDriver().getWindowHandles();
        for(String window: windows) {
        	
        	if (!window.equalsIgnoreCase(current_Window)) {
				getWebDriver().switchTo().window(window);
				current_Window =getWebDriver().getWindowHandle();
			}
       	
        }
      return current_Window;
	}
	
	public static String handleWindows(int index) { 
        Set<String> windows = getWebDriver().getWindowHandles();
	    List<String> list_Windows= new ArrayList<String>(windows);
	    list_Windows.get(index);
	    return getWebDriver().getWindowHandle();
 	}
	
	public void rightClick(WebElement element) {
		actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	} 
	
	//synchronisation methods
	//actions class
	//javascript methods
	//validation methods
	
	
	
	
	
}
