package facebook_source;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_assignment.DDT_assign;


public class Login_Fb extends DDT_assign
{
	
	
	@FindBy(id="email")
	WebElement uname;
	
	@FindBy(name="pass")
	WebElement pword;
	
	@FindBy (name="login")
	WebElement login;
	
	
	
	public void username()
	{
		uname.sendKeys(un);
	}
	public void password()
	{
		pword.sendKeys(pw);
	}
	public void loginbutton()
	{
		login.click();
	}
	
	public Login_Fb(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
}
