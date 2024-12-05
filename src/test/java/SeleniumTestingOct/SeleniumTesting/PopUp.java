package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("C:/Users/91974/OneDrive/Documents/Desktop/Selenium/PopUp.html");
		Thread.sleep(2000);
		driver.findElement(By.id("upload file")).sendKeys("C:\\Users\\91974\\Downloads\\SQL NOTES week -5.pdf");
	}

}
