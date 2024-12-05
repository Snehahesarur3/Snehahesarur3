package SeleniumTestingOct.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

	public static void main(String []args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();//launching the browser
		//driver.close();//closes the current window/tab
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");//maximizing the window
		String title = driver.getTitle();//fetching the title
		System.out.println(title);
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();//fetching the current url
		System.out.println(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);//fetching page source
		driver.quit();//quiting the browser
	}
    
}