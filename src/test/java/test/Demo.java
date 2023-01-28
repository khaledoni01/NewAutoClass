package test;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://nktechsolutions.com/membership-login/";
		
		driver.get(baseURL);
		
		By username = By.xpath("//input[@id='swpm_user_name']");
		By password = By.xpath("//input[@id='swpm_password']");
		
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("admin");
		
		Assert.assertTrue( driver.getCurrentUrl().equals(baseURL) );
		
		driver.quit();
	}
	

}
