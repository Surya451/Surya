package com.surya.automation.supporters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.surya.automation.customisedexceptions.FrameworkExceptions;

public class PropertiesReader {
	
	private String filepath;
	private FileInputStream fip;
	private Properties properties;
	private String value;
	
	public PropertiesReader(String filepath) throws IOException {
		this.filepath=filepath;
		fip =new FileInputStream(filepath);
		properties =new Properties();
		properties.load(fip);
	}

	 public String getPropertiesValue(String key) throws FrameworkExceptions {
		if (properties !=null) {
			value =properties.getProperty(key);	
		}else {
			System.out.println("PROPERTIES object is pointin to null .....");
			FrameworkExceptions fwe =new FrameworkExceptions("PROPERTIES IS POINTION TO NULL ......");
			throw fwe;
		}
         return value;
	}
	 
	 public String getPropertyValue(String key,String defaultValue) throws FrameworkExceptions {
			if (properties !=null) {
				value =properties.getProperty(key);	
				if (value==null) {
				  value = defaultValue;	
				}
			}else {
				System.out.println("PROPERTIES object is pointin to null .....");
				FrameworkExceptions fwe =new FrameworkExceptions("PROPERTIES IS POINTION TO NULL ......");
				throw fwe;
			}
	         return value;
		}
	 
	 public String getPropertiesValue(Object key) throws FrameworkExceptions {
			if (properties !=null) {
				value =(String) properties.get(key);	
			}else {
				System.out.println("PROPERTIES object is pointin to null .....");
				FrameworkExceptions fwe =new FrameworkExceptions("PROPERTIES IS POINTION TO NULL ......");
				throw fwe;
			}
	         return value;
		}
	 
	 public String getPropertyValue(Object key,Object defaultValue) throws FrameworkExceptions {
			if (properties !=null) {
				value =(String) properties.getOrDefault(key,defaultValue);	
				if (value==null) {
				  value = (String) defaultValue;	
				}
			}else {
				System.out.println("PROPERTIES object is pointin to null .....");
				FrameworkExceptions fwe =new FrameworkExceptions("PROPERTIES IS POINTION TO NULL ......");
				throw fwe;
			}
	         return value;
	         
		}
	public void setPropertyKeyValue(String key,String Value) throws IOException {
		properties.setProperty(key, Value);
		FileOutputStream fop =new FileOutputStream(filepath);
		properties.store(fop, "file is saved successfully");
	} 
	public void setPropertyKeyValue(Object key,Object Value) throws IOException {
		properties.put(key, Value);
		FileOutputStream fop =new FileOutputStream(filepath);
		properties.store(fop, "file is saved successfully");
	}
	
	 public Map<String, String> getPropertyData() {
		Map<String, String> propData =new LinkedHashMap();
 		Set keySet = properties.keySet();
 		for(Object obj :keySet) {
 			String key = (String) obj;
 			String value = properties.getProperty(key);
 			propData.put(key, value);
 		}
		return propData;
	}
	 public Set<String> getkeys() {
		 Set<String> keys= new LinkedHashSet();
		 Set keySet= properties.keySet();
		 for(Object obj :keySet) {
			 String key=(String) obj;
			 keys.add(key);
		 }
		 return keys;	 
	 }
	 public List<String> getValues() {
		 List<String> values =new ArrayList<>();
		 Set keyset =properties.keySet();
		 for(Object obj :keyset) {
			 String key = (String) obj;
			 String value = properties.getProperty(key);
			 values.add(value);
		 }
		return values;	

	}
		
		
		
		
	
}












