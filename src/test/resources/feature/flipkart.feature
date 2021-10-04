Feature: to perform the automation of the flipkart

	Scenario: User is on the google page
	  Given user is on the google page 
	  When User enter the item to search and press enter
	  Then User is navigated to the flipkart
	  
	  
#	 Scenario: User is on the homepage to search and purchase the item
#	  Given User search the product
#	  When User review the product & fetch the product 
#	  And  Add the product to the cart
#	  Then Order is placed 