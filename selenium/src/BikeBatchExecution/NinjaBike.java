package BikeBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NinjaBike {
	@Test(groups= {"smoke","System"})
	public void ZX10R(){
		WebDriver driver = new EdgeDriver();
		driver.get("https://kawasaki-india.com/bikes/ninja-zx-10r/");
		Reporter.log("Ninja Launched Successfyully",true);
		Assert.fail("To Expensive");
		
		
	}

}
