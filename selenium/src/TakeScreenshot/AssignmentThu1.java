package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentThu1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.linkText("Vtiger")).click();
		Set<String> window = driver.getWindowHandles();
		for(String id:window)
{
		String url=driver.switchTo().window(id).getCurrentUrl();
		if(url.contentEquals("https://www.vtiger.com/")) {
		driver.findElement(By.id("loginspan")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("kateuy@gmail.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("orteucb");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(20000);
        TakesScreenshot ts=(TakesScreenshot) driver;
        File temp=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("./Screenshots/signin.png");
        FileHandler.copy(temp, dest);
        WebElement error = driver.findElement(By.id("com-form-login-error"));
        String colour = error.getCssValue("color");
        System.out.println(colour);
        
        }}
		for(String id:window) {
			String url=driver.switchTo().window(id).getCurrentUrl();
		if(url.contentEquals("https://demo.vtiger.com/vtigercrm/")) 
		{
			WebElement username = driver.findElement(By.id("username"));
			username.clear();
			username.sendKeys("kjwecgyec");
			WebElement password = driver.findElement(By.id("password"));
			password.clear();
			password.sendKeys("jkbdubv");
			driver.findElement(By.xpath("//button[@class=\"button buttonBlue\"]")).click();
		    WebElement signinerror = driver.findElement(By.id("validationMessage"));
		   System.out.println(signinerror.getText());
		   LocalDateTime systemtime = LocalDateTime.now();
			String time = systemtime.toString().replace(":", "-");
		    File screenshot = driver.findElement(By.id("validationMessage")).getScreenshotAs(OutputType.FILE);
		    File dest=new File("./Screenshots/errormessagevtiger"+time+".png");
			FileHandler.copy(screenshot, dest);
		}
	
}
	}

}