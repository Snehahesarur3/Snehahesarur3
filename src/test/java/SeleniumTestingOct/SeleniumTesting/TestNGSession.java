package SeleniumTestingOct.SeleniumTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSession{
	@BeforeSuite
	void beSuite() {
		System.out.println("Beforesuite method");
	}
	
	@BeforeClass
	void beClass() {
		System.out.println("BeforeClass method");
	}
	
	
	@BeforeMethod
	void beTest() {
		System.out.println("BeforeTest method");
	}
	
	@BeforeTest
	void beMethod() {
		System.out.println("BeforeMethod method");
	}
	
	@Test
	void test() {
		System.out.println("Test method");
	}
	
	@Test(priority =1 )
	void LoginTest() {
		System.out.println("Testcase 1");
	}
	
	@Test(priority = 3)
	void HomePageTest() {
		System.out.println("Testcase 2");
	}
	
	@Test(priority = 4)
	void ProductTest() {
		System.out.println("Testcase 3");
	}
	
	@Test(priority = 2)
	void cartTest() {
		System.out.println("Testcase 4");
	}
	
	@AfterTest
	void AfTest() {
		System.out.println("AfterTest method");
	}
	
	
	@AfterMethod
	void AfMethod() {
		System.out.println("AfterMethod method");
	}
	
	@AfterClass
	void AfClass() {
		System.out.println("AfterClass method");
	}
	
	@AfterSuite
	void AfSuite() {
		System.out.println("Afteresuite method");
	}
	
	
}
