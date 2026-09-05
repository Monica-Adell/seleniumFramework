package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pageBase 
{

	protected WebDriver driver;
	
	public pageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void clickButton(WebElement button) 
	{
		button.click();
	}
	protected static void setTextElement(WebElement textElement,String value) 
	{
		textElement.sendKeys(value);
	}
}
