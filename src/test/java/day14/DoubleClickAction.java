package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		field1.clear();
		field1.sendKeys("WELCOME");
		
		// Double click action on button
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
		
		// validation : box2 should contains "WELCOME"
		String text = field2.getAttribute("value");
		
		System.out.println("Captured value is : " + text);
		
		if(text.equals("WELCOME")) {
			System.out.println("Text copied..");
		} else {
			System.out.println("Text not copied properly..");
		}
	}

}
