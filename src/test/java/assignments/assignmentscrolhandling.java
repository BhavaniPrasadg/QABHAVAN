package assignments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentscrolhandling {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("windowscrollBy(0,3000);");
	Thread.sleep(3000);
	jse.executeScript("windowscrollBy(0,-3000);");
		// TODO Auto-generated method stub

	}

}
