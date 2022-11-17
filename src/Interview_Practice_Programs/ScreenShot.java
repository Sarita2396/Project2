package Interview_Practice_Programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Screenshot\\google.jpg");
		FileHandler.copy(Source, dest);
		Thread.sleep(2000);
		driver.close();
	}

}
