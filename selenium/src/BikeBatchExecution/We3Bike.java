package BikeBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class We3Bike {
	@Test(groups="smoke")
	public void R15() {
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.yamaha-motor-india.com/yamaha-r15s.html");
	Reporter.log("R15-v3 Launched Successfully",true);
	}

}
