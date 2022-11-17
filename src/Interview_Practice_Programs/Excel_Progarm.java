package Interview_Practice_Programs;

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

public class Excel_Progarm {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		FileInputStream File = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\TestDoc.xlsx");
		Sheet doc = WorkbookFactory.create(File).getSheet("Sheet1");
		WebElement mob = driver.findElement(By.xpath("//input[@id='mobno']"));
		mob.sendKeys(doc.getRow(0).getCell(0).getStringCellValue());
		
		WebElement dod = driver.findElement(By.xpath("//select[contains(@name , 'DOB_Day')]"));
		Select a = new Select(dod);
		dod.sendKeys(doc.getRow(0).getCell(1).getStringCellValue());
		
		WebElement dom = driver.findElement(By.xpath("//select[contains(@name , 'DOB_Month')]"));
		Select b = new Select(dom);
		dom.sendKeys(doc.getRow(0).getCell(2).getStringCellValue());
		
		WebElement doy = driver.findElement(By.xpath("//select[contains(@name , 'DOB_Year')]"));
		Select c = new Select(doy);
		doy.sendKeys(doc.getRow(0).getCell(3).getStringCellValue());

		WebElement radio = driver.findElement(By.xpath("//input[contains(@name , 'gender')][2]"));
		radio.click();
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.xpath("//select[contains(@name , 'city')]"));
		Select d = new Select(city);
		city.sendKeys(doc.getRow(0).getCell(4).getStringCellValue());
		
		driver.close();
		
//		FileInputStream file = new fileInputStream();
//		Sheet var = WorkbookFactory.create(file).getSheet("sheetname");
//		WebElement FindOut
//		FindOut.sendKeys(var.getRow(0).getCell(0).getStringCellValue());
//	
	}

}
