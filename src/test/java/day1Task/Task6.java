package day1Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a")) ;
		
		System.out.println(links.size());
		System.out.println(links);
		
	}

}
