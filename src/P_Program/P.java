package P_Program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\src\\P_Program\\New.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		WebElement name = driver.findElement(By.xpath("//input[contains(@name, 'name')]"));
		name.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		WebElement date = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]"));
		date.sendKeys(data.getRow(0).getCell(1).getStringCellValue());
		WebElement month = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
		month.sendKeys(data.getRow(0).getCell(2).getStringCellValue());
		WebElement year = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]"));
		year.sendKeys(data.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
