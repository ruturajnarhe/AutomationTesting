package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions  act = new Actions(driver);
		
		// Min slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]")); 
		System.out.println("Default location of min slider : " + min_slider.getLocation()); // (59, 247) = (x, y)
		act.dragAndDropBy(min_slider, 100, 247).perform();
		System.out.println("Location of min slider after moving : " + min_slider.getLocation()); // (158, 247)
		
		
		// Max slider
		WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Default location of max slider : " + max_slider.getLocation()); // (510, 249)
		act.dragAndDropBy(max_slider, -100, 247).perform();
		System.out.println("Location of max slider after moving  : " + max_slider.getLocation()); // (411, 249)
	}

}
