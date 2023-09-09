package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframestesting {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		String data = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getText();
		System.out.println(data);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		String data1 = driver.findElement(By.xpath("(//a[text()='AbstractAnnotations'])")).getText();
		System.out.println(data1);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		String data2 = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getText();
		System.out.println(data2);
		
		// TODO Auto-generated method stu

	}

}
