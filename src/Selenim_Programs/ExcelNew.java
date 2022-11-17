package Selenim_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelNew {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file1 = new FileInputStream("\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\NewFile.xlsx"); 
	
		Sheet finalsheet = WorkbookFactory.create(file1).getSheet("Sheet1");
		
//		for(int row=0;row<=finalsheet.getLastRowNum(); row++)
//		{
//			for(int col=0;col<finalsheet.getRow(row).getLastCellNum();col++)
//			{
//				String values = finalsheet.getRow(row).getCell(col).getStringCellValue();
//				System.out.print(values +" ");
//			}
//			
//			System.out.println();
//	  }
		
		for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				String values = finalsheet.getRow(row).getCell(col).getStringCellValue();
				System.out.print(values +"|");
			}
			
			System.out.println();
			System.out.println("----------------------");
		}
	}

}




