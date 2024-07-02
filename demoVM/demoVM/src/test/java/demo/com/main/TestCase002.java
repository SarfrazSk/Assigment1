package demo.com.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demo.com.PageObject.HomePageOBJ;
import demo.com.PageObject.LoginOBJ;
import demo.com.PageObject.RegisterOBJ;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase002 {

	WebDriver driver;
	HomePageOBJ hp;
	LoginOBJ lo;
	
	@BeforeMethod
	public void setup() {
		driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tracker.vmmaps.com/login"); 
		hp= new HomePageOBJ(driver);
		lo= new LoginOBJ(driver);
		
	}
	
	@Test
	public void TestLogin() throws InterruptedException {
		Thread.sleep(5000);
		lo.email_fill.sendKeys("sealnirnay5@gmail.com");
		lo.pwd_fill.sendKeys("123456");
		lo.login_btn.click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
