package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		// single file upload - Test1.txt
		/* driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\FileUpload\\Test1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt")) {
			System.out.println("File is sucessfully uploaded");
		} else {
			System.out.println("Upload failed");
		} */
		
		
		// multiple file uploaded 
		String file1 = "D:\\\\FileUpload\\\\Test1.txt";
		String file2 = "D:\\\\FileUpload\\\\Test2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
		
		int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		// validation 1 - no of files
		if(noOfFilesUploaded == 2) {
			System.out.println("All files uploaded sucessfully");
		} else {
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		
		// validate files name
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt")) {
			System.out.println("file names maching...");
		} else {
			System.out.println("file are not matching...");
		}
		
	}

}
