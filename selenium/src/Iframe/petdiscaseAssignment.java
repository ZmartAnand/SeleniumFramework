package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class petdiscaseAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("montana")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.findElement(By.id("user")).sendKeys("testing@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass@123");
		driver.findElement(By.id("cpass")).sendKeys("pass@123");
		driver.findElement(By.id("firstName")).sendKeys("Anand");
		driver.findElement(By.id("lastName")).sendKeys("siva");
		driver.findElement(By.id("phone")).sendKeys("9876543212");
		
		WebElement dropdown = driver.findElement(By.id("user-type"));
		Select dropDownUsertype = new Select(dropdown);
		
//		dropDownUsertype.selectByIndex(2);
//		dropDownUsertype.selectByValue("3");
		dropDownUsertype.selectByVisibleText("Academic");
		
		driver.findElement(By.id("accept-tou")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		

	}

}
