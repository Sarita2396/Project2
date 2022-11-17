package Believe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream File = new FileInputStream("File Path");
		Sheet name = WorkbookFactory.create(File).getSheet("Sheet Name");
		//String name1 = name.getRow(0).getCell(0).getStringCellValue();
		WebElement var = driver.findelement(By.xpath(""));
		var.sendKeys(name.getRow(0).getCell(0).getStringCellValue());
		driver.close();
	}

}
