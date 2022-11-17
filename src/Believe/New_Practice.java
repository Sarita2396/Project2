package Believe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class New_Practice {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		WebElement u1 = driver.findElement(By.xpath("//input[@type='text']"));
//		WebElement p1 = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		//ChildBrowser
		WebElement popup = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Set<String> add = driver.getWindowHandles();
		
		Iterator<String> itr = add.iterator();
		
		String s[] = new String[10];
		for(int i=0; i<add.size(); i++)
		{
			s[i] = itr.next();
			System.out.println(add);
		}
		
		driver.switchTo().window(s[0]);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(s[1]);
		System.out.println(driver.getTitle());
		
		//Actions Class
		WebElement actionClass = driver.findElement(By.xpath("//input[@type='submit']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(actionClass).build().perform();
		
		for(int i=1; i<4; i++)
		{
			a1.sendKeys(Keys.DOWN).build().perform();
		}
		
		a1.sendKeys(Keys.ENTER).build().perform();
		
		
		//Drag n Drop
		WebElement frame = driver.findElement(By.xpath(""));
		driver.switchTo().frame(frame);
       WebElement dragndrop = driver.findElement(By.xpath("//input[@type='submit']"));
       WebElement trash = driver.findElement(By.xpath("//input[@type='submit']"));
		driver.switchTo().frame("");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Actions d1 = new Actions(driver);
		
		d1.dragAndDrop(actionClass, trash).build().perform();
		
		
		//WebTables

		List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		List<WebElement> col = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul//li"));
		
		System.out.println(row.size());
		System.out.println(col.size());
		
		for(int i=0; i<row.size(); i++)
		{
			System.out.println(row.get(i).getText());
		}
		
		
		//ListBox
		WebElement list = driver.findElement(By.xpath(""));
		
		Select s1 = new Select(list);
		s1.selectByVisibleText("");
		s1.selectByIndex(0);
		System.out.println(s1.isMultiple());
		
		List <WebElement> options = s1.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//ScreenShot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("Folder Path");
		FileHandler.copy(source, dest);
		
		//Parameterization
		
		FileInputStream file = new FileInputStream("ExcelFile Path");
		Sheet v1 = WorkbookFactory.create(file).getSheet("Sheet Name");
		WebElement p1 = driver.findElement(By.xpath(""));	
		p1.sendKeys(v1.getRow(0).getCell(0).getStringCellValue());
		
		//GoogleSugg
		WebElement search = driver.findElement(By.xpath(""));	
		search.sendKeys("Testing");
		List<WebElement> googleList = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(int i=0; i<googleList.size(); i++)
		{
			System.out.println(googleList.get(i).getText());
		}
		
		for(int i=0; i<googleList.size(); i++)
		{
		String actualResult = googleList.get(i).getText();
		String expectedResult = "testing types";
		
		if(actualResult.equals(expectedResult))
		{
			googleList.get(i).click();
			break;
		}
		
		Thread.sleep(2000);
		
	}
		
		
		driver.close();
		
	}

}
