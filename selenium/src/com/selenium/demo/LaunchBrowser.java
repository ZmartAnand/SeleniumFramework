package com.selenium.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		String title = driver.getTitle();
		System.out.println(title);

		if(title.equals("Instagram")) 
		{
			System.out.println("user logged in to successfully");
		}
		else {
			System.out.println("user failed to navigate");
		}

	}
}
