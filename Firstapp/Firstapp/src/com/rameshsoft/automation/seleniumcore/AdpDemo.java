package com.rameshsoft.automation.seleniumcore;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class AdpDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(82,TimeUnit.SECONDS);
	driver.get("https://www.rameshsoft.com");
	//List<WebElement> elements= driver.findElements(By.xpath("//*"));
	
	List<WebElement> elements= driver.findElements(By.cssSelector("*"));
	int frameCount=0;
	Iterator<WebElement> itr = elements.iterator();
	while(itr.hasNext())
	{
		WebElement element = itr.next();
		String frameTagName= element.getTagName();
		if (frameTagName.equalsIgnoreCase("iframe")) {
			frameCount++;
			String frameId=element.getAttribute("id");
			String frameName=element.getAttribute("name");
			String frameClassName=element.getAttribute("className");
			String frameSrc=element.getAttribute("src");
			System.out.println(frameId+" "+frameName+" "+frameClassName+" "+frameSrc);
			
		}
		else {
			System.out.println("it is not a frame");
		}
	}
	System.out.println("Total no of  frames are "+frameCount);
	
	
	
	
	
	
	
	/*
	 * int enabledLinkscount=0; int disabledLinkscount=0;
	 * 
	 * for(WebElement element : elements) { String actualtagName =
	 * element.getTagName(); if (actualtagName.equalsIgnoreCase("a")) { if
	 * (element.isDisplayed() && element.isEnabled()) { enabledLinkscount++;
	 * 
	 * } else { disabledLinkscount++; }
	 * 
	 * } }
	 */
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * int adpORADPCount =0;
	 * 
	 * List<WebElement> elements=driver.findElements(By.xpath("//*"));
	 * Iterator<WebElement> itr = elements.iterator(); while(itr.hasNext()) {
	 * WebElement element=itr.next(); String txt=element.getText();
	 * if(txt.contains("ADP")||txt.contains("adp")) { adpORADPCount++; } }
	 * System.out.println("ADP count is : "+adpORADPCount);
	 * 
	 * Thread.sleep(5000); driver.close();
	 */
	
}
}
