package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 	Test Case :
 	
 	1) Launch the Browser (Chrome)
 	2) Open URL https:// demo.opencart.com/
 	3) Validate title shoul be "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
 	4) Close browser
 	
*/

public class FirstTestCase {

	public static void main(String[] args) {
		
		// 1) Launch the Browser (Chrome) 
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
//		2) Open URL https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		
//		3) Validate title shoul be "Your Store"
		String act_title = driver.getTitle();
		if(act_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		
//		4) Close browser
		driver.close();
//		driver.quit();

	}

}
