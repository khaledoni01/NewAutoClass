package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import test.BaseTest;
import utility.UtilityMethods;

public class LoginPage {
	
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
	public void login(String uname, String pword) {
		
		BaseTest.wait.until(ExpectedConditions.visibilityOf(username));
		
		UtilityMethods.sendKeysEle(username, uname);
		UtilityMethods.sendKeysEle(password, pword);
		
		loginButton.click();
		
	}
}

