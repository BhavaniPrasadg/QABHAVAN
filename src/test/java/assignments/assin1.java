package assignments;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class assin1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html"); 
	WebElement	src=driver.findElement(By.xpath("//div[@id='draggable']"));
	           WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
	           Actions abc=new Actions(driver);
	           abc.dragAndDrop(src, dest).perform();
		 
				// TODO Auto-generated method stu
		
		// TODO Auto-generated method stub

	}

}
