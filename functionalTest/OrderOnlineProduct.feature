
Feature: e-Commerse 
Description: This feature will test order the product and update the personal infomation in the application
 

Background: User is Logged In
	Given user is on home page using the url 
	When user click on Sign in link
	And  user sign in with valid "someone@example.com" and "Password123"
	Then user should be logged in the application 

  Scenario: Order T-Shirt in online store and verify in Order History
    When Click the T-Shirt tab 
    And Click Add to cart button for selected t-Shirt
    And Click Proceed to checkout button in Cart popup 
    And Click Proceed to checkout button in Summary tab   
    And Click Proceed to checkout button in Address tab
    And Click Proceed to checkout button in Shipping tab
    And Click on Pay by bank wire link in Payment tab
    And Click confirm my order button in Payment tab
    And Click Back to Order link
    Then verify the Order reference number should be same
   
    
   Scenario: Update Personal Information (First Name) in My Account
	 When Click the view my customer account
	 And Click My Personal Information button
	 And Modify the First Name 
 	 And Click on Save button with valid password
  Then verify the successful message
  