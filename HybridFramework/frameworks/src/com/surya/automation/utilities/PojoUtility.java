package com.surya.automation.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.surya.automation.supporters.ExcelReader;
import com.surya.automation.supporters.PropertiesReader;

public class PojoUtility {
	
	static String confFilePath="D:\\Java Programs\\frameworks\\config.properties";
	static String orFilePath="D:\\Java Programs\\frameworks\\src\\com\\surya\\automation\\applnname\\objectrepository\\or.properties";
	static String excelFilePath="D:\\Java Programs\\frameworks\\src\\com\\surya\\automation\\appln\\testdata\\testdata.xlsx";
	
	public static PropertiesReader getPrConf() throws IOException {
		PropertiesReader prConf =new PropertiesReader(confFilePath);
		return prConf;	
	}
	
	public static PropertiesReader getPrOr() throws IOException {
		PropertiesReader prOr =new PropertiesReader(orFilePath);
		return prOr;	
		}
	public static ExcelReader getExcelReader() throws EncryptedDocumentException, IOException {
		ExcelReader excelReader =new ExcelReader(excelFilePath);
		return excelReader;

	}

}
