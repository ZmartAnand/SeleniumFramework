package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinktext {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	//	driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.name("Email")).sendKeys("zmartanand@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("testing");
		
		driver.findElement(By.name("")).click();

}

}
