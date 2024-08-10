package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Audi {
	@Test(groups={"smoke","system"})
	public void LaunchAudi() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.audi.in/in/web/en.html");
		Reporter.log("Audi Launched Succesfully");
	}

}
