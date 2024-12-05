package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSession2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//id:
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Shridhar");
		Thread.sleep(2000);
		
		//name:
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Besant@123");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.className("_5lsy"));
		loginButton.click();
		 
		//linktext
		
		
		//WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		//link.click();
		
		//partial link text
		
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		//css Selectors
		WebElement createNewAcc = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		
	}

}
