package facebook_testcase;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_assignment.DDT_assign;
import facebook_source.Login_Fb;
@Listeners(Utility_assignment.Listeners_FB.class)
public class Testcase1_Login extends FbLaunch_BM_AM
{
	@Test(retryAnalyzer=Utility_assignment.Retry_fb.class)
	public void facebook() throws EncryptedDocumentException, IOException
	{
	
	DDT_assign d1=new DDT_assign();
	d1.Credentials();
		
	Login_Fb l1=new Login_Fb(driver);
	l1.username();
	l1.password();
	l1.loginbutton();
	
	
}
}