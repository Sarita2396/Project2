package P_Program;

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

public class AllInOnee {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//AlertInterface
		
		WebElement var = driver.findElement(By.xpath(""));
		var.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		
		//Autentication
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		//ChildBrowser
		Set<String> address = driver.getWindowHandles();
		Iterator<String> it = address.iterator();
		String s[] = new String[10];
		for(int i=0; i<address.size(); i++)
		{
			s[i] = it.next();
			System.out.println(address);
		}
		
		driver.switchTo().window(s[0]);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(s[1]);
		System.out.println(driver.getCurrentUrl());
		
		//ActionsClass
		
		WebElement b1 = driver.findElement(By.xpath(""));
		Actions a1 = new Actions(driver);
		a1.moveToElement(b1).click().build().perform();
		for(int i=0; i<4; i++)
		{
			a1.sendKeys(Keys.DOWN).build().perform();
		}
		
		a1.sendKeys(Keys.ENTER).build().perform();
		
		//DranNDrop
		WebElement b2 = driver.findElement(By.xpath(""));
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(b2, var).build().perform();
		
		//FileUpload
		WebElement upload = driver.findElement(By.xpath(""));
		upload.sendKeys("FileName");
		WebElement press = driver.findElement(By.xpath(""));
		press.click();
		
		//WebtableHandling
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
		search.sendKeys("Key");
		List<WebElement> l1 = driver.findElements(By.xpath(""));
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i).getText());
		}
		
		for(int i=0; i<l1.size(); i++)
		{
			String expectedResult = "";
			String actualResult = l1.get(i).getText();
			
			if(expectedResult.equals(actualResult))
			{
				l1.get(i).click();
				break;
			}
		}
		
		
		//ScreenShot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File d = new File("Folder Path");
		FileHandler.copy(source, d);
		
		//Parameterization
		FileInputStream file = new FileInputStream("File Path");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet Name");
		WebElement excel = driver.findElement(By.xpath(""));
		excel.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		
		//ListBox
		
		WebElement listBox = driver.findElement(By.xpath(""));
		Select s1 = new Select(listBox);
		s1.selectByVisibleText("");
		s1.deselectByValue("");
		System.out.println(s1.isMultiple());
		
		List <WebElement> options = s1.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//tagname[@attributeName = 'attributeValue']
		//tagname[text() = 'attributeValue']
		//tagname[contains(@attributeName, 'attributeValue')]
		//tagname[@attributeName = 'attributeValue'][index]
		
	}

}
