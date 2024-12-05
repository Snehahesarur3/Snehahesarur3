package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91974/OneDrive/Documents/Desktop/Selenium/Locatorsexample.html");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.tagName("a"));
		Thread.sleep(3000);
		link.click();
	}

}
