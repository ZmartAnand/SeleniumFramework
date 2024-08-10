package Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver; 
	@BeforeClass
	public void launch(){
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}
    @BeforeMethod
     public void login() {
    	driver.findElement(By.linkText("Log in")).click();
    }
	@AfterMethod
	public void logout() {
		
	}
    @AfterClass
    public void close() {
    	driver.quit();
    }
		
		
	
	
	

}
