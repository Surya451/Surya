package com.surya.selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckSortDropDown {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select select =new Select(day);
		
		java.util.List<WebElement> options = select.getOptions();
		
		ArrayList orgList =new ArrayList<>();
		ArrayList tempList =new ArrayList<>();
		
		for( WebElement option:options) {
			
			orgList.add(option.getText());
			tempList.add(option.getText());
			
		}
		
		System.out.println("Original List: "+orgList);
		System.out.println("Temp List: "+tempList);
		
		Collections.sort(tempList);
		
		System.out.println("Original List: "+orgList);
		System.out.println("Temp List: "+tempList);
		
		if (orgList.equals(tempList)) {
			
			System.out.println("Dropdown is Sorted");
			
		}else {
			
			System.out.println("Dropdown is Not Sorted");
			
		}
		
	}
	
	
	
	

}
