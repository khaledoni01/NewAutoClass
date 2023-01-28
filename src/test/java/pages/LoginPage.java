package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import test.BaseTest;

public class LoginPage {


	@FindBy(xpath="//input[@id='swpm_user_name']")
	public WebElement username;

	@FindBy(xpath="//input[@id='swpm_password']")
	public WebElement password;
	
	public void testLogin() {
		
		username.sendKeys("admin");
		
		password.sendKeys("admin");
		
		Assert.assertTrue(BaseTest.driver.getCurrentUrl().equals(BaseTest.baseURL));
	}

}
