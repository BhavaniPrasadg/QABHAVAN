package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class notificationpopup {

	public static void main(String[] args) {
		EdgeOptions c=new EdgeOptions();
		WebDriver driver=new EdgeDriver(c);
		c.addArguments("__disable-notifications");
		c.addArguments("start-maximized");
		driver.get("https://www.hdfc.com/");
		// TODO Auto-generated method stub

	}

}
