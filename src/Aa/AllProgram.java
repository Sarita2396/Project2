package Aa;

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

public class AllProgram {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", ":\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Alert
		
		WebElement var = driver.findElement(By.xpath("//input[@type='submit']"));
		var.click();
		WebElement var1 = driver.findElement(By.xpath(""));
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		Thread.sleep(2000);
		
		//Authentication
		
		driver.get("//https:username:pass@the-internet.herokuapp.com/digest_auth");
		
		//ChildBrowserPopup
		
		WebElement var2 = driver.findElement(By.xpath(""));
		var2.click();
		
		Set<String> add = driver.getWindowHandles();
		
		Iterator<String> it = add.iterator();
		
		String s[] = new String[10];
		for(int i=0; i<=10; i++)
		{
			s[i] = it.next();
			System.out.println(add);
		}
		
		driver.switchTo().window(s[0]);
		driver.getTitle();
		
		driver.switchTo().window(s[1]);
		driver.getTitle();
		
		//DragNDrop
		driver.get("");
		
		WebElement iframe = driver.findElement(By.xpath(""));
		driver.switchTo().frame(iframe);
		WebElement d = driver.findElement(By.xpath(""));
		WebElement d1 = driver.findElement(By.xpath(""));
		WebElement trash = driver.findElement(By.xpath(""));
		
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(d, trash).build().perform();
		a2.dragAndDrop(d1, trash).build().perform();
		Thread.sleep(2000);
		
		//CutomizeListBox
		
		WebElement CustomeListItem = driver.findElement(By.xpath(""));
		
		Actions a3 = new Actions(driver);
		a3.moveToElement(CustomeListItem).build().perform();
		for(int i=1; i<4; i++)
		{
			a3.sendKeys(Keys.DOWN).build().perform();
		}
		
		a3.sendKeys(Keys.ENTER).build().perform();
		
		//FileUpload
		
		WebElement upload = driver.findElement(By.xpath(""));
		upload.sendKeys("FilePath");
		
		WebElement press = driver.findElement(By.xpath(""));
		press.click();
		
		//HandlingListBox
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().parentFrame();
		WebElement listBox = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]"));
		
		Select s2 = new Select(listBox);
		s2.selectByVisibleText("Day");
		System.out.println(s2.isMultiple());
		
		List <WebElement> options = s2.getOptions();
		for(int i=0; i<=options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		driver.switchTo().defaultContent();
		WebElement home = driver.findElement(By.xpath(""));
		home.click();
		
		//WebTables
		
		List<WebElement> col = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul//li"));
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		System.out.println(col.size());
		System.out.println(row.size());
		for(int i=0; i<=row.size(); i++)
		{
			System.out.println(row.get(i).getText());
		}
		
		//ScreenShot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("FolderPath");
		FileHandler.copy(source, dest);
		
		//Parameterization
		
		FileInputStream file = new FileInputStream("ExcelFilePath");
		Sheet data = WorkbookFactory.create(file).getSheet("SheetName");
		WebElement getData = driver.findElement(By.xpath(""));
		getData.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		
		
		//GoogleSugg
		
		WebElement search = driver.findElement(By.xpath(""));
		search.sendKeys("Test");
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i).getText());
		}
		
		for(int i=0; i<list1.size(); i++)
		{
			String actualResult = list1.get(i).getText();
			String expectedResult = "Testis";
			
			if(actualResult.equals(expectedResult))
			{
				list1.get(i).click();
				break;
			}
			
			Thread.sleep(2000);
		}
		
		
	}

}
