package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assiment2 {
	// close all tabs
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.shoppersstack.com/products_page/51");
			driver.findElement(By.id("compare")).click();
			Set<String> allWindowIds = driver.getWindowHandles();

			for(String Id:allWindowIds)
			{
				String url = driver.switchTo().window(Id).getCurrentUrl();
				if (url.contains("amazon")) {

				}
				if (url.contains("flipkart")) {
					
				}
				if (url.contains("ebay")) {
					
				}
				driver.close();
			}
		}



		}

