package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentXYHWDisplay {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");

		Rectangle all = driver.findElement(By.xpath("//input[@type='text']")).getRect();
		System.out.println(all.getHeight());
		System.out.println(all.getWidth());
		System.out.println(all.getX());
		System.out.println(all.getY());

		WebElement de = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(de.isDisplayed());
		System.out.println(de.isEnabled());
	}

}
