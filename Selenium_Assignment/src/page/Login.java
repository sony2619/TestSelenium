package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import automate.MyStore;
import browser.Browsers;


public class Login 
{
	WebDriver driver;

	@Test
	public void loginApp() throws InterruptedException
	{
		driver=Browsers.startApplication(driver, "Chrome", "http://automationpractice.com/index.php/");				
		
		MyStore loginPage=PageFactory.initElements(driver, MyStore.class);
		
		loginPage.loginTo("abcd123@asd.com", "xyz123");
		
		
	}
	
	@AfterClass
	public void close() 
	{
		Browsers.quitBrowser(driver);
	}
	


}