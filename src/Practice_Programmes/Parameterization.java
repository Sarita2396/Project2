package Practice_Programmes;

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

public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\Excel_Data.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		WebElement name = driver.findElement(By.xpath("//input[contains(@name, 'name')]"));
		name.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		WebElement pass = driver.findElement(By.xpath("//input[contains(@name, 'pass')]"));
		pass.sendKeys(data.getRow(0).getCell(1).getStringCellValue());
		driver.close();
		
		
	}

}
