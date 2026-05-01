package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverGetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// get methods - we can access these methods through webdriver instance
		
		// 1) get(url) - opens the url on the browser 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		// 2) getTitle() - returns title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		
		// 3) getCurrentUrl() - returns the current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		// 4) getPageSource() - returns source code of the page
//		System.out.println(driver.getPageSource());
		
		
		// 5) getWindowHandle() - returns the ID of the single browser window(single tab)
		System.out.println(driver.getWindowHandle());
		
		
		// 6) getWindowHandles() - returns ID's of the multiple browser window(multiple tabs)
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		System.out.println(driver.getWindowHandles());
	}

}
