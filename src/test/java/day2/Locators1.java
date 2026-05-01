package day2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ChromeDriver  driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		
		// Total number of links using Tag Name
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links : " + links.size());
		
		
		// Total number of images using tag name
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : " + images.size());
		
		
		// Click on any link using linkText/partialLinktext
//		driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.partialLinkText("Car")).click();
		
	}

}
