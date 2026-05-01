package day1Task;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String act_title = driver.getTitle();
		if(act_title.equals("Google")) {
			System.out.println(act_title);
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}	
	}

}
