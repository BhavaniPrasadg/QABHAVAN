package assignments;


import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class practice1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Lenovo\\Desktop\\screenshots\\amazonpage.jpg");
	Files.copy(src, dest);
		
		// TODO Auto-gnerated method stub

	}

}
