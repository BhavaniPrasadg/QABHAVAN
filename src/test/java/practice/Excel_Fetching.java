package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Fetching {
public static void main(String[] args) throws Throwable {
//create object of FIS class
	FileInputStream fis=new FileInputStream("D:\\automation testing\\bhavan\\src\\test\\resources\\DON.xlsx");
	//open the workbook using create method
	Workbook wb = WorkbookFactory.create(fis);
	//navigate to sheet
	 Sheet sh = wb.getSheet("Sheet1");
	 String data = sh.getRow(1).getCell(0).getStringCellValue();
	 System.out.println(data);
	
	 
}
}
