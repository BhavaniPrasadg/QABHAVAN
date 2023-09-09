package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class notepad1 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\automation testing\\bhavan\\src\\test\\resources\\note.properties");
		Properties p=new Properties();
		p.load(fis);
		String abc = p.getProperty("UN");
		System.out.println(abc);
		// TODO Auto-generated method stub

	}

}
