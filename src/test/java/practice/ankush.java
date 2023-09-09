package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ankush 
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		// TODO Auto-generated method stub

	}

}
