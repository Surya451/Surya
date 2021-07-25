package com.rameshsoft.automation.corejava;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMap {
	public static void main(String[] args) {
		ConcurrentHashMap chm =new ConcurrentHashMap<>();
		chm.put("Hello", 99999);
		chm.put("job", "practice");
		chm.put(33, 99);
		chm.put('s', 99999);
		chm.put('m', 99999);
		System.out.println(chm);
		
	}
    

	
}
