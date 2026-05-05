package day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	static void selectFutureDate(WebDriver driver, String year, String month, String date) {
		// select month and year
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next
		}

		// select the date
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
	
	static void selectPastDate(WebDriver driver, String year, String month, String date) {
		// select month and year
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year
			
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous
		}
		
		// select the date
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
		
		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		// method1 :using sendKeys()
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2026");
		// //mm/dd/yyyy

		// method2 : using date picker

		// expected data
		String year = "2022";
		String month = "May";
		String date = "20";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // opens date picker

//		selectFutureDate(driver, year, month, date);
		selectPastDate(driver, year, month, date);

	}

}
