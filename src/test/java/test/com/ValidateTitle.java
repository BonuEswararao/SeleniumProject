package test.com;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateTitle extends Base{
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String userName, String password) throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		
		Assert.assertEquals(l.getTitle().getText(), "Featured Courses");
//		l.getLogin().click();
//		LoginPage login = new LoginPage(driver);
//		login.getEmail().sendKeys(userName);
//		login.getPassword().sendKeys(password);
//		login.getSubmitBtn().click();
		
	}
	

}
