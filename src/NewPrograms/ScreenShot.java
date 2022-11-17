package NewPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   System.out.println(source);
	   File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\src\\NewPrograms\\new\\google.jpg");
	   FileHandler.copy(source, dest);
	}

}
