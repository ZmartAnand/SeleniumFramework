package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentColor {

	public static void main(String[] args) {

		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement uni = driver.findElement(By.id("username"));

		uni.clear();

		uni.sendKeys("anand");


		WebElement unic = driver.findElement(By.id("password"));

		unic.clear();

		unic.sendKeys("Anand");

		WebElement passbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		passbutton.submit();

		String errormsg = driver.findElement(By.xpath("//span[@class=' failureMessage']")).getText();
		System.out.println(errormsg);

		String color = driver.findElement(By.xpath("//span[@class=' failureMessage']")).getCssValue("color");
		System.out.println(color);

		if (errormsg.contains("r"))
			System.out.println("Color Is Red");
		else
			System.out.println("Color is not Red");
	}
}


