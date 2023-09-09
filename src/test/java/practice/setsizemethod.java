package practice;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsizemethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(100,200);
		driver.manage().window().setSize(d);
		
		// TODO Auto-generated method stub

	}

}
