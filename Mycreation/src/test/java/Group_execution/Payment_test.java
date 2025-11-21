package Group_execution;

import org.testng.annotations.Test;

public class Payment_test {
	
	@Test(priority = 1,groups = {"sanity","Regression"})
	public void paymentInRupees()
	{
		System.out.println("Payment in rupees...");
	}
	
	@Test(priority = 2,groups = {"sanity","Regression"})
	public void paymentInDollers()
	{
		System.out.println("Payment in dollers...");
	}
	

}
