package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// TODO Auto-generated method stub

	}

}
