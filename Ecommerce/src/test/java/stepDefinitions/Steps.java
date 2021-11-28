package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class Steps extends Base{
	
	

	@Given("^User Launch Chrome browser$")
    public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	   lp=new LoginPage(driver);
	}

    @When("^User opens URL \"([^\"]*)\"$")
   public void user_opens_url(String url) {
	   driver.get(url);
	   driver.manage().window().maximize();
	}

    @And("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enters_email_as_and_password_as(String email, String pass) {
	   lp.setUserName(email);
	   lp.setPassword(pass);
	}
    
    @And("^Click on Login$")
    public void click_on_login() {
	    lp.clickLogin();
	}

    @Then("^Page Title should be \"([^\"]*)\"$")
   public void page_title_should_be(String title) {
	    if(driver.getPageSource().contains("Login was unsuccessful.")) {
	    	driver.close();
	    }
	    else {
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	    
	}

    
    
    @When("^User click on Log out link$")
    public void user_click_on_log_out_link() {
 	    lp.clickLogout();
 	}

    @And("^close browser$")
   public void close_browser() {
	    driver.quit();
	}

	
	//Customer feature 
	
    
    @Then("^User can View Dashboard$")
    public void user_can_View_Dashboard() throws Throwable {
    	addCust = new AddCustomerPage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
    }

    @When("^User click on customer Menu$")
    public void user_click_on_customer_Menu() throws Throwable {
       addCust.clickOnCustomerMenu();
    }

    @When("^click on customers Menu Item$")
    public void click_on_customers_Menu_Item() throws Throwable {
       addCust.clickOnCustomerItem();
    }

    @When("^click on Add new button$")
    public void click_on_Add_new_button() throws Throwable {
        addCust.clickOnAddnew();
        Thread.sleep(2000);
    }

    @Then("^User can View Add new customer page$")
    public void user_can_View_Add_new_customer_page() throws Throwable {
    	Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
    }

    @When("^User enter customer info$")
    public void user_enter_customer_info() throws Throwable {
        String email=randomestring()+"@gmail.com";
        addCust.setEmail(email);
        Thread.sleep(1000);
        addCust.setPassword("test1234");
        Thread.sleep(1000);
        addCust.setFname("Amey");
        Thread.sleep(1000);
        addCust.setLname("Shirke");
        Thread.sleep(1000);
        addCust.setGender("Male");
        Thread.sleep(1000);
        addCust.setDob("05/16/1996");
        Thread.sleep(1000);
        addCust.setCompanyName("TCS");
        Thread.sleep(1000);
        addCust.clickOnTax();
        Thread.sleep(1000);
        addCust.setNewsletter("Test store 2");
        Thread.sleep(1000);
        //addCust.setCustomerRoles("Vendors");
        Thread.sleep(1000);
      //  addCust.setManagerOfVendor("Vendor 2");
        Thread.sleep(1000);
        addCust.clickOnActive();
        Thread.sleep(1000);
        addCust.setAdminComment("This is for testing");
    }

    @When("^click on Save button$")
    public void click_on_Save_button() throws Throwable {
    	Thread.sleep(2000);
        addCust.clickOnSave();
        Thread.sleep(2000);
    }

    @Then("^User can view confirmation message \"([^\"]*)\"$")
    public void user_can_view_confirmation_message(String msg) throws Throwable {
       Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
    }
	
}
