package com.surya.automation.advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Demo {
	WebDriver driver;
	
	@BeforeSuite
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");
	     
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(85, TimeUnit.SECONDS);

	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
    public void gmailTC() throws InterruptedException {
    	driver.get("https://www.gmail.com");
		WebElement un = driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("suryanarayanamachetti@gmail.com");
		
		Thread.sleep(5000);
	}
	
		
		
		
		
		
	}


