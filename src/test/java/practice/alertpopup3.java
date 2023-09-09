package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		alt.dismiss();
		Thread.sleep(3000);
	String abc=alt.getText();
	System.out.println(abc);
		
		// TODO Auto-generated method stub

	}

}
