package NewPrograms;

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

public class PracticeProgram9 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\Excel_Data.xlsx");
		Sheet readSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		WebElement a1 = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]"));
		a1.sendKeys(readSheet.getRow(2).getCell(0).getStringCellValue());
		WebElement a2 = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
		a2.sendKeys(readSheet.getRow(2).getCell(1).getStringCellValue());
		WebElement a3 = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]"));
		a3.sendKeys(readSheet.getRow(2).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		driver.close();
		
	}

}
