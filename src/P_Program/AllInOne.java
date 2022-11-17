package P_Program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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

public class AllInOne {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Alert
		WebElement var1 = driver.findElement(By.xpath(""));
		var1.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		
		//ChildBrowser
		WebElement Popup = driver.findElement(By.xpath(""));
		Popup.click();
		Set<String> add = driver.getWindowHandles();
		//Iterator
		Iterator<String> v1 = add.iterator();
		//Array
		
		String a1[] = new String[10];
		for(int i=10; i<add.size(); i++)
		{
			a1[i] = v1.next();
			System.out.println(add);
		}
		
		driver.switchTo().window(a1[0]);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(a1[1]);
		System.out.println(driver.getTitle());
		//driver.quit();
		
		//ActionsClass
		
		WebElement act = driver.findElement(By.xpath(""));
		Actions a2 = new Actions(driver);
		a2.moveToElement(act).click().build().perform();
		for(int i=1; i<4; i++)
		{
			a2.sendKeys(Keys.DOWN);
		}
		
		a2.sendKeys(Keys.ENTER);
		
		//DragNDrop
		WebElement img1 = driver.findElement(By.xpath(""));
		WebElement trash = driver.findElement(By.xpath(""));

		Actions s = new Actions(driver);
		s.dragAndDrop(img1, trash).build().perform();
		
		//authentication
		driver.get("https://the-internet.herokuapp.com/digest_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		//ExcelSheet
		FileInputStream file = new FileInputStream("File name");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet Name");
		WebElement data1 = driver.findElement(By.xpath(""));
		data1.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
//		data1.sendKeys(data.getRow(0).getCell(0).getNumericCellValue());
//		data1.sendKeys(data.getRow(0).getCell(0).getBooleanCellValue());
		
		//ScreenShot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("Folder Path");
		FileHandler.copy(source, dest);
		
		//FileUpload
		WebElement upload = driver.findElement(By.xpath(""));
		upload.sendKeys("File Path");
		WebElement press = driver.findElement(By.xpath(""));
		press.click();
		
		//ListBox
		driver.switchTo().frame("iframResult");
		WebElement listBox = driver.findElement(By.xpath(""));
		Select s1 = new Select(listBox);
		s1.selectByVisibleText("");
		s1.selectByValue("");
		s1.selectByIndex(0);
		s1.deselectByVisibleText("");
		
		System.out.println(s1.isMultiple());
		List <WebElement> options = s1.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//WebTables
		List<WebElement> row = driver.findElements(By.xpath(""));
		List<WebElement> col = driver.findElements(By.xpath(""));
		System.out.println(row.size());
		System.out.println(col.size());
		for(int i=0; i<row.size(); i++)
		{
			System.out.println(row.get(i).getText());
		}

		//GoogleSugg
		WebElement search = driver.findElement(By.xpath(""));
		search.sendKeys("Testi");
		List<WebElement> listEle = driver.findElements(By.xpath(""));
		for(int i=0; i<listEle.size(); i++)
		{
			System.out.println(listEle.get(i).getText());
		}
		
		for(int i=0; i<listEle.size(); i++)
		{
			
			String expectdResult = "TestNG";
			String actualResult = listEle.get(i).getText();
			if(expectdResult.equals(actualResult))
			{
				listEle.get(i).click();
				break;
			}
			
		}
		
		//Frame
		driver.switchTo().frame("");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		

		
	}

}
