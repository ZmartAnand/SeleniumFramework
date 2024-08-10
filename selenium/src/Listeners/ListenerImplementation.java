package Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) { 
		Reporter.log("Test script is failure",true);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./Screenshots/Base.png");
		try {
			FileHandler.copy(temp, des);
			
			}
		catch (IOException e) {
			e.printStackTrace();
			}
		}
		
	}


