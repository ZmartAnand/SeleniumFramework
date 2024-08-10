package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxEbayCloseFp {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/51");
		Thread.sleep(20000);
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.id("compare")).click();
	    Set<String> allWindowIds = driver.getWindowHandles();
		
	    for(String Id:allWindowIds)
		{
			String url = driver.switchTo().window(Id).getCurrentUrl();
			if (!url.contains("shoppersstack")) {
				driver.close();			
			}

		}
		driver.switchTo().window(parentId);
		String title = driver.getTitle();
		System.out.println(title);
	}

	

}
			

