package practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setposition {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Point d=new Point(300,400);
		driver.manage().window().setPosition(d);
		// TODO Auto-generated method stub

	}

}
