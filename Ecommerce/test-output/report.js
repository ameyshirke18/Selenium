$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Customers",
  "description": "",
  "id": "customers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Add new Customer",
  "description": "",
  "id": "customers;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User can View Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on customer Menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User can View Add new customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 29770030763,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "duration": 3951436870,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 1539626252,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "duration": 35554888830,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_View_Dashboard()"
});
formatter.result({
  "duration": 207853778,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_customer_Menu()"
});
formatter.result({
  "duration": 158784928,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_customers_Menu_Item()"
});
formatter.result({
  "duration": 4475132472,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "duration": 6014040732,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_View_Add_new_customer_page()"
});
formatter.result({
  "duration": 17478136,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enter_customer_info()"
});
formatter.result({
  "duration": 14929844860,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Save_button()"
});
formatter.result({
  "duration": 9349090124,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 36
    }
  ],
  "location": "Steps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "duration": 657117078,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 1036734224,
  "status": "passed"
});
});