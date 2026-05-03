package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@id='oldSelectMenu']")).click();
		
		// Select single option
//		driver.findElement(By.xpath("//option[@value='red']")).click();
		
		
		// capture all the options and get the size
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='oldSelectMenu']/child::option"));
		System.out.println("No of options : " + options.size());
		
		
		// printing options from drop down
		for(WebElement op : options) {
			System.out.println(op.getText());
		}
		
		
		// select multiple options
		for(WebElement op : options) {
			String option = op.getText();
			if(option.equals("Black") || option.equals("White") || option.equals("Voilet")) {
				op.click();
			}
		}
	}

}
