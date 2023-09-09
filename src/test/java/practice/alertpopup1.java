package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Alert alt=driver.switchTo().alert();
		String txt=alt.getText();
		System.out.println("txt");
	

		// TODO Auto-generated method stub

	}

}
