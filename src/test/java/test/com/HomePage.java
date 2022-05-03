package test.com;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	
	@BeforeTest
	public void setup() throws IOException {
		driver = initializeDriver();
		driver.get("https://qaclickacademy.com");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String userName, String password) throws IOException {
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage login = new LoginPage(driver);
		login.getEmail().sendKeys(userName);
		login.getPassword().sendKeys(password);
		login.getSubmitBtn().click();
		
	}
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][1];
		
		data[0][0]="eswar@gmail.com";
		data[0][1]="eswarcom";
		
		data[1][0]="eswararao@gmail.com";
		data[1][1]="eswararao";
		
		return data;
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
