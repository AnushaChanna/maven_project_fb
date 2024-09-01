package Utility_assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_FB implements ITestListener
{
	public static ChromeDriver driver;


	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		ITestListener.super.onTestSuccess(result);
		
		Reporter.log("testcase is pass > report from Listeners_FB ");
		
		TakesScreenshot Ts= driver;
		
		File source = Ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Assignments_FB\\Screenshot\\Pass\\fb"+Math.random()+".png");
		
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		
		ITestListener.super.onTestFailure(result);
		Reporter.log("testcase is fail > report from Listeners_FB");
		
		TakesScreenshot Ts=driver;
		
		File source = Ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Assignments_FB\\Screenshot\\Fail\\fb"+Math.random()+".png");
		
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
