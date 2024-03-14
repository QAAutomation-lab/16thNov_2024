package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Example3 {

	@Test
	public void excelOps() throws IOException {
		//	Step1: excel file location
		FileInputStream fileLocation=new FileInputStream(".\\src\\test\\resources\\AppTest.xlsx");
		//	step2: create an instance of XSSFWorkbook, pass excel location to its constructor and up cast it to Workbook interface
		Workbook workbook=new XSSFWorkbook(fileLocation);
		//	Step3: once you will get workbook instance you can get any information regarding sheet present in excel
		System.out.println("Sheets in excel file: "+workbook.getNumberOfSheets());
		for(int i=0;i<workbook.getNumberOfSheets();i++) {
			System.out.println(workbook.getSheetAt(i).getSheetName());
		}
		Sheet sheet=workbook.getSheet("Sheet1");
		//	Step4: once you get sheet from Workbook, now you will able to perforn any operation on row level
		System.out.println("Row count in Sheet1: "+sheet.getLastRowNum());//actualrow-1
		Row row=sheet.getRow(0);
		//	Step5: once you get row from Sheet, now you will be able to perform any operation on cell level
		System.out.println("Row0 cell count: "+row.getLastCellNum());
		Cell cell=row.getCell(0);
		System.out.println("Row0 cell0 value is: "+cell.getStringCellValue());
	}
	
	@Test
	public void get1stRowData() throws IOException {
			//	Step1: excel file location
			FileInputStream fileLocation=new FileInputStream(".\\src\\test\\resources\\AppTest.xlsx");
			//	step2: create an instance of XSSFWorkbook, pass excel location to its constructor and up cast it to Workbook interface
			Workbook workbook=new XSSFWorkbook(fileLocation);
			
			Sheet sheet=workbook.getSheet("Sheet1");
			Row row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				Cell cell=row.getCell(i);
				System.out.println("Row0 cell "+ i +" value is: "+cell.getStringCellValue());
			}
	}
	
	@Test
	public void updateRowData() throws IOException {
			//	Step1: excel file location
			FileInputStream fileLocation=new FileInputStream(".\\src\\test\\resources\\AppTest.xlsx");
			//	step2: create an instance of XSSFWorkbook, pass excel location to its constructor and up cast it to Workbook interface
			Workbook workbook=new XSSFWorkbook(fileLocation);
			
			Sheet sheet=workbook.getSheet("Sheet1");
			Row row=sheet.getRow(2);
			int cellNumber=row.getLastCellNum();
			row.createCell(cellNumber).setCellValue("Failed");
			
			FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\AppTest.xlsx");
			workbook.write(fos);
			fos.flush();
			fos.close();
			System.out.println("Updated sheet");
	}
	
	@Test
	public void getData() {
		getRowData(".\\src\\test\\resources\\AppTest.xlsx", "Sheet1", 2);
	}
	
	public void getRowData(String filePath,String SheetName,int rowNum)  {
			//	Step1: excel file location
			FileInputStream fileLocation=null;
			try {
				fileLocation = new FileInputStream(filePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			//	step2: create an instance of XSSFWorkbook, pass excel location to its constructor and up cast it to Workbook interface
			Workbook workbook=null;
			try {
				workbook = new XSSFWorkbook(fileLocation);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Sheet sheet=workbook.getSheet(SheetName);
			Row row=sheet.getRow(rowNum);
			for(int i=0;i<row.getLastCellNum();i++) {
				Cell cell=row.getCell(i);
				//System.out.println("Row "+rowNum+" cell "+ i +" value is: "+cell.getStringCellValue());
				switch(cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.println("Row "+rowNum+" cell "+ i +" value is: "+cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println("Row "+rowNum+" cell "+ i +" value is: "+cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println("Row "+rowNum+" cell "+ i +" value is: "+cell.getNumericCellValue());
					break;
				default: 
					System.out.println("Data not matched");
					break;
				}
			}
	}
}
