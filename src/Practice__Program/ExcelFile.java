package Practice__Program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		FileInputStream file = new FileInputStream("File Path");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet Name");
		WebElement var = driver.findElement(By.xpath(""));
		var.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
//		var.sendKeys(data.getRow(0).getCell(0).getNumericCellValue());
//		var.sendKeys(data.getRow(0).getCell(0).getBooleanCellValue());
		
		driver.close();

	}

}
