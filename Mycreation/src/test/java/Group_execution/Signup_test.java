package Group_execution;

import org.testng.annotations.Test;

public class Signup_test {
	
	
	@Test(priority = 1,groups = {"Regression"})
	public void signupByEmail()
	{
		System.out.println("This is signup by email...");
	}
	
	@Test(priority = 2,groups = {"Regression"})
	public void signupByFB()
	{
		System.out.println("This is signup by FB...");
	}
	
	@Test(priority = 3,groups = {"Regression"})
	public void signupByTwitter()
	{
		System.out.println("This is signup by Twitter...");
	}

}
