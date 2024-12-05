package SeleniumTestingOct.SeleniumTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopAlert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(2000);
		WebElement smpleAlertPopup = driver.findElement(By.id("alertButton"));
		smpleAlertPopup.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}
	

}
