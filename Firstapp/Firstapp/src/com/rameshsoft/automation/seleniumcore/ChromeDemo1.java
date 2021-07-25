package com.rameshsoft.automation.seleniumcore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class ChromeDemo1 {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	
	WebElement ele = driver.findElement(By.xpath("//a[@rel='async']"));
	
	if (ele.isDisplayed()&&ele.isEnabled()) {
		ele.click();	
	}
	else {
		System.out.println("ele is not displayed");
	}
	
	
	
	
	/*
	 * WebElement un = driver.findElement(By.id("identifierId"));
	 * 
	 * un.clear(); un.sendKeys("suryanarayanamachetti@gmail.com");
	 */
   
   Thread.sleep(5000);
   driver.close();
	}
	

}
