package tarasa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tarasaLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement local = driver.findElement(By.xpath("//a[@href='/manager/html']"));
		local.click();
		driver.get("http://admin:admin@localhost:8080/manager/html");
		WebElement tarasa = driver.findElement(By.xpath("//a[@href='/Tarasa%20m%2DConnect/']"));
		tarasa.click();
		WebElement loginUsername = driver.findElement(By.xpath("//input[@name='username']"));
		loginUsername.sendKeys("admin");
		Thread.sleep(2000);
		WebElement loginPassword = driver.findElement(By.xpath("//input[@name='password']"));
		loginPassword.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.submit();
		//Admin Dashboard
		Thread.sleep(2000);
		
		WebElement recipientMotherForm = driver.findElement(By.xpath("//a[text()='Recipient Mother Form']"));
		recipientMotherForm.click();
		
		WebElement contactNo = driver.findElement(By.xpath("//input[@name='contact']"));
		contactNo.sendKeys("9876453676");
		
		WebElement motherName = driver.findElement(By.xpath("//input[@name='mname']"));
		motherName.sendKeys("nilima");
		
		WebElement fatherName = driver.findElement(By.xpath("//input[@name='fhname']"));
		fatherName.sendKeys("mahesh");
		
		WebElement surname = driver.findElement(By.xpath("//input[@name='surname']"));
		surname.sendKeys("sane");
		
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		dob.sendKeys("17-07-1993");
		
		WebElement hivStatus = driver.findElement(By.xpath("//select[@name='hiv']"));
		Select s = new Select(hivStatus);
		s.selectByVisibleText("Negative (-ve)");
		
		WebElement vDRLStatus = driver.findElement(By.xpath("//select[@name='vdrl']"));
		Select s1 = new Select(vDRLStatus);
		s1.selectByVisibleText("Negative (-ve)");
		
		WebElement hBSAGStatus = driver.findElement(By.xpath("//select[@name='hbsag']"));
		Select s2 = new Select(hBSAGStatus);
		s2.selectByVisibleText("Negative (-ve)");
		
		WebElement milkAMT = driver.findElement(By.xpath("//input[@name='milk']"));
		milkAMT.sendKeys("150");
		
		WebElement saveDonor = driver.findElement(By.xpath("//button[@name='submit']"));
		saveDonor.submit();
		
		WebElement enterRoyaltyCard = driver.findElement(By.xpath("//input[@name='qrcode'][1]"));
		enterRoyaltyCard.sendKeys("160");
		
		WebElement registerRoyaltyCard = driver.findElement(By.xpath("//button[@class='btn btn-success'][1]"));
		registerRoyaltyCard.submit();
		
		WebElement adminDashboard = driver.findElement(By.xpath("//a[text()='Admin Dashboard']"));
		adminDashboard.click();
		
		List<WebElement> home = driver.findElements(By.xpath("//ul[@class='nav nav-second-level collapse in']//li"));
		
		for(int i=1; i<2; i++)
		{
			home.get(i).click();
		}
		
		
		
//		WebElement storeSummary = driver.findElement(By.xpath("//a[text()='Store Summary']"));
//		storeSummary.submit();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
