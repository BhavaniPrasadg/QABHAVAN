package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdoubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement gamil=driver.findElement(By.xpath("(//a[@class='gb_y'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(gamil).doubleClick().perform();
		// TODO Auto-generated method stub

	}

}
