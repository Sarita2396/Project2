package NewFileSeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

public class OverallPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.navigate().forward();
		
		//Alert
		
		WebElement var = driver.findElement(By.xpath(""));
		var.sendKeys("");
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		
		//ChildBrowser
		
		WebElement var1 = driver.findElement(By.xpath("//input[@name='login']"));
		//p[text()='Username'] //input[contains(@name, 'login')] //input[@type='radio'][1]
		
		Set<String> address = driver.getWindowHandles();
		
		Iterator<String> it = address.iterator();
		
		String s[] = new String[10];
		for(int i=0; i<address.size();i++)
		{
		s[i] = it.next();
		System.out.println();
		}
		
		driver.switchTo().window(s[0]);
		driver.getTitle();
		
		driver.switchTo().window(s[1]);
		driver.getTitle();
		
		Thread.sleep(3000);
		
		//Tables
		List<WebElement> row = driver.findElements(By.xpath(""));
		List<WebElement> col = driver.findElements(By.xpath(""));
		System.out.println(row.size());
		System.out.println(col.size());
		for(int i=0; i<row.size(); i++)
		{
			row.get(i).getText();
		}
		
		//ListsHandling
		
		WebElement var3 = driver.findElement(By.xpath(""));
		
		Select s1 = new Select(var3);
		s1.selectByVisibleText("");
		s1.selectByIndex(0);
		s1.selectByValue("");
		s1.deselectByVisibleText("");
		System.out.println(s1.isMultiple());
		
		List <WebElement> options = s1.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//HandleCutomizeListBox
		
		WebElement var4 = driver.findElement(By.xpath(""));
		Actions a1 = new Actions(driver);
		a1.moveToElement(var4).click().build().perform();		
		for(int i=0; i<4; i++)
		{
			a1.sendKeys(Keys.DOWN);
		}
		
		a1.sendKeys(Keys.ENTER);
		
		//Authorization
		//driver.get("https://the-internet.herokuapp.com/digest_auth\");
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth\\");
		
		//FileUpload
		WebElement var5 = driver.findElement(By.xpath(""));
		var5.sendKeys("File Path");
		WebElement press = driver.findElement(By.xpath(""));
		press.click();
		
		//DragNDrop
		WebElement drag = driver.findElement(By.xpath(""));
		WebElement trash = driver.findElement(By.xpath(""));
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(drag, trash).build().perform();
		Thread.sleep(2000);
		
		//ScreenShot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("Folder Path");
		FileHandler.copy(source, dest);
		
		//Parameterization
		FileInputStream file = new FileInputStream("File Path");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet Name");
		WebElement excel = driver.findElement(By.xpath(""));
		excel.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
//		excel.sendKeys(data.getRow(0).getCell(0).getNumericCellValue());
//		excel.sendKeys(data.getRow(0).getCell(0).getBooleanCellValue());
		
		//GoogleSuggestion
		
		WebElement googleSearch = driver.findElement(By.xpath("//input[@name='q']"));
		googleSearch.sendKeys("Sele");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		for(int i=0; i<list.size(); i++)
		{
			String actualResult = list.get(i).getText();
			String expectedResult = "Selenium Download";
			if(actualResult.equals(expectedResult))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		
	}

}
