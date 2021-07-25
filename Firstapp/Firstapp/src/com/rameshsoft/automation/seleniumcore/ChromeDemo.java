package com.rameshsoft.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver","D:\\Java Programs\\Firstapp\\Drivers\\msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
  // RemoteWebDriver driver=new ChromeDriver();
    //WebDriver driver=new EdgeDriver();
	//SearchContext driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.get("http://www.gmail.com");
    driver.manage().timeouts().implicitlyWait(48,TimeUnit.SECONDS );
   WebElement un= driver.findElement(By.id("identifierId"));
   
    un.clear();
    un.sendKeys("suryanarayanamachetti@gmailcom");
    
    Thread.sleep(5000);
    driver.close();	
}

}
