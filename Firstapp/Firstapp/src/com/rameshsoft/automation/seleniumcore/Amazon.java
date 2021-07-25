package com.rameshsoft.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.clear(); 
		search.sendKeys("macbook");
		driver.findElement(By.id("nav-search-submit-button"));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
