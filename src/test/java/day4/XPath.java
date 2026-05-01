package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		
		
//		xpath with single attribute 
//		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Shirts");
		
		
		
//		xpath with multiple attributes
//		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more'][@class='desktop-searchBar']")).sendKeys("Jeans");
		
		
//		xpath with 'and'  'or' operator
//		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more' and @class='desktop-searchBar']")).sendKeys("Jeans");
//		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more' or @class='desktop']")).sendKeys("Jeans");
		
		
//		xpath with text() - inner text
//		driver.findElement(By.xpath("//*[text()='Men']")).click();
		
		
		/* boolean displayStatus = driver.findElement(By.xpath("//h4[text()='RISING STARS']")).isDisplayed();
		System.out.println(displayStatus);
		
		
		String value = driver.findElement(By.xpath("//h4[text()='RISING STARS']")).getText();
		System.out.println(value); */
		
		
//		xpath with contains()
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Shoes");
		
//		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("crocs");
		
		
//		Chained xpath
//		driver.findElement(By.xpath("//))
		
		
	}

}
