package com.rameshsoft.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(82, TimeUnit.SECONDS);

	    driver.get("https://www.rameshsoft.com");
	    driver.findElement(By.linkText("https://rameshsoft.com/submit-an-inquiry/")).click();
	    
	    
	}

}
