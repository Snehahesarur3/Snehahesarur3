package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingFunction {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91974/OneDrive/Documents/Desktop/Selenium/siblingfunction.html");
		WebElement TrainerManoj = driver.findElement(By.xpath("//div[@id='content']/div[1]/p[1]"));
		System.out.println(TrainerManoj.getText());
		
		//Static: Besant ------------- Dyanamic : Manual Starts
		WebElement ManualStarts = driver.findElement(By.xpath("//h1[contains(.,Besant)]/following-sibling::div[1]/p[2]"));
		System.out.println(ManualStarts.getText());
		
		//Static: Automastion ------------- Dyanamic : CoreJava
		WebElement CoreJava = driver.findElement(By.xpath("//h2[starts-with(.,'Automation')]/../preceding-sibling::div[1]/h2\r\n"+ ""));
		System.out.println(CoreJava.getText());
		
		//Static: ManualTest ------------- Dyanamic : AutomastionStarts
		WebElement AutomastionStarts = driver.findElement(By.xpath("//h2[.='Manual Testing']/../following-sibling::div[2]/p[2]\r\n"+ ""));
		System.out.println(AutomastionStarts.getText());
		
		//Static: CoreJava ------------- Dyanamic : ManualTEsting
		WebElement ManualTesting = driver.findElement(By.xpath("//h2[.='Core Java']/../preceding-sibling::div/h2"));
		System.out.println(ManualTesting.getText());
				
		
		//Static: SoftwareTesting ------------- Dyanamic : AutomastionTrainer
		WebElement AutomastionTrainer = driver.findElement(By.xpath("//p[.='Software Testing']/following-sibling::div[3]/p[1]"));
		System.out.println(AutomastionTrainer.getText());
		
		//Static: AutomastionShridhar ------------- Dyanamic :corejavaStrats
		WebElement corejavaStrats = driver.findElement(By.xpath("//p[.='Trainer - Shridhar'])[2]/../preceding-sibling::div[1]/p[2]"));
		System.out.println(corejavaStrats.getText());
		
	}
}
