package test;

import org.testng.annotations.Test;

import pages.FirstPage;
import pages.SecondPage;

public class SecondTests extends BaseTest {
	
	@Test
	public void handleBrowserAlertTest() {
		
		SecondPage secPage = new SecondPage();
		secPage.clickAlert();
	}
	
	@Test
	public void handleHoverOverDropdown() {
		
		SecondPage secPage = new SecondPage();
		secPage.hoverOverDropdown();
	}
	

}
