package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class Base {
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addCust;
	
	
	public static String randomestring () {
		String generateString = RandomStringUtils.randomAlphabetic(5);
		return generateString;
	}

}
