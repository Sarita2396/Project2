package Overall_Practice_Java;

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

public class Rediff_Excel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
				
		FileInputStream File = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\Excel_Data.xlsx");
		Sheet excel = WorkbookFactory.create(File).getSheet("Sheet1");
		WebElement fullName = driver.findElement(By.xpath("//input[@maxlength='61']"));
		fullName.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@name, 'login')]"));
		email.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());

		WebElement checkBtn = driver.findElement(By.xpath("//input[contains(@name, 'btn')]"));
		
		WebElement pass = driver.findElement(By.xpath("//input[contains(@name, 'passwd')]"));
		pass.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		
		WebElement repass = driver.findElement(By.xpath("//input[contains(@name, 'confirm')]"));
		repass.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
		
		WebElement alterEmail = driver.findElement(By.xpath("//input[contains(@maxlength, '100')]"));
		alterEmail.sendKeys(excel.getRow(0).getCell(4).getStringCellValue());
		
		WebElement mob = driver.findElement(By.xpath("//input[contains(@name, 'mob')]"));
		mob.sendKeys(excel.getRow(1).getCell(0).getStringCellValue());

		WebElement daySelect = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]"));
		Select a = new Select(daySelect);
		daySelect.sendKeys(excel.getRow(1).getCell(2).getStringCellValue());
		
		WebElement monthSelect = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
		Select b = new Select(monthSelect);
		monthSelect.sendKeys(excel.getRow(1).getCell(3).getStringCellValue());

		WebElement yearSelect = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]"));
		Select c = new Select(yearSelect);
		yearSelect.sendKeys(excel.getRow(1).getCell(4).getStringCellValue());

		WebElement gender = driver.findElement(By.xpath("//input[contains(@name, 'gender')][2]"));
		gender.click();
		
		WebElement countrySelect = driver.findElement(By.xpath("//select[contains(@name, 'country')]"));
		Select d = new Select(countrySelect);
		d.selectByVisibleText("India");

		WebElement citySelect = driver.findElement(By.xpath("//select[contains(@name, 'city')]"));
		Select e = new Select(citySelect);
		e.selectByVisibleText("Pune");
		
		WebElement captcha = driver.findElement(By.xpath("//input[contains(@class, 'captcha')]"));
		captcha.sendKeys(excel.getRow(1).getCell(1).getStringCellValue());
		
		WebElement createAccount = driver.findElement(By.xpath("//input[contains(@name, 'Register')]"));
		createAccount.click();
		Thread.sleep(2000);
		driver.close();
	}

}
