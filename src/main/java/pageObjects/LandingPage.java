package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	
	By signIn = By.cssSelector("a[hef*='sign_in']");
	By title = By.cssSelector(".text-center>h2");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getLogin() {
		return driver.findElement(signIn);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}

}
