package demo.com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demo.com.PageObject.HomePageOBJ;
import demo.com.PageObject.RegisterOBJ;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase001 {

	WebDriver driver;
	HomePageOBJ hp;
	RegisterOBJ ro;
	
	@BeforeMethod
	public void setup() {
		driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tracker.vmmaps.com/login"); 
		hp= new HomePageOBJ(driver);
		
	}
	
	@Test
	public void TestRegister() throws InterruptedException {
		ro= new RegisterOBJ(driver);
		Thread.sleep(5000);
		hp.register_btn.click();
		ro.email_fill.sendKeys("sealnirnay5@gmail.com");
		ro.phonenumber_fill.sendKeys("9999999999");
		ro.pwd_fill.sendKeys("123456");
		ro.name_fill.sendKeys("Raj");
		ro.register_fbtn.click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
