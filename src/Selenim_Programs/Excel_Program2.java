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

public class Excel_Program2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://is.rediff.com/signup/register");
		
		WebElement fNameTextBox = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement newPassTextBox = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement rePassTextBox = driver.findElement(By.xpath("//input[@name='repass']"));
		WebElement GenderBtn = driver.findElement(By.xpath("//input[@value='f']"));
		WebElement listBoxDay = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement listBoxMonth = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement listBoxYear = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement locationTextBox = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement schoolTextBox = driver.findElement(By.xpath("//input[@name='school']"));
		WebElement collegeTextBox = driver.findElement(By.xpath("//input[@name='college']"));
		WebElement captchaBtn = driver.findElement(By.xpath("//input[@name='fld_captcha']"));
		WebElement signUpBtn = driver.findElement(By.xpath("//input[@value='Sign up']"));
		
		
		FileInputStream file = new FileInputStream("\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\TestData.xlsx");
		
		Sheet testData = WorkbookFactory.create(file).getSheet("Sheet2");
		
		fNameTextBox.sendKeys(testData.getRow(0).getCell(0).getStringCellValue());
		emailTextBox.sendKeys(testData.getRow(0).getCell(1).getStringCellValue());
		newPassTextBox.sendKeys(testData.getRow(0).getCell(2).getStringCellValue());
		rePassTextBox.sendKeys(testData.getRow(0).getCell(3).getStringCellValue());
		GenderBtn.click();
		Select a = new Select(listBoxDay);
		a.selectByVisibleText(testData.getRow(0).getCell(4).getStringCellValue());
		Select b = new Select(listBoxMonth);
		b.selectByVisibleText(testData.getRow(0).getCell(5).getStringCellValue());
		Select c = new Select(listBoxYear);
		c.selectByVisibleText(testData.getRow(0).getCell(6).getStringCellValue());
		locationTextBox.sendKeys(testData.getRow(0).getCell(7).getStringCellValue());
		schoolTextBox.sendKeys(testData.getRow(0).getCell(8).getStringCellValue());
		collegeTextBox.sendKeys(testData.getRow(0).getCell(9).getStringCellValue());
		captchaBtn.sendKeys(testData.getRow(0).getCell(10).getStringCellValue());
		signUpBtn.click();
	

	}

}
