package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import bsh.util.Util;
import test.BaseTest;
import utility.UtilityMethods;

public class ContactUsPage {
	
	@FindBy(xpath = "//input[@placeholder='First']")
	public WebElement fName;
	
	@FindBy(xpath = "//input[@placeholder='Last']")
	public WebElement lName;
	
	@FindBy(xpath = "//input[@placeholder='example@mail.com']")
	public WebElement emailEle;

	@FindBy(xpath = "//textarea[@placeholder='Write here...']")
	public WebElement commentsEle;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitBtn;
	
	@FindBy(xpath="//p[contains(text(), 'Thanks for contacting us')]")
	public WebElement contactUsSubmitted;

	public ContactUsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void fillOutContactForm(String firstName, String lastName, String email, String comments) {
				
		BaseTest.wait.until(ExpectedConditions.visibilityOf(fName));
		
		UtilityMethods.sendKeysEle(fName, firstName);
		UtilityMethods.sendKeysEle(lName, lastName);
		UtilityMethods.sendKeysEle(emailEle, email);
		UtilityMethods.sendKeysEle(commentsEle, comments);
		
		submitBtn.click();

		BaseTest.wait.until(ExpectedConditions.visibilityOf(contactUsSubmitted));
		Assert.assertTrue(contactUsSubmitted.getText().contains("Thanks for contacting us"), "expected value is not right");
						
	}
	
	
}

