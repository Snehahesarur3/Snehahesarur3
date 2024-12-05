//POM(Page Object Model)

package Test.Class;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main.pages.LoginPage;


public class LoginTest {
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeMethod
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		loginpage = new LoginPage(driver);
	}
	
	
	
	//@Test()
	@Test(priority = 1)
	void titletest() {
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(loginpage.getTitleofPage(), expectedTitle);		
	}
	
	@Test
	void validlogintest() {
		loginpage.login("standard_user", "secret_sauce");
		Assert.assertTrue(driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).isDisplayed());
	}
	
//	@Test(dataProvider = "LoginData", priority = 2)
//		void validlogintest(String userName, String passWord) {
//			loginpage.login(userName, passWord);
//			try {
//				Assert.assertTrue(driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).isDisplayed());
//			}	catch(NoSuchElementException e) {
//				System.out.println("Test case failed not able to locate");
//			}
//		}
	
	@Test(enabled = false)
	void invalidlogintest() {
		loginpage.login("standard_user", "secret_sauce");
		String expectedError = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(loginpage.getError(), expectedError);
	}
	
	@Test(priority = 3)
	void emptyLogin() {
		loginpage.loginButtonClick();
		String expectedError = "Epic sadface: Username is required";
		Assert.assertEquals(loginpage.getError(), expectedError);
		
	}
		
		@AfterMethod
		void tearDown() {
			if(driver!=null) {
				driver.quit();
			}
		}
	}
