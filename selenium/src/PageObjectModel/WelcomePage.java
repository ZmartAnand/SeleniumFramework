package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
		
	public WelcomePage(WebDriver driver) {
 
		PageFactory.initElements(driver, this);
	}
		
		//Declaration
		@FindBy(linkText = "Register")
		private WebElement registerLink;
		
		//getters
		public WebElement getRegister() {
			return registerLink;
		}
		
		//getters
		public WebElement getRegisterLink() {
			return registerLink;


			
	}
		

}
