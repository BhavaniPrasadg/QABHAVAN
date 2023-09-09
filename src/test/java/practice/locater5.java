package practice;

import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locater5 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bhavani");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("prasad");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("6304546595");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("bhavani@123");
		
		
		 Thread.sleep(2000);
		 WebElement day=driver.findElement(By.xpath("(//select[@id='day'])"));
		 Select s2=new Select(day);
		 s2.selectByVisibleText("22");
		 
		 
		 Thread.sleep(2000);
		 WebElement month=driver.findElement(By.xpath("(//select[@id='month'])"));
		 Thread.sleep(2000);
		 Select s1=new Select(month);
		 s1.selectByVisibleText("Oct");
		 
		 
		
	WebElement	Year=driver.findElement(By.xpath("(//select[@id='year'])"));
	Thread.sleep(2000);
		Select s=new Select(Year);
		s.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		 
		
		

	}

}
