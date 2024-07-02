package demo.com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterOBJ {
	
WebDriver ldriver;
	
	public RegisterOBJ(WebDriver driver) {
		ldriver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="Name")
	@CacheLookup
	public 
	WebElement name_fill; 
	
	@FindBy(how=How.ID,using="email")
	@CacheLookup
	public 
	WebElement email_fill; 
	
	@FindBy(how=How.XPATH,using="//input[@class='PhoneInputInput']")
	@CacheLookup
	public 
	WebElement phonenumber_fill; 
	
	
	@FindBy(how=How.ID,using="password")
	@CacheLookup
	public 
	WebElement pwd_fill; 
	

	@FindBy(how=How.ID,using="registerSubmit")
	@CacheLookup
	public 
	WebElement register_fbtn; 

}
