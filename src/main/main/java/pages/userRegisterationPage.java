package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userRegisterationPage extends pageBase {

	public userRegisterationPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id="gender-female")
	WebElement femaleRadioBtn;
	
	@FindBy(id="FirstName")
	WebElement fnTextBox;
	
	@FindBy(id="LastName")
	WebElement lnTextBox;
	
	@FindBy(id="Email")
	WebElement emailTextBox;
	
	@FindBy(id="Password")
	WebElement passwordTextBox;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPasswordTextBox;
	
	@FindBy(id="register-button")
	WebElement registerationBtn;
	
	
	public void userRegisteration(String firstName ,String lastName , String email ,String password , String confirmPassword ) {
		clickButton(femaleRadioBtn);
		setTextElement(fnTextBox, firstName);
		setTextElement(lnTextBox, lastName);
		setTextElement(emailTextBox, email);
		setTextElement(passwordTextBox, password);
		setTextElement(confirmPasswordTextBox, confirmPassword);
		clickButton(registerationBtn);
		
	}
	
}
