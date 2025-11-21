package parallel_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;

import net.bytebuddy.asm.Advice.Return;

public class Parallel {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void openBrowser(String browser){
		switch (browser.toLowerCase()) {
		case "chrome": driver = new ChromeDriver();	
			break;
		case "edge": driver = new EdgeDriver();	
		break;	
		}
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test   //(dataProvider = "dp")
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void verify() {
		driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		System.out.println("==verified==");
		
	}
	
	@Test
	public void logout() {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
//	@DataProvider(name = "dp", indices = {0})
//	public String[][] dp() {
//		
//		String[][] dp= {
//				{"Admin","admin123"},
//				{"xyz","xyz@123"},
//				{"Abc","abc123"}
//		};
//		return dp;
	//}

}
