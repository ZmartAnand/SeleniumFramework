package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRegister {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream fis = new FileInputStream("./TestData/selenium.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String FirstName = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String LastName = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String Email = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String Password = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String ConfirmPassword = workbook.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
		driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();		
	}

}
