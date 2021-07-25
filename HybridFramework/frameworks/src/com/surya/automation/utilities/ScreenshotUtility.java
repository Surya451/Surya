package com.surya.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.surya.automation.base.Base_Test;

public interface ScreenshotUtility {
	public static void takeScreenShot(String tcName) throws IOException {
	TakesScreenshot takesScreenshot=(TakesScreenshot) Base_Test.getWebDriver();
	File file= takesScreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File(Base_Test.getCurDir()+"\\Screenshots\\"+tcName+".jpeg"));
	}
	public static String takeScreenShot() throws IOException {
		TakesScreenshot takesScreenshot=(TakesScreenshot) Base_Test.getWebDriver();
		File file= takesScreenshot.getScreenshotAs(OutputType.FILE);
		String imagePath =Base_Test.getCurDir()+"\\Screenshots\\"+Base_Test.getTcName()+".jpeg";
		FileUtils.copyFile(file, new File(imagePath));
		return imagePath;
		}
}
