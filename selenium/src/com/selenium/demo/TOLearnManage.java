package com.selenium.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class TOLearnManage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
	
		
		driver.get("https://www.demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
       // driver.close();
	}

}
