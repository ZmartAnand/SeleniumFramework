package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");

		driver.findElement(By.linkText("LOGIN")).click();

		driver.findElement(By.name("email")).sendKeys("admin");

		driver.findElement(By.name("password")).sendKeys("admin"); 

		driver.findElement(By.id("last")).click();

		String sites = driver.getTitle();
		System.out.println(sites);

		if(sites.equals("Skillrary Ecommerce")) 
		{
			System.out.println("It is Displayed");
		}
		else
		{
			System.out.println("It is not Displayed");
		}

	}

}
