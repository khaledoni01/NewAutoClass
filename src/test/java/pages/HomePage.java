package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import test.BaseTest;
import utility.UtilityMethods;

public class HomePage {
	
	
	@FindBy(xpath = "//ul[@id='menu-main-menu']/li/a")
	public List<WebElement> menuOptions;
	

	// Constructor
	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	public void selectMenuOption(String expectedValue) {
		
		BaseTest.wait.until(ExpectedConditions.visibilityOf(menuOptions.get(0)));
				
		// looping through the list of menu options
		for(WebElement ele : menuOptions) {
			
			String actualValue = ele.getText();
			
			// checking if the menu option from the app matches our expected option
			if(actualValue.contains(expectedValue)) {
				
//				ele.click();
				
				UtilityMethods.jsClick(ele);
				break;
			}
		}
		
		if(!expectedValue.contains("Contact Us")) {
			String currentUrl = BaseTest.driver.getCurrentUrl().toLowerCase();
			Assert.assertTrue(currentUrl.contains(expectedValue.toLowerCase()) );			
		}
		
	}


}
