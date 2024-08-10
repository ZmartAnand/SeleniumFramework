package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetching {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream fis = new FileInputStream("./TestData/selenium.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);

		//number
		double price = workbook.getSheet("Sheet1").getRow(1).getCell(6).getNumericCellValue();
		System.out.println(price);

		//boolean
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(7).getBooleanCellValue();
		System.out.println(status);

		//date
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(8).getLocalDateTimeCellValue();
		System.out.println(date);

	}

}
