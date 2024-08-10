package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLernTimeStamp {

	public static void main(String[] args) throws IOException 
	{
        LocalDateTime.now().toString().replace(":", "-");
		
        WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login"); 
		

		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		searchButton.submit();
		File temp  = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/image1.png");
		FileHandler.copy(temp, dest);
		
		
 
	}

}
