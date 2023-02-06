package test;

import org.testng.annotations.Test;

import pages.FirstPage;

public class FirstTests extends BaseTest {
	
	@Test
	public void selectMonthTest() {
		FirstPage firstPage = new FirstPage();
		firstPage.selectJanMonth();
	}

}
