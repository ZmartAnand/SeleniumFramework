package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		//step1:create FileInputStream object		
		FileInputStream fis = new FileInputStream("./TestD ata/CommonData.properties");

		//step2:create respective file type object
		Properties prop = new Properties();

		//step3:call read methods
		prop.load(fis);
		String URL = prop.getProperty("Url");
		String EMAIL = prop.getProperty("Email");

		System.out.println(URL);
		System.out.println(EMAIL);


	}

}
