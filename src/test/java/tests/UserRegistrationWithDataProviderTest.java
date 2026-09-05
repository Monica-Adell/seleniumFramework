package tests;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationWithDataProviderTest extends TestBase
{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 

	
	@DataProvider(name = "testData")
	public static Object [][] userData(){	
		return new Object [][] {
			{"Monica","Adel","Testxxx@gmail.com","1234"},{"Mo","Ad","Test222","5678"}
		};
	}
	
	
	
	
	@Test(priority=1,alwaysRun=true,dataProvider = "testData")
	public void UserCanRegisterSuccssfully(String fname,String lname,String email,String password) 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(fname,lname,email,password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.userLogout();
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin(email,password);
		Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
	}
	
	
}
