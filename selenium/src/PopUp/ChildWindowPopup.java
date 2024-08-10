package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {


		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/products_page/4035");
		driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		switchToWindow(driver,"amazon");
		System.out.println(driver.getTitle());
		driver.close();
		
		switchToWindow(driver,"flipkart");
		driver.close();
	}

	public static void switchToWindow(WebDriver driver,String expUrl) 
	{
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String id:allwindowIds) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains(expUrl)) {
				break;
			}
		}
	
		
	}

}
