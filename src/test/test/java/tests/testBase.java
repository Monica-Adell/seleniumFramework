package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.xml.*;

public class testBase {
       
	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String browserName) {
		if(browserName.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver(); 
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver(); 
		}
		else if(browserName.equalsIgnoreCase("ie")){
			driver=new InternetExplorerDriver(); 
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //    driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	}
	
	
	@AfterSuite
	public void stopDriver()
	{
		driver.quit(); 
	}
	
	
}
