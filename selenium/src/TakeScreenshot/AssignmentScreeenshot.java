package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentScreeenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement uni = driver.findElement(By.id("username"));
		uni.clear();
		uni.sendKeys("Anand");

		WebElement unic = driver.findElement(By.id("password"));
		unic.clear();
		unic.sendKeys("Anand");

		WebElement passbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		passbutton.submit();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/image.png");
		FileHandler.copy(temp, dest);
	}


}
