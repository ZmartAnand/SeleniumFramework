package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(dependsOnMethods = "Register")
	public void login() {
		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login is succesfull",true);
//		driver.close();
	}
	@Test
	public void Register() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register is  succesfull",true);
		driver.close();

	}
	@Test(dependsOnMethods= {"Register","login"})
	public void addProducts() {
		Reporter.log("Product is added",true);
	}
}


