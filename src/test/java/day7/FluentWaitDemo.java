package day7;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Click Start button
        driver.findElement(By.xpath("//button")).click();

        // Create Fluent Wait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))   // wait max 10 sec
                .pollingEvery(Duration.ofSeconds(1));  // check every 1 sec

        // Wait for "Hello World" text
        WebElement text = wait.until(d -> {
            WebElement element = driver.findElement(By.id("finish"));
            if (element.isDisplayed()) {
                return element;
            }
            return null;
        });

        System.out.println(text.getText()); // Hello World

        driver.quit();
    }
}

/*
👉 Think like:

👨‍🏫 Teacher waiting for student:

Wait for 10 minutes
Check every 1 minute
If student comes → stop waiting

👉 That is Fluent Wait 😄

*/
