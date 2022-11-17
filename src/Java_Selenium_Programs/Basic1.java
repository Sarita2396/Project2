package Java_Selenium_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Basic1 {
	

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\chromedriver.exe");
		//ChromeOptions o = new ChromeOptions();
		//o.addArguments("headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/57830523/selenium-webdrivermanager");
		System.out.println(driver.getTitle());
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("ScreenShotfolderpath");
		FileHandler.copy(source, dest);
				
		FileInputStream file = new FileInputStream("File Path");
		Sheet var = WorkbookFactory.create(file).getSheet("Sheet name");
//		String var1 = var.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(var1);
		WebElement var1 = driver.findElement(By.xpath(""));
//		var1.sendKeys(var.getRow(1).getCell(0).getStringCellValue());
//		System.out.println(var1);
		
		
		
		
		
		driver.close();
		
		
	}

}
