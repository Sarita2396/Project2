package Believe;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) {

		File source = ((TakesscreenShots(driver)).getScreenAs(OutputType.FILE);
		System.out.println(source);
		file dest = new File("Folder Path");
		FileHandler.copy(source, dest);
	}

}
