package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assig2excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\automation testing\\bhavan\\src\\main\\resources\\Book7.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		 
		double data1 = wb.getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data1);
		
		boolean data2 = wb.getSheet("Sheet2").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(data2);
		// TODO Auto-generated method stub

	}

}
