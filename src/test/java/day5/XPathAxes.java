package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
		// Parent
		boolean parent = driver.findElement(By.xpath("//input[@id='email']/parent::div")).isDisplayed();
		System.out.println(parent);
		
		
		// ancestor
		boolean ancestor = driver.findElement(By.xpath("//input[@id='email']/ancestor::form")).isDisplayed();
		System.out.println(ancestor);
		
		
		// child
//		driver.findElement(By.xpath("//div[@class='form-group']/child::input")).sendKeys("ruturajnarhe");
		
		// descendant
//		driver.findElement(By.xpath("//form[@id='login_form']/descendant::input")).sendKeys("narheruturaj");
		
		
		// following
//		driver.findElement(By.xpath("//label[text()='Email address']/following::input")).sendKeys("ruturajnarhe");
		
		
		// preceding
//		driver.findElement(By.xpath("//input[@name='passwd']/preceding::input")).sendKeys("narhe");
		
		
		// following-sibling
//		driver.findElement(By.xpath("//label[text()='Email address']/following-sibling::input")).sendKeys("ruturajnarhe");
		
		
		// preceding-sibling
//		driver.findElement(By.xpath("//input[@name='email']/preceding-sibling::label"));
		
		
		// self
		driver.findElement(By.xpath("//input[@name='email']/self::input")).sendKeys("ruturajnarhe");


		
	}

}
