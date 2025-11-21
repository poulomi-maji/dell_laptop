package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pageObjectModel 
{
	@FindBy(id = "email")
	private WebElement usn;
	
	@FindBy(id = "pass")
	private WebElement pwd;
	
	@FindBy(name = "login")
	private WebElement lgnBtn;
	
	public Login_pageObjectModel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getUsn() 
	{
		return usn;
	}

	public WebElement getPwd() 
	{
		return pwd;
	}

	public WebElement getLgnBtn() 
	{
		return lgnBtn;
	}
	
	

}
