package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		
		
		// 1) Launch the Browser (Edge)
//		EdgeDriver driver = new EdgeDriver();
		WebDriver driver = new EdgeDriver();
		
		
		// 2) Open URL https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		
		// 3) Validate title shoul be "nopCommerce demo store"
		String act_title = driver.getTitle();
		if(act_title.equals("nopCommerce demo store. Home page title"))
			System.out.println("Test passed");
		else 
			System.out.println("Test failed");
		
		
		// 4) Close browser
		driver.close();
//		driver.quit();
	}

}
