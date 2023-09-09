package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelboolean {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\automation testing\\bhavan\\src\\test\\resources\\Book7.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		boolean data = wb.getSheet("Sheet1").getRow(0).getCell(0).getBooleanCellValue();
		System.out.println(data);
		// TODO Auto-generated method stub

	}

}
