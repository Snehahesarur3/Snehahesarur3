package SeleniumTestingOct.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSession3 {
	
	public static WebDriver driver;
		
		public static void method1() {
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			//using start-with function
			WebElement userName=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Username')]"));
			userName.sendKeys("standard_user");
		}
		
		public static void method2() {
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			//xpath by index 2 types
			
			//index by specific hierarchy
			WebElement userName = driver.findElement(By.xpath("//div[contains(@class,'form_group')]//input[1]"));
			userName.sendKeys("standard_user");
			
			//basic indexing
			WebElement password = driver.findElement(By.xpath("//input[contains(@class,'form_input')])[2]"));
			password.sendKeys("secret_sauce");
			
			//combing both
			//WebElement password = driver.findElement(By.xpath("//div[@class,'form_input'][2]/input"));
			//password.sendKeys("secret_sauce");
			
		}
		
		public static void method3(){
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			//using find Elements
			List<WebElement> textfeild = driver.findElements(By.className("form_input"));
			for (WebElement ele : textfeild) {
				System.out.println(ele);
			}
			textfeild.get(0).sendKeys("standard_user");//fetches the 1st matching address
			
			textfeild.get(1).sendKeys("secrret_sauce");//fetches the 2nd matching address
		}
		

		public static void main(String[] args) {
			
			driver = new ChromeDriver();
			//method1();
			method2();
			//method3();
	}
	
		}


