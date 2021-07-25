package com.rameshsoft.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		//Send keys
		driver.findElement(By.id("fname")).sendKeys("Suryanarayana");
		//Button click
		driver.findElement(By.id("idOfButton")).click();
		//Dropdown
		Select dropDown=new Select(driver.findElement(By.id("testingDropdown")));
		//dropDown.selectByValue("Manual");
		dropDown.selectByIndex(2);
		//Radio button
		driver.findElement(By.id("male")).click();
		driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
