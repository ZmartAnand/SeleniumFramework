package com.selenium.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.demowebshop.tricentis.com/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);



	}

}
