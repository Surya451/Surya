package com.surya.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fip =new FileInputStream("D:\\Java Programs\\frameworks\\src\\com\\surya\\automation\\applnname\\objectrepository\\or.properties");
		
		Properties properties =new Properties();
		properties.load(fip);
		
		properties.setProperty("hii", "hello");
		properties.setProperty("name", "surya");
		properties.setProperty("job", "non");
		properties.setProperty("on", "off");
		
		FileOutputStream fop =new FileOutputStream("D:\\Java Programs\\frameworks\\src\\com\\surya\\automation\\applnname\\objectrepository\\or.properties");
		
		properties.save(fop, "keys and values are stored");
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String gmail_un_id_value = properties.getProperty("gmail_un_id");
		 * System.out.println("gmail_un_id= "+gmail_un_id_value);
		 * 
		 * String gmail_un_xpath_value = properties.getProperty("gmail_un_xpath");
		 * System.out.println("gmail_un_xpath= "+gmail_un_xpath_value);
		 * 
		 * String gmail_nxt_id_value = properties.getProperty("gmail_nxt_id");
		 * System.out.println("gmail_nxt_id= "+gmail_nxt_id_value);
		 * 
		 * String gmail_nxt_xpath_value = properties.getProperty("gmail_nxt_xpath");
		 * System.out.println("gmail_nxt_xpath= "+gmail_nxt_xpath_value);
		 * 
		 * String gmail_pwd_name_value = properties.getProperty("gmail_pwd_name");
		 * System.out.println("gmail_pwd_name= "+gmail_pwd_name_value);
		 * 
		 * String gmail_pwd_css_value = properties.getProperty("gmail_pwd_css");
		 * System.out.println("gmail_pwd_css= "+gmail_pwd_css_value);
		 * 
		 * String gmail_signin_id_value = properties.getProperty("gmail_signin_id");
		 * System.out.println("gmail_signin_id= "+gmail_signin_id_value);
		 */
		
		
		
	}

}
