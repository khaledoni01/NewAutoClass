package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTests extends BaseTest {
	
	
	@DataProvider(name="contactFormData")
	public static Object[][] contactTestData() {
	
		return new Object[][] {
			{"john", "doe", "mail@example.com", "test comments"}
//			{"john", "adam", "mail@exam.com", "test"},
		};
	}


	@Test(groups= {"smoke", "regression"}, dataProvider = "contactFormData")
	public void submitContactForm(String firstName, String lastName, String email, String comments) {
		
		HomePage homePage = new HomePage();
		homePage.selectMenuOption("Contact Us");
		
		ContactUsPage contactUsPage = new ContactUsPage();
		contactUsPage.fillOutContactForm(firstName, lastName, email, comments);
	}
}
