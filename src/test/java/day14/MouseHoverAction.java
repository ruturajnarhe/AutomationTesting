package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.myntra.com");
		driver.manage().window().maximize();
		
		WebElement men = driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));
		WebElement tshirt = driver.findElement(By.xpath("//a[@href='/men-tshirts']"));
		
		Actions act = new Actions(driver);
		// Mouse Hover
//		act.moveToElement(men).moveToElement(tshirt).click().build().perform();
		
		act.moveToElement(men).moveToElement(tshirt).click().perform();
	}

}
