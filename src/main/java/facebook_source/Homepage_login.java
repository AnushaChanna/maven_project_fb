package facebook_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_assignment.DDT_assign;

public class Homepage_login extends DDT_assign
{
	ChromeDriver driver;
	@FindBy (xpath="//input[@dir='ltr']")
	WebElement Searchelement;
	
	public void search_Friend()
	{
		Searchelement.sendKeys("Angel anu" + Keys.ENTER);
	}
	
	
	public Homepage_login(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
