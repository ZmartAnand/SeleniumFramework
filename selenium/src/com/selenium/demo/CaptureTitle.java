package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {

		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.demowebshop.tricentis.com/");
			String parentId = driver.getWindowHandle();
			driver.findElement(By.linkText("Facebook")).click();
			Set<String> allWindowIds = driver.getWindowHandles();

			// forLoop
			for(String id:allWindowIds) {
				System.out.println(id); 
				String url = driver.switchTo().window(id).getCurrentUrl();
				if (!url.contains("Facebook")) 
				{
					driver.close();			
				}

			}
			driver.switchTo().window(parentId);
			String title = driver.getTitle();
			System.out.println(title);

	}

}
