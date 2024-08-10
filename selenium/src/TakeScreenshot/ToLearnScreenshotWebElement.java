package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnScreenshotWebElement {

	public static void main(String[] args) throws IOException {
		
        WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/"); 
		
	//	TakesScreenshot ts=(TakesScreenshot) driver;
		File temp  = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/image.png");
		FileHandler.copy(temp, dest);
		

	}

}
