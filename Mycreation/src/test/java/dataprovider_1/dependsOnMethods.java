package dataprovider_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods {
	
	@Test(priority = 1)
	public void openApp()
	{
		Assert.assertTrue(true);			//failed
	}
	
	@Test(priority = 2,dependsOnMethods = "openApp")
	public void login()
	{
		Assert.assertTrue(false);			//skipped
	}
	
	@Test(priority = 3,dependsOnMethods = "login")
	public void search()
	{
		Assert.assertTrue(true);			//skipped
	}
	
	@Test(priority = 4,dependsOnMethods = "login")
	public void advSearch()
	{
		Assert.assertTrue(true);			//skipped
	}
	
	@Test(priority = 5,dependsOnMethods = "login")
	public void logOut()					//skipped
	{
		Assert.assertTrue(true);
	}

}
