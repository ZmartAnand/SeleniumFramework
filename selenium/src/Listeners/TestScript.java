package Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass{
	@Test
	public void login() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login page is not displayed");
		Reporter.log("Login page is displayed",true);

		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Assert.fail();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not displayed");
		Reporter.log("Home page is displayed",true);


	}

}
