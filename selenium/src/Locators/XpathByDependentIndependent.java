package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependentIndependent {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login"); 
		

	}

	
}
