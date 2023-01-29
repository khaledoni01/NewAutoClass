package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import test.BaseTest;

public class LoginPage {

	//Page Factory
	
	@FindBy(xpath = "//input[@id='swpm_user_name']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='swpm_password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@name='swpm-login']")
	public WebElement loginButton;
	

	// Constructor
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	// Actions
	public void login() {
		username.sendKeys("admin");
		password.sendKeys("admin");
		loginButton.click();
		
//		System.out.println(driver.findElement(username).getAttribute("class"));
		
		Assert.assertTrue( BaseTest.driver.getCurrentUrl().equals( BaseTest.baseURL) );		
	}

}
