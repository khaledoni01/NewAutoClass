package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import test.BaseTest;
import utility.UtilityMethods;

public class SecondPage {
	
	@FindBy(xpath = "//input[@value = 'Alert Button']")
	public WebElement alertButton;
	
	@FindBy(xpath = "//button[text() = 'Dropdown']")
	public WebElement hoverableDropdown;

	
	public SecondPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void hoverOverDropdown() {

		Actions act = new Actions(BaseTest.driver);
		act.moveToElement(hoverableDropdown).build().perform();
	}
	
	
	public void clickAlert() {
		// in case you get a sync issue
		BaseTest.wait.until(ExpectedConditions.visibilityOf(alertButton));

		alertButton.click();
		
		// switching browser focus to the alert
		Alert alert = BaseTest.driver.switchTo().alert();
		alert.accept();
	}
	
}

