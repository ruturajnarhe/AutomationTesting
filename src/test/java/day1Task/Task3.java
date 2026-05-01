package day1Task;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/link.html");
		
		driver.findElement(By.linkText("click here")).click();
		
		driver.findElement(By.partialLinkText("click")).click();
		
	}

}
