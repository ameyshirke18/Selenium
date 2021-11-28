Feature: Customers
Scenario: Add new Customer
		Given User Launch Chrome browser
		When User opens URL "https://admin-demo.nopcommerce.com/login"
		And User enters Email as "admin@yourstore.com" and Password as "admin"
		And Click on Login
		Then User can View Dashboard
		When User click on customer Menu
		And click on customers Menu Item
		And click on Add new button
		Then User can View Add new customer page
		When User enter customer info
		And click on Save button
		Then User can view confirmation message "The new customer has been added successfully."
		And close browser
		
		

