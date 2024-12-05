package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificastion {
	
	static WebDriver driver;
	
	static void verifyingTitle() {
		
		driver.findElement(By.xpath("//span[.='Documentation']")).click();
		if(driver.getTitle().equals("The Selenium Browser Automastion Project | Selinum")) {
		System.out.println("Test Case Pass");
		}
	else {
		System.out.println("Test Case Failed");
	}
		driver.quit();
	}

	
	static void verifyingElement() {
		driver.findElement(By.xpath("//span[.='Documentation']")).click();
		boolean versionNo = driver.findElement(By.xpath("//div[.='v4.0']")).isDisplayed();
		if(versionNo) {
			System.out.println("Test Case Pass");
		}
	else {
		System.out.println("Test Case Failed");
	}
		driver.quit();
		}
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//verifyingTitle();
		verifyingElement();
	}
	
}
