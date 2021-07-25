package com.surya.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;


public class ExcelDemo {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fip =new FileInputStream("D:\\Java Programs\\frameworks\\src\\com\\surya\\automation\\appln\\testdata\\testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		
		int noOfSheets =workbook.getNumberOfSheets();
		System.out.println("no of sheets are: "+noOfSheets);
		
		Sheet sheet =workbook.getSheet("Sheet1");
		Row row5 =sheet.createRow(5);
		Cell cell53 =row5.createCell(3);
		cell53.setCellValue("Dell");
		
		FileOutputStream fop =new FileOutputStream("D:\\Java Programs\\frameworks\\src\\com\\surya\\automation\\appln\\testdata\\testdata.xlsx");
        workbook.write(fop); 		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * int totalRows =sheet.getLastRowNum();
		 * System.out.println("No of rows: "+totalRows);
		 * 
		 * for(int rowNo=0; rowNo<=sheet.getLastRowNum();rowNo++) { Row row
		 * =sheet.getRow(rowNo); for(int cellNo=0; cellNo<row.getLastCellNum();cellNo++)
		 * { Cell cell =row.getCell(cellNo); if(cell.getCellType() == CellType.STRING) {
		 * System.out.println(cell.getStringCellValue()); } if(cell.getCellType() ==
		 * CellType.NUMERIC) { System.out.println(cell.getNumericCellValue()); }
		 * if(cell.getCellType() == CellType.BOOLEAN) {
		 * System.out.println(cell.getBooleanCellValue()); } } }
		 */
	
		
		/*
		 * Row row0 = sheet.getRow(0);
		 * 
		 * Short totalCells =row0.getLastCellNum();
		 * System.out.println("No of cells: "+totalCells);
		 * 
		 * Cell cell00 = row0.getCell(0); String cell00Value =
		 * cell00.getStringCellValue();
		 * System.out.println("0th row 0th cell value is: "+cell00Value);
		 * 
		 * Cell cell01 =row0.getCell(1); String cell01Value
		 * =cell01.getStringCellValue();
		 * System.out.println("0th row 1st cell value is: "+cell01Value);
		 * 
		 * Row row1 = sheet.getRow(1);
		 * 
		 * Cell cell10 =row1.getCell(0); String cell10Value =
		 * cell10.getStringCellValue();
		 * System.out.println("1th row 0th cell value is: "+cell10Value);
		 * 
		 * Cell cell11 =row1.getCell(1); String cell11Value
		 * =cell11.getStringCellValue();
		 * System.out.println("1th row 1st cell value is: "+cell11Value);
		 * 
		 * Row row2 = sheet.getRow(2);
		 * 
		 * Cell cell20 =row2.getCell(0); String cell20Value =
		 * cell20.getStringCellValue();
		 * System.out.println("2th row 0th cell value is: "+cell20Value);
		 * 
		 * Cell cell21 =row2.getCell(1); double cell21Value
		 * =cell21.getNumericCellValue();
		 * System.out.println("2th row 1st cell value is: "+cell21Value);
		 */
	
		
	}
	
	
	

}
