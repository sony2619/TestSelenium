package automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class MyStore 
{
	WebDriver driver;
	
	public MyStore(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	

	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a") WebElement signInButton;
	
    @FindBy(name="email") WebElement uname;
	
	@FindBy(name="passwd") WebElement password;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span") WebElement signIn;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a") WebElement womenButton;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a") WebElement tshirtButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span") WebElement product;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span") WebElement more;
	
	@FindBy(xpath="//*[@id=\"thumb_1\"]") WebElement scrolldown;
	
	@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i") WebElement add;		
	
	@FindBy(name="group_1") WebElement size;
	 
	@FindBy(xpath="//*[@id=\"group_1\"]/option[3]") WebElement large;
	 
	@FindBy(name="Blue") WebElement color;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span") WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span") WebElement proceed1;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span") WebElement proceed2;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span") WebElement proceed3;
	
	@FindBy(name="cgv") WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span") WebElement proceed4;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a") WebElement bank;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span") WebElement confirm;
	
    
	public void loginTo(String usernameApplication,String passwordApplication)  throws InterruptedException
		{
						
			signInButton.click();						
			
			uname.sendKeys(usernameApplication);
			password.sendKeys(passwordApplication);
			
			Thread.sleep(2000);
			
			signIn.click();
			
			Thread.sleep(1000);
					

			Actions a = new Actions(driver);			
			
			a.moveToElement(womenButton);
			
			Thread.sleep(1000);
			
			a.moveToElement(tshirtButton);
			
			Thread.sleep(2000);
			
			a.click().build().perform();
			
			Thread.sleep(2000);
						 
             a.moveToElement(product).perform();
			
             Thread.sleep(2000);
             
             more.click();
             
             Thread.sleep(2000);
                         
             a.moveToElement(scrolldown).perform();
             add.click();
            
            Thread.sleep(2000);

            size.click();
                     
            Thread.sleep(2000);
            
            large.click();
            
            Thread.sleep(2000);
            
            color.click();
            
            Thread.sleep(2000);
            
            addToCartButton.click();
			
            Thread.sleep(2000);
            
            proceed1.click();
            
            Thread.sleep(2000);
            
            proceed2.click();
            
            Thread.sleep(2000);
            
            proceed3.click();
            
            Thread.sleep(2000);
            
            checkbox.click();
            
            Thread.sleep(2000);
            
            proceed4.click();
            
            Thread.sleep(2000);
            
            bank.click();
            
            Thread.sleep(2000);
            
            confirm.click();
            
            Thread.sleep(2000);
            
		}

		
}
