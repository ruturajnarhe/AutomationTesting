package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		// 1) find the total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // multiple tables
//		int rows = driver.findElements(By.tagName("tr")).size(); // single table
		
		System.out.println("Total number of rows in table : " + rows);
		
		
		// 2) find the total number of columns in a table
		int column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		System.out.println("Total number of columns in table : " + column);
		
		
		// 3) Read the data from specific row and column (ex: 5th row and 1st column)
		// String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		// System.out.println(bookName);
		
		
		// 4) read data from all the rows and column
		/* (int i = 2; i <= rows; i++) {
			for(int j = 1; j <= column; j++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value + "\t");
			}
			System.out.println();
		} */
		
		
		// 5) print book names whose author is Mukesh
		/* for(int i = 2; i <= rows; i++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(author.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
				System.out.println(bookName + "\t" + author);
			}
		} */
		
		
		// 6) find total price of all the books
		int total = 0;
		for(int i = 2; i <= rows; i++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			total += Integer.parseInt(price);
		}
		System.out.println("Total price of the books : " + total); // 7100
	}

}
