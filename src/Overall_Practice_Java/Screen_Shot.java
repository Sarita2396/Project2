package Overall_Practice_Java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Screenshot\\amazon.jpg");
		FileHandler.copy(Source, dest);
		Thread.sleep(2000);
		driver.close();
	}

}
