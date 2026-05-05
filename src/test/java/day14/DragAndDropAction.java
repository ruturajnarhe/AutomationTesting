package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		// drag and drop1
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(draggable, droppable).perform();
		
	}

}
