package day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		// tag id --> tag#id  // Tag name is optional
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iPhone");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iPad");
		
		
		// tag class ---> tag.classname 
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		
		// tag attributes ---> tag[attribute='value']
//		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Samsung");
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Samsung");
		
		
		// tag class attribute ----> tag.className[attribute='value']
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Shirts");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Shirts");
		
		
	}

}
