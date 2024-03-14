package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Example2 {
	@Test
	public void excelOps() throws IOException {
		//get excel file location
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AppTest.xlsx");
		//required workbook object
		Workbook wb=new XSSFWorkbook(fis);
		//now you can perform any required operation on sheet
			int sheetCount=wb.getNumberOfSheets();
			System.out.println("Sheet count: "+sheetCount);
			//get each sheet name
			for(int i=0;i<sheetCount;i++) {
				System.out.println(wb.getSheetName(i));
			}
			//get specific sheet 
			Sheet sheet=wb.getSheet("Sheet1");
		//now you can perform any required operation on Row
			int rowCount=sheet.getLastRowNum();
			System.out.println("Row count: "+rowCount);//actualrow-1
			//get specific row
			Row row=sheet.getRow(0);
		//now you can perform any operation on cell
			int cellCountOnRow0=row.getLastCellNum();
			System.out.println("Cell count in row0: "+cellCountOnRow0);
			//get 0th cell value
			Cell cell=row.getCell(0);
			String cell0Value=cell.getStringCellValue();
			System.out.println("Cell 0 value : "+cell0Value);
			System.out.println("******** Cell value in row 0: *********");
			for(int i=0;i<cellCountOnRow0;i++) {
				System.out.println(row.getCell(i).getStringCellValue());
			}
		System.out.println("****************************************");
//		//get row2 data
//			Row row2=sheet.getRow(2);
//			for(int i=0;i<row2.getLastCellNum();i++) {
//				System.out.println(row2.getCell(i).getStringCellValue());//Cannot get a text value from a boolean cell
//			}
		//row 2 data
			Row row2=sheet.getRow(2);
			for(int i=0;i<row2.getLastCellNum();i++) {
				//check cell type
				Cell cl=row2.getCell(i);
				switch(cl.getCellType()) {
					//match required cell type to read diff type of data
					
				case Cell.CELL_TYPE_STRING:
						System.out.println(cl.getStringCellValue());
						break;
				case Cell.CELL_TYPE_BOOLEAN:
						System.out.println(cl.getBooleanCellValue());
						break;
				case Cell.CELL_TYPE_NUMERIC:
						System.out.println(cl.getNumericCellValue());
						break;
				default:
					System.out.println("Undefined value of cell");
					break;
				}
			
			}
	}
}
