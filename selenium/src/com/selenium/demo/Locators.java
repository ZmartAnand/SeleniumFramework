package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demowebshop.tricentis.com/");
		driver.findElement(By.id("Email")).sendKeys("testing@gmail.com");

	}

}
