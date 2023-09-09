 package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on create new acct btn
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//select dpdwn whichwe need to handle and store in ref variable
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		Thread.sleep(3000);
		s.selectByVisibleText("1");
		
		
		//select month
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		Thread.sleep(3000);
		s1.selectByVisibleText("Jan");
		
		
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		//create object of select classs
		Thread.sleep(3000);
		Select s2=new Select(year);
		Thread.sleep(3000);   
		s2.selectByVisibleText("1998");

	}

}
 