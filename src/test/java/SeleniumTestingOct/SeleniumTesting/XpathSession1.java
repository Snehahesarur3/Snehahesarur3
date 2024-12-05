package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSession1 {
	
	public static WebDriver driver;
	
	public static void xpathByAttribute() throws InterruptedException {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//handling the element using single attribute
		WebElement username = driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']"));
		username.sendKeys("locked_out_user");
		Thread.sleep(2000);
		
		//handling the element using multiple attributes
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();

	}
	
		public static void openCart() {
			driver.get("hhtps://opencart.com");
			driver.manage().window().maximize();
			
			//text() and . are same
			//driver.findElement(By.xpath("//a[text()='Features']")).click();
			//driver.findElement(By.xpath("//a[.='Features']")).click();
			
			//handling a element for text function
			driver.findElement(By.xpath("//a[contains(.,'Feat')]")).click();
			
		}
	
		public static void main(String[] args) throws InterruptedException {
			driver=new ChromeDriver();
			//openCart();
			xpathByAttribute();

}
}
