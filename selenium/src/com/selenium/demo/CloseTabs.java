package com.selenium.demo;


import org.openqa.selenium.chrome.ChromeDriver;


public class CloseTabs {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.demowebshop.tricentis.com/");


		driver.close();


	}

}
