package Selenim_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\TestData.xlsx");
		
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value1 = excel.getRow(0).getCell(0).getStringCellValue();
		
		String value2 = excel.getRow(0).getCell(1).getStringCellValue();
		
		String value3 = excel.getRow(0).getCell(2).getStringCellValue();
		
		System.out.print(value1);
		System.out.print(" " +value2);
		System.out.print(" " +value3);
	}

}
