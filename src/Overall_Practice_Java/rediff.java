package Overall_Practice_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement fullName = driver.findElement(By.xpath("//input[@maxlength='61']"));
		fullName.sendKeys("Sarita Machutre");
		WebElement email = driver.findElement(By.xpath("//input[contains(@name, 'login')]"));
		email.sendKeys("Saru2316");
		WebElement checkBtn = driver.findElement(By.xpath("//input[contains(@name, 'btn')]"));
		checkBtn.click();
		WebElement pass = driver.findElement(By.xpath("//input[contains(@name, 'passwd')]"));
		pass.sendKeys("Sarita@123");
		WebElement repass = driver.findElement(By.xpath("//input[contains(@name, 'confirm')]"));
		repass.sendKeys("Sarita@123");
		WebElement alterEmail = driver.findElement(By.xpath("//input[contains(@maxlength, '100')]"));
		alterEmail.sendKeys("Sau1493@gmail.com");
		WebElement mob = driver.findElement(By.xpath("//input[contains(@name, 'mob')]"));
		mob.sendKeys("9876564556");
		WebElement daySelect = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]"));
		Select a = new Select(daySelect);
		a.selectByVisibleText("16");
		
		WebElement monthSelect = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
		Select b = new Select(monthSelect);
		b.selectByVisibleText("JUL");

		WebElement yearSelect = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]"));
		Select c = new Select(yearSelect);
		c.selectByVisibleText("1996");

		WebElement gender = driver.findElement(By.xpath("//input[contains(@name, 'gender')][2]"));
		gender.click();
		
		WebElement countrySelect = driver.findElement(By.xpath("//select[contains(@name, 'country')]"));
		Select d = new Select(countrySelect);
		d.selectByVisibleText("India");

		WebElement citySelect = driver.findElement(By.xpath("//select[contains(@name, 'city')]"));
		Select e = new Select(citySelect);
		e.selectByVisibleText("Pune");
		
		WebElement captcha = driver.findElement(By.xpath("//input[contains(@class, 'captcha')]"));
		captcha.sendKeys("We cannot automate captcha");

		WebElement createAccount = driver.findElement(By.xpath("//input[contains(@name, 'Register')]"));
		createAccount.click();
		Thread.sleep(5000);
		driver.close();
	}

}
