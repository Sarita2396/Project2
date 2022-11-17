package Selenim_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program3 {

	public static void main(String[] args) {

		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement var = driver.findElement(By.xpath("//input[@name='value']"));
		
		WebElement  value = driver.findElement(By.tagName("input"));
		
		WebElement  e = driver.findElement(By.id("1234"));

		WebElement  r = driver.findElement(By.name("sarita"));

		WebElement  q = driver.findElement(By.className("vvh"));

		
		System.out.println(var.getText());
		
		System.out.println(var.isSelected());
		System.out.println(var.isDisplayed());
		System.out.println(var.isEnabled());
		
		//listbox
		
		Select s = new Select(var);
		
		s.selectByVisibleText("sarita");
		s.selectByVisibleText("sayali");
		//s.selectByValue("14");
		//s.selectByIndex("09");
		
		List<WebElement> option = s.getAllSelectedOptions(); 
		
		for(int i =0; i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}
		
		
//		s.selectByVisibleText("car");
//		s.selectByVisibleText("cycle");
		System.out.println(s.isMultiple());
//		s.deselectByVisibleText("car");
		
		WebElement hello = s.getFirstSelectedOption();
		System.out.println(value.getText());

	}

}
