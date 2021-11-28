package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.formatter.Argument;

public class AddCustomerPage {

	public WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By customersMenu = By.xpath("//a[@href='#']//*[contains(text(),'Customers')]");
	By customersItem = By.xpath("//a[@href='/Admin/Customer/List']");
	By addItem = By.xpath("//a[@href='/Admin/Customer/Create']");
	By email = By.xpath("//input[@id='Email']");
	By pass = By.xpath("//input[@id='Password']");
	By fname = By.xpath("//input[@id='FirstName']");
	By lname = By.xpath("//input[@id='LastName']");
	By genderMale = By.xpath("//input[@value='M']");
	By genderFemale = By.xpath("//input[@value='F']");
	By dob = By.xpath("//input[@id='DateOfBirth']");
	By comp = By.xpath("//input[@id='Company']");
	By tax = By.xpath("//input[@id='IsTaxExempt']");
	By act = By.xpath("//input[@id='Active']");
	By newstest = By.xpath("//li[contains(text(),'Test')]");
	By newsyourstore = By.xpath("//li[contains(text(),'Your store')]");
	By cusrole = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	By roleRegistered = By.xpath("//li[contains(text(),'Registered')]");
	By roleAdmin = By.xpath("//li[contains(text(),'Administrators')]");
	By roleGuest = By.xpath("//li[contains(text(),'Guests')]");
	By roleForum = By.xpath("//li[contains(text(),'Forum')]");
	By roleVendor = By.xpath("//li[contains(text(),'Vendors')]");
	By comment = By.xpath("//textarea[@id='AdminComment']");
	By saveBtn = By.xpath("//button[@name='save']");

	public void clickOnCustomerMenu() {
		driver.findElement(customersMenu).click();
	}

	public void clickOnCustomerItem() {
		driver.findElement(customersItem).click();
	}

	public void clickOnAddnew() {
		driver.findElement(addItem).click();
	}

	public void setEmail(String e) {
		driver.findElement(email).sendKeys(e);
	}

	public void setPassword(String p) {
		driver.findElement(pass).sendKeys(p);
	}

	public void setCustomerRoles(String role) throws InterruptedException {
		if (!role.equals("Vendors")) {
			// driver.findElement(
			// By.xpath("//*[@id='SelectedCustomerRoleIds_taglist']"));
		}
		driver.findElement(cusrole).click();
		WebElement listitem = null;
		Thread.sleep(3000);
		if (role.equals("Administrators")) {
			listitem = driver.findElement(roleAdmin);
		} else if (role.equals("Forum Moderators")) {
			listitem = driver.findElement(roleForum);
		} else if (role.equals("Guests")) {
			listitem = driver.findElement(roleGuest);
		} else if (role.equals("Registered")) {
			listitem = driver.findElement(roleRegistered);
		} else {
			listitem = driver.findElement(roleVendor);
		}
		listitem.click();
	}

	public void setManagerOfVendor(String value) {
		Select drp = new Select(driver.findElement(By.xpath("//*[@id='VendorId']")));
		drp.selectByVisibleText(value);
	}

	public void clickOnActive() {
		driver.findElement(act).click();
	}

	public void setComment(String com) {
		driver.findElement(comment).sendKeys(com);
	}

	public void clickOnSave() {
		driver.findElement(saveBtn).click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void setFname(String fn) {
		driver.findElement(fname).sendKeys(fn);
	}

	public void setLname(String ln) {
		driver.findElement(lname).sendKeys(ln);
	}

	public void setGender(String g) {
		if (g.equals("Male")) {
			driver.findElement(genderMale).click();
			;
		} else {
			driver.findElement(genderFemale).click();
		}
	}

	public void setDob(String d) {
		driver.findElement(dob).sendKeys(d);
	}

	public void setCompanyName(String cname) {
		driver.findElement(comp).sendKeys(cname);
	}

	public void clickOnTax() {
		driver.findElement(tax).click();
	}

	public void setNewsletter(String nl) throws InterruptedException {
		// div[@class='k-multiselect-wrap k-floatwrap']
		driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']")).click();
	WebElement we = driver.findElement(By.name("SelectedNewsletterSubscriptionStoreIds"));
	JavascriptExecutor je=(JavascriptExecutor)driver;
		if(nl.equals("Your store name")) {
			WebElement w1=driver.findElement(By.xpath("//li[contains(text(),'Your store name')]"));
			je.executeScript("arguments[0].click()", w1);
			System.out.println("success your name");
		}
		else
		{
			WebElement w2=driver.findElement(By.xpath("//li[contains(text(),'Test store')]"));
			je.executeScript("arguments[0].click()", w2);
			System.out.println("success test");
		}
	}

	public void setAdminComment(String ac) {
		driver.findElement(comment).sendKeys(ac);
	}
}
