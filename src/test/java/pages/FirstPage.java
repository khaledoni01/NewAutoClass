package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import test.BaseTest;
import utility.UtilityMethods;

public class FirstPage {
	
	@FindBy(xpath = "//select[@id = 'month']")
	public WebElement monthDropDown;
	
	public FirstPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void selectJanMonth() {
		Select monthSelect = new Select(monthDropDown);
		monthSelect.selectByVisibleText("Jan");
	}
	
	
}

