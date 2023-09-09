package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelnumeric {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\automation testing\\bhavan\\src\\test\\resources\\book6.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double data = wb.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(data);
		// TODO Auto-generated method stub

	}

}
