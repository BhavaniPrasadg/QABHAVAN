package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iframeassign {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		String abc = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getText();
		System.out.println(abc);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		String bbc = driver.findElement(By.xpath("(//a[text()='AbstractAnnotations'])")).getText();
		System.out.println(bbc);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	 Class<? extends WebElement> ccb = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getClass();
	 System.out.println(ccb);
		// TODO Auto-generated method stub

	}

}
