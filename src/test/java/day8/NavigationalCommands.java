package day8;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
//		driver.get("https://demo.nopcommerce.com/");  // accepts URL only in String format
		
//		URL myurl = new URL("https://demo.nopcommerce.com/");
//		driver.navigate().to(myurl);
		
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().refresh();
		
		
		
		
	}

}
