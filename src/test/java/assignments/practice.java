package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\automation testing\\bhavan\\src\\test\\resources\\DON.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Sheet2").getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
		
		double data1 = wb.getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data1);
		
		
		// TODO Auto-generated method stub

	}

}
