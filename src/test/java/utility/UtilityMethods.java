package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import test.BaseTest;

public class UtilityMethods {

	
	public static void sendKeysEle(WebElement ele, String value) {
		ele.clear();
		ele.sendKeys(value);
	}
	
	public static void jsClick(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) BaseTest.driver;
		js.executeScript("arguments[0].click();", element);				

	}
}
