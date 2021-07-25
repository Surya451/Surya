package com.surya.automation.advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.gecko.driver", "D:\\Java Programs\\frameworks\\Drivers\\geckodriver.exe");
         
		  WebDriver webDriver =new FirefoxDriver();
         	webDriver.manage().window().maximize();
         	webDriver.manage().deleteAllCookies();
         	webDriver.manage().timeouts().implicitlyWait(95, TimeUnit.SECONDS);
         	
         	webDriver.get("https://www.gmail.com");
         	
         	
		    }
		
		
		
		
	}


