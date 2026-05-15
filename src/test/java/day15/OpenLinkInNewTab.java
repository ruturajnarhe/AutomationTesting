package day15;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		
		Actions act = new Actions(driver);
		
		// ctrl+regLink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		// switching to registration page
		List<String> ids = new ArrayList(driver.getWindowHandles());
		
		// Registration
		driver.switchTo().window(ids.get(1)); // switch to registration page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ruturaj Narhe");
		
		// Home Page
		driver.switchTo().window(ids.get(0)); // switch to home page
	}

}
