package com.selenium.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitTabs {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/6");

		driver.findElement(By.id("compare")).click();
	//	driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
