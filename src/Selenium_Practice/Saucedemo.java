package Selenium_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Saucedemo {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement userNameTextbox = driver.findElement(By.xpath("//input[@name='user-name']"));
		WebElement passTextbox = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='login-button']"));
        
		FileInputStream File = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\Saucedemo_Data.xlsx");
		
		Sheet excel = WorkbookFactory.create(File).getSheet("Sheet1");
		
		userNameTextbox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		passTextbox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		loginBtn.click();
		
		
		WebElement sortDropDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s = new Select(sortDropDown);
		s.selectByVisibleText("Price (low to high)");
		Thread.sleep(2000);
		
		WebElement addToCartBtn = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']"));
		addToCartBtn.click();
		Thread.sleep(2000);
		
		
		WebElement myCartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		myCartLink.click();
		Thread.sleep(2000);
		
		WebElement removeBtn = driver.findElement(By.xpath("//button[@name='remove-sauce-labs-onesie']"));
		removeBtn.click();
		Thread.sleep(2000);
		
		WebElement ContinueShopBtn = driver.findElement(By.xpath("//button[@name='continue-shopping']"));
		ContinueShopBtn.click();
		Thread.sleep(2000);
		
		WebElement sortDropDown1 = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select t = new Select(sortDropDown1);
		t.selectByVisibleText("Price (low to high)");
		
		WebElement addToCartBtn1 = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']"));
		addToCartBtn1.click();
		Thread.sleep(2000);
		
		WebElement myCartLink1 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		myCartLink1.click();
		Thread.sleep(2000);
		
		WebElement checkout_Btn = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
		checkout_Btn.click();
		Thread.sleep(2000);
		
		WebElement firstNameTextbox = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstNameTextbox.sendKeys("sarita");
		WebElement lastNameTextbox = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastNameTextbox.sendKeys("machutre");
		WebElement PostalCodeTextBox = driver.findElement(By.xpath("//input[@name='postalCode']"));
		PostalCodeTextBox.sendKeys("411038");
		WebElement continueBtn = driver.findElement(By.xpath("//input[@name='continue']"));
		
		WebElement bmBurgerBtn = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		bmBurgerBtn.click();
		Thread.sleep(5000);
		
		WebElement logoutBtn = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logoutBtn.click();
		Thread.sleep(5000);
		
		
     	WebElement newUserNameTextbox = driver.findElement(By.xpath("//input[@name='user-name']"));
     	newUserNameTextbox.sendKeys("locked_out_user");
		WebElement newPassTextbox = driver.findElement(By.xpath("//input[@name='password']"));
		newPassTextbox.sendKeys("secret_sauce");
		WebElement newLoginBtn = driver.findElement(By.xpath("//input[@name='login-button']"));
		newLoginBtn.click();
		WebElement errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		System.out.println(errormsg.getText());
		Thread.sleep(2000);
		

		driver.close();

	}

}
