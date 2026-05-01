package day2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		// name
//		driver.findElement(By.name("Search for products, brands and more")).sendKeys("Mac");
		
		
		// id
//		boolean logoDisplayedStatus = driver.findElement(By.id("desktop-header-cnt")).isDisplayed();
//		System.out.println(logoDisplayedStatus);
		
		//linktext and partialLinktext
//		driver.findElement(By.linkText("MEN")).click();
//		driver.findElement(By.partialLinkText("ME")).click();
		
		
		// Class Name
//		List<WebElement> headerLinks = driver.findElements(By.className("desktop-navContent"));
//		System.out.println("Total number of header links : " + headerLinks.size());
		
		
		// Tag Name
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("Total number of links : " + links.size());
//		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : " + images.size());
		
	}

}
