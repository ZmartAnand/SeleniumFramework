package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillary {
	
	public Skillary(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(id = "navbar-search-input")
	private WebElement searchtextfiled;

	public WebElement getSearchtextfiled() {
		return searchtextfiled;
	}
	

}
