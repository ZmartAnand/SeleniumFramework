package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/ASUS/Desktop/table.html"); 
		String COLLECTION=driver.findElement(By.xpath("//td[contains(text(),'SALAR')]/following-sibling::td[1]")).getText();
		System.out.println(COLLECTION);
	}

}
