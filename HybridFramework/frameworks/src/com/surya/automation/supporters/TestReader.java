package com.surya.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.surya.automation.customisedexceptions.FrameworkExceptions;

public class TestReader {
	
	private String filePath;
	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	
	public TestReader(String filePath) throws IOException {
		this.filePath=filePath;
		file=new File(filePath);
		fw=new FileWriter(file);
		bw=new BufferedWriter(fw);
		fr =new FileReader(file);
		br=new BufferedReader(fr);
	
	}
	public String getData() throws IOException, FrameworkExceptions {
		String data="";
		if(br!=null) {
			data = br.readLine();
		}
		else {
			FrameworkExceptions fwe=new FrameworkExceptions("Buffer reader is pointing to null....");
			throw fwe;	
		}
		return data;
	}
	public List<String> getTotalData() throws IOException {
		List<String> data= new ArrayList<>();
		while(br.ready()) {
			String val =br.readLine();
			data.add(val);
		}
        return data;
	}
	public void writeData(String values) throws IOException {
		bw.write(values);
		bw.flush();

	}
	
	
	

}
