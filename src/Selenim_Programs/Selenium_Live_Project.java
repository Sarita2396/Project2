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

public class Selenium_Live_Project {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.manage().window().maximize();
		
		WebElement value = driver.findElement(By.xpath("//input[@maxlength='61']"));
		WebElement value1 = driver.findElement(By.xpath("//input[@maxlength='30']"));
		WebElement value2 = driver.findElement(By.xpath("//input[@value='Check availability']"));

		
        FileInputStream File = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\TestData.xlsx");
		
		Sheet data = WorkbookFactory.create(File).getSheet("Sheet3");
		
		value.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		value1.sendKeys(data.getRow(0).getCell(1).getStringCellValue());
		value2.click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
