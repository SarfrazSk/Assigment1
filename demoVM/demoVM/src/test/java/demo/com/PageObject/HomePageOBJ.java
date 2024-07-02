package demo.com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageOBJ {

WebDriver ldriver;
	
	public HomePageOBJ(WebDriver driver) {
		ldriver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="register-tab")
	@CacheLookup
	public 
	WebElement register_btn; 
	
	@FindBy(how=How.XPATH,using="//*[text()='Forgot Password ?']")
	@CacheLookup
	public 
	WebElement forgot_pwd; 
	
}
