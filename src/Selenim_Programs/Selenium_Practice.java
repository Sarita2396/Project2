package Selenim_Programs;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Practice {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
				
		WebElement value = driver.findElement(By.xpath("//input[@type='text']"));
		
		WebElement value2 = driver.findElement(By.xpath("//span[text()='Mahesh Babu']"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\TestData.xlsx");
		
		Sheet Data = WorkbookFactory.create(file).getSheet("Sheet4");
		
		value.sendKeys(Data.getRow(0).getCell(0).getStringCellValue());
		
		value2.click();
				
		Thread.sleep(5000);
		
		driver.close();
			
	}

}
