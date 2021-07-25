package com.surya.automation.supporters;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReader {
	
	private String filePath;
	private FileInputStream fip;
	private Workbook workbook;
	private Sheet sheet; 
	private String cellData;
	private Row row;
	private Cell cell;
	
	public ExcelReader(String filePath) throws EncryptedDocumentException, IOException{
		this.filePath =filePath;
	    fip =new FileInputStream(filePath);
		workbook = WorkbookFactory.create(fip);
	}
	public Sheet getSheetObj(String how,String value) {
		if(how != null) {
			if(how.equalsIgnoreCase("sheetName")) {
			    sheet  = workbook.getSheet(value);
			}
			else if(how.equalsIgnoreCase("index")) {
				int sheetIndex =Integer.parseInt(value);
				sheet =workbook.getSheetAt(sheetIndex);
			}
		}
       return sheet;
	}
	
   public String getCellData(String how,String value,int rowNum,int cellNum) {
	   sheet =getSheetObj(how, value);
	   if(sheet !=null) {
		  row = sheet.getRow(rowNum);
		  if(row !=null) {
			 cell = row.getCell(cellNum);
			 if(cell !=null) {
				 if(cell.getCellType() == CellType.STRING) {
					 cellData = cell.getStringCellValue();
				     }
				 else if(cell.getCellType() == CellType.NUMERIC) {
						 cellData = cell.getNumericCellValue()+"";
					 }
				 else if(cell.getCellType() == CellType.BOOLEAN) {
						cellData = cell.getBooleanCellValue()+"";
			         }
			 }
		  }
	   }
	   return cellData; 
    }
	
    public List<String> getSingleRowData(String how,String value,int rowNum) {
	List<String> rowData =new ArrayList<String>();	
    sheet =getSheetObj(how, value);
	  
	   if(sheet !=null) {
		   row = sheet.getRow(rowNum);  
		   if(row != null) {
			 for (int i=0; i<=row.getLastCellNum();i++) {
				  cell=row.getCell(i);
				  if(row !=null) {
				  cell = row.getCell(i);
					if(cell !=null) {
			     	  if(cell.getCellType() == CellType.STRING) {
						 cellData = cell.getStringCellValue();
						 rowData.add(cellData);
						     }
					   else if(cell.getCellType() == CellType.NUMERIC) {
						 cellData = cell.getNumericCellValue()+"";
						 rowData.add(cellData);
							 }
			     	   else if(cell.getCellType() == CellType.BOOLEAN) {
    					 cellData = cell.getBooleanCellValue()+"";
    					 rowData.add(cellData);
						     }
						 }
					  }   
	       }	   
	     }
	  }
	   return rowData;
	}
   public List<String> getTotalSheetData(String how,String value) {
	   List<String> sheetData =new ArrayList<String>();
	   sheet = getSheetObj(how, value);
	   for(int i=0;i<=sheet.getLastRowNum();i++) {
		  row =sheet.getRow(i);
		  for(int j=0;j<=row.getLastCellNum();j++) {
			 cell= row.getCell(j);
			 if(cell !=null) {
		     	  if(cell.getCellType() == CellType.STRING) {
					 cellData = cell.getStringCellValue();
					 sheetData.add(cellData);
					     }
				   else if(cell.getCellType() == CellType.NUMERIC) {
					 cellData = cell.getNumericCellValue()+"";
					 sheetData.add(cellData);
						 }
		     	   else if(cell.getCellType() == CellType.BOOLEAN) {
					 cellData = cell.getBooleanCellValue()+"";
					 sheetData.add(cellData);
					     }
	          }
		  }
	  }  
	   return sheetData;
    }
   
   public Set<String> getTotalSheetDataUnique(String how,String value) {
	List<String> data = getTotalSheetData(how, value);
    Set<String> setData =new HashSet<String>(data);    return setData;
}  
 }

 
 

