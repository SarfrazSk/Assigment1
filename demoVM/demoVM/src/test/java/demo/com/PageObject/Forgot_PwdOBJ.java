package demo.com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Forgot_PwdOBJ {
	
	WebDriver ldriver;
	public Forgot_PwdOBJ(WebDriver driver) {
		ldriver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="email")
	@CacheLookup
	public 
	WebElement email_fill; 
	

}
