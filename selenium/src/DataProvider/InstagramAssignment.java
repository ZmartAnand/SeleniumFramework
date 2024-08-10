package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InstagramAssignment {
	@DataProvider
	public String[][]dataSender() {
		String[][]data={
							{"8526003666","zmartanand"},
							{"_shilip_shetty023","anandshetty"},
							{"abhis123","abh@123"}
						  };
	return data;
}
	@Test(dataProvider="dataSender")
	public void login(String[] credential) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.name("username")).sendKeys(credential[0]);
		driver.findElement(By.name("password")).sendKeys(credential[1]);
		driver.quit();
		
	}
		

}


