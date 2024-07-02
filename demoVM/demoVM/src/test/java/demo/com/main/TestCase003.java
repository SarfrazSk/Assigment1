package demo.com.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demo.com.PageObject.Forgot_PwdOBJ;
import demo.com.PageObject.HomePageOBJ;
import demo.com.PageObject.LoginOBJ;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase003 {
	
	WebDriver driver;
	HomePageOBJ hp;
	Forgot_PwdOBJ fo;
	
	@BeforeMethod
	public void setup() {
		driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tracker.vmmaps.com/login"); 
		hp= new HomePageOBJ(driver);
		fo= new Forgot_PwdOBJ(driver);
		
	}
	
	@Test
	public void TestForgotPass() throws InterruptedException {
		Thread.sleep(5000);
		hp.forgot_pwd.click();
		fo.email_fill.sendKeys("jack.ff@gmail.com");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
