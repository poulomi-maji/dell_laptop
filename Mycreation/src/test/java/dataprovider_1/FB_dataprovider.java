package dataprovider_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class FB_dataprovider {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider = "dp")
	public void login(String usn, String pwd)
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(usn);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	@DataProvider(name = "dp",indices = {0,4})
	public Object[][] data()
	{
		Object data[][]= {	{"polo0@gmail.com","Admin123"},
							{"polo05@gmail.com","Admin123"},
							{"polo08@gmail.com","Admin173"},
							{"polo09@gmail.com","Admin103"},
							{"polo10@gmail.com","Admin163"},

		};
		return data;
	}

}
