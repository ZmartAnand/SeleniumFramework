package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmentxpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login"); 
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("s.anandsiva@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	//	driver.findElement(By.xpath("//button[class='button-1 login-button']")).click();
		
	
	}

}
