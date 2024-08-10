package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAssignment {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://flipkart.com/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());

		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println(allImages.size());

		List<WebElement> allbutton = driver.findElements(By.tagName("button"));
		System.out.println(allbutton.size());


	}

}
