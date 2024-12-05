//write a script to perform login using id and class by css locators

package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#email")).sendKeys("Shridhar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._9npi")).sendKeys("password123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._42ft")).click();
	}
}
