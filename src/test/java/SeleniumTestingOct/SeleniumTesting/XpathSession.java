package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSession {
                     
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

}
