package tests;

import org.testng.annotations.Test;

import pages.homePage;
import pages.userRegisterationPage;

public class userRegisterationTest extends testBase {

	homePage homeObj;
	userRegisterationPage registerObj;

	@Test
	public void userRegisteredSuccessfully() {
	
		homeObj=new homePage(driver);
		homeObj.openRegisterationLink();
		registerObj=new userRegisterationPage(driver);  
		registerObj.userRegisteration("monica", "adel", "mo66@gmail.com", "mo66", "mo66");
		
	}
	
	
}
