package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {
	public static WebDriver driver;
	
	static void drag_Drop() {
	driver.get("https://demoqa.com/droppable");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement drag = driver.findElement(By.id("draggable"));
	js.executeScript("arguments[0].scrollIntoView(true);", drag);
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop);
	act.perform();
	}
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		drag_Drop();
	}
}
