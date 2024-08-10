package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//step1:create respective file type object
		FileInputStream fis = new FileInputStream("./TestData/selenium.xlsx");
		
		//step2:create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step3:call read methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String name = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String pwd = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		System.out.println(name);
		System.out.println(pwd);
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);
	}

}
