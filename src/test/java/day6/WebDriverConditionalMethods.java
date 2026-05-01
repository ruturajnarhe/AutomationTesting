package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		
		// Conditional Methods - access these commands through WebElements
		
		// 1) isDisplayed()
		/* WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		boolean status = driver.findElement(By.xpath("//h1[text()='Register']")).isDisplayed();
		System.out.println(status); */
		
		
		// 2) isEnabled
		/* boolean status = driver.findElement(By.xpath("//input[@placeholder='Search store']")).isEnabled();
		System.out.println(status);
		
		boolean status1 = driver.findElement(By.xpath("//input[@name='FirstName']")).isEnabled();
		System.out.println(status); */
		
		
		// 3) isSelected
		// not selecting anyone
		WebElement maleRB = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femaleRB = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before slection....");
		System.out.println(maleRB.isSelected());  // false
		System.out.println(femaleRB.isSelected()); // false
		
		
		System.out.println("After selecting male");
		maleRB.click();
		System.out.println(maleRB.isSelected());  // true
		System.out.println(femaleRB.isSelected()); // false
		
		
		System.out.println("After selecting female");
		femaleRB.click();
		System.out.println(maleRB.isSelected());  // false
		System.out.println(femaleRB.isSelected()); // true
		
	}

}
