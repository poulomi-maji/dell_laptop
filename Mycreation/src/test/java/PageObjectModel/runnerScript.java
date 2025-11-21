package PageObjectModel;

import org.testng.annotations.Test;

public class runnerScript extends GenericScripts

{
	@Test
	public void runner() {
	Login_pageObjectModel lp = new Login_pageObjectModel(driver);
	lp.getUsn().sendKeys("sdfgh@gmail.com");
	lp.getPwd().sendKeys("admin");
	lp.getLgnBtn().click();
	}
}
