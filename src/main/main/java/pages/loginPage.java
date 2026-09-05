package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends pageBase {

	public loginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Email")
	WebElement emailTextBox;
	
	@FindBy(id="Password")
	WebElement passwordTextBox;
	
	@FindBy(css ="button.button-1.login-button")  //type.className
	WebElement loginBtn;
	
	public void UserLogin(String email,String password)
	{
		setTextElement(emailTextBox, email);
		setTextElement(passwordTextBox, password);
		clickButton(loginBtn);
	}
	
}
