package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldatadriven {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\automation testing\\bhavan\\src\\test\\resources\\excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		String data = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		// TODO Auto-generated method stub

	} 

}
