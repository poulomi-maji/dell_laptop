package Group_execution;

import java.awt.AWTException;
import java.awt.Robot;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority = 1,groups = {"sanity"})
	public void loginByEmail()
	{
		System.out.println("This is login by email....");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	public void loginByFacebook()
	{
		System.out.println("This is login by Facebook....");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	public void loginByTwitter() throws AWTException
	{
		System.out.println("This is login by Twitter....");
//		Robot bot = new Robot();
//		bot.keyPress(s);
		
	}

}
