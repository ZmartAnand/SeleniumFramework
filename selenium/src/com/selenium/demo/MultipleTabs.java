package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		
		// forLoop
				for(String id:allWindowIds) {
				String url = driver.switchTo().window(id).getCurrentUrl();
				if(url.contains(url)) {
					break;
				}
				}
		}

}
