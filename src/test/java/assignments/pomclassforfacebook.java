package assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomclassforfacebook {
	//declaration
	@FindBy(xpath = "(//input[@name='firstname'])")private WebElement firstnamebox;
	@FindBy(xpath = "(//input[@name='lastname'])")private WebElement surnamebox;
	@FindBy(xpath = "(//input[@type='text'])[4]")private WebElement mobilenumberoremailaddressbox;
	@FindBy(xpath = "(//input[@type='password'])[2]")private WebElement newpasswordbox;
	//intilization
	public pomclassforfacebook() {
		
	}
	//implementation
	public WebElement getFirstnamebox() {
		return firstnamebox;
	}
	public WebElement getSurnamebox() {
		return surnamebox;
	}
	public WebElement getMobilenumberoremailaddressbox() {
		return mobilenumberoremailaddressbox;
	}
	public WebElement getNewpasswordbox() {
		return newpasswordbox;
	}

}
