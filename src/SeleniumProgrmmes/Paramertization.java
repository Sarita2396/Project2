package SeleniumProgrmmes;

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

public class Paramertization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\src\\SeleniumProgrmmes\\New.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		WebElement variable = driver.findElement(By.xpath("//input[@id='login1']"));
		variable.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		WebElement variable1 = driver.findElement(By.xpath("//input[@id='password']"));
		variable1.sendKeys(data.getRow(0).getCell(1).getStringCellValue());
		WebElement login = driver.findElement(By.xpath("//input[@value='Sign in']"));
		login.click();
		Thread.sleep(2000);
		driver.close();
	}

}
