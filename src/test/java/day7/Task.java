package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();  
		
		// open URL
		driver.get("https://the-internet.herokuapp.com/login");
		
		// get title
		System.out.println(driver.getTitle());
		
		// enter username
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("tomsmith");
		
		// enter password
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("SuperSecretPassword!");
		
		// click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Wait for message
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));

		// Validate
		if(msg.getText().contains("You logged into a secure area!")) {
		    System.out.println("Login Passed");
		} else {
		    System.out.println("Login Failed");
		}
		
		// Logout
		driver.findElement(By.xpath("//a[@href='/logout']")).click();

		// Validate logout
		WebElement logoutMsg = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.id("flash"))
		);

		if(logoutMsg.getText().contains("You logged out")) {
		    System.out.println("Logout Passed");
		} else {
		    System.out.println("Logout Failed");
		}

		driver.quit();
		
	
	}

}
