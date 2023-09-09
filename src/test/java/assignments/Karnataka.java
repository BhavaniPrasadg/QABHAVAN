package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Karnataka {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\automation testing\\bhavan\\src\\test\\resources\\Credentials.properties");
	Properties p=new Properties();
	p.load(fis);
	String username = p.getProperty("PWD");
	System.out.println(username);
}
}
