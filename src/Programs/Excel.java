package Programs;

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

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\NewFile.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
//		WebElement name = driver.findElement(By.xpath("//input[contains(@name, 'name')]"));
//		name.sendKeys(data.getRow(0).getCell(1).getStringCellValue());
//		WebElement value = driver.findElement(By.xpath("//input[contains(@name, 'passwd')]"));
//		value.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		
		String value = data.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		Thread.sleep(2000);
		
		
		driver.close();
	}

}
