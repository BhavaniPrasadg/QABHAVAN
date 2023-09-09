package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assigactionclassmethods1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement images=driver.findElement(By.xpath("(//a[@class='gb_y'])[2]"));
		Actions abc=new Actions(driver);
		abc.moveToElement(images).contextClick().click().doubleClick().perform();
		// TODO Auto-generated method stub

	}

}
