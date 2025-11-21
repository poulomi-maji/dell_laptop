package dataprovider_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase_dataprovider {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void browser(String br)
	{
		switch(br)
		{
		case "chrome": driver = new ChromeDriver();
		break;
		case "edge": driver = new EdgeDriver();
		break;
		case "firefox" : driver = new FirefoxDriver();
		break;
		default: System.out.println("Invalid browser");
		return;
		}
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider = "dp")
	public void login(String email, String password)
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
	}
	
	@AfterClass
	public void logout() 
	{
		driver.quit();
	}
	
	@DataProvider(name = "dp", indices = {0})//indices means to run that specific row
	public Object[][] logindata()
	{
		Object data[][]={ 
					{"polo005@gmail.com","polo007"},  //0
					{"rahs013@gmail.com","Rs013"},    //1
					{"Ari008@gmail.com","ari024"},    //2
					{"dfg005@gmail.com","02hhb"},     //3
					{"polsdf@gmail.com","polovbn007"},//4
						};
		return data;
		
		//always return 2 dimensional array or object...
	}
	
	
	
	
	
	
	

}
