package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("Anand");
		
		driver.findElement(By.name("LastName")).sendKeys("Siva"); 
		
		driver.findElement(By.name("Email")).sendKeys("anandsiva7897@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("anand123"); 
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("anand123");
		
		driver.findElement(By.id("register-button")).click();


	}

}
