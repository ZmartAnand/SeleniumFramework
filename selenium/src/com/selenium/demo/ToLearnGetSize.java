package com.selenium.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/");
		Dimension size =driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		// set size(dimension)
		driver.manage().window().setSize(new Dimension(1000,1000));

	}

}
