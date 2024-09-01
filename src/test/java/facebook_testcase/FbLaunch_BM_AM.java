package facebook_testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility_assignment.DDT_assign;
import Utility_assignment.Listeners_FB;

public class FbLaunch_BM_AM extends Listeners_FB
{
	//public static ChromeDriver driver;
	@BeforeMethod 
	public void FbLaunch() throws EncryptedDocumentException, IOException
	{

		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeamazon() throws InterruptedException
	{
		driver.quit();
	}
	
	
}
