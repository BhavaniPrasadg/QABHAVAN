package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframeassignment {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		String aa = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getText();
		System.out.println(aa);
		 
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		String bb = driver.findElement(By.xpath("(//a[text()='AbstractDriverOptions'])")).getText();
		System.out.println(bb);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		String cc = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium.bidi.browsingcontext'])")).getText();
		System.out.println(cc);
		// TODO Auto-generated method stub

	}

}
