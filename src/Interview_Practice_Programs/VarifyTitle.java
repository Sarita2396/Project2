package Interview_Practice_Programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyTitle {


		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			String actual = driver.getTitle();
			String expected = "Rediffmail Free Unlimited Storage";
			
			if(actual.equals(expected))
			
			{	
		         System.out.println("Test Case Pass");	
			}
			
			else
			{
				System.out.println("Test Case Fail");
			}
			
			driver.close();

			
		}

}
