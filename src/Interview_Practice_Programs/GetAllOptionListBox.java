package Interview_Practice_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionListBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement dod = driver.findElement(By.xpath("//select[contains(@name , 'DOB_Day')]"));
		
		Select s = new Select(dod);
		
//		System.out.println(s.isMultiple());
		
		List<WebElement> options = s.getOptions();
		
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
				
		driver.close();
		
	}

}
