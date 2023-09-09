package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomdesignpattern {
	//declaration
	@FindBy(xpath = "(//input[@id='username'])")private WebElement untextbox;
	@FindBy(xpath = "//input[@type='password'][1]")private WebElement pwdtextbox;
	@FindBy(xpath = "//a[@id='loginButton']")private WebElement loginbutton;
	//initilization
	public pomdesignpattern(WebDriver driver) {
		PageFactory.initElements(driver,this);

}
	public WebElement getUntextbox() {
		return untextbox;
	}
	public WebElement getPwdtextbox() {
		return pwdtextbox;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
}
