package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class pom1 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://amazon.in/");
		WebElement ab = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.navigate().refresh();
		ab.sendKeys("mobiles under 20000");
		// TODO Auto-generated method stub
 
	}

}
