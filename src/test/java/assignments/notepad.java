package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class notepad {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\datadriven\\practice.properties");
		Properties p=new Properties();
		p.load(fis);
	String	bbc=p.getProperty("PWD");
	System.out.println(bbc);
		// TODO Auto-generated method stub

	}

}
