package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String abc=driver.getTitle();
		System.out.println(abc);
		
		
		// TODO Auto-generated method stub

	}

}
