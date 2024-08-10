package TestNg;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript  extends BaseClass{
	@Test
	public void clickOnBook() {
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Book page is displayed",true);
	}

}
