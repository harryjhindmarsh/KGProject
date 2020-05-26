Feature: HomePage
  Ensuring all Links work on the KG Home Page

  Background: 
    Given I am on the Home Page

#################PRECONDITIONS#################

  #@tag1
  #Scenario: Accept cookies
  #	When I accept cookies
  #	Then Test finishes and quits
  
  #@tag1
  #Scenario: Close Pop Up Menu
  #	When I close pop up menu
  #	Then Test finishes and quits
  

#################HEADER#################

  #@tag1
  #Scenario: Redirect to Home Page
    #	When I close pop up menu
 #		  When I click KG logo I should be redirected to Home Page
      #Then Test finishes and quits
 
  #@tag1
  #Scenario: Validate all  Header options
#	  When I click Stores Locator icon
#	  And I click KG logo I should be redirected to Home Page
#	  When I click on Sign In icon
#	  And I click KG logo I should be redirected to Home Page
#	  When I click on Mini Bag Basket icon
#	  And I click KG logo I should be redirected to Home Page
  #	When I accept cookies
#	  When I click on Search Icon
#	  Then Test finishes and quits


#################NAVBAR#################

  #@tag1
  #Scenario Outline: Validate the Navbar options
    #And I select <headerCategory> in Navbar
    #Then Test finishes and quits

   #Examples: 
      #| headerCategory       	|
      #| New In		            |
      #| Women						 			|
      #| Bags       						|
      #| Sandals		     			  |
      #| Trainers				      |
      #| Men						        |
      #| Kids         	        |
      #| Carvela								|
      #| Brands								|
      #| Stories								|
      #| Sales 								|
      
      
#################SUBNAVBAR#################

#	@tag1
#	Scenario: Validate all Sub Navbar options
#	When I click on Trainers from New In sub options  
#	Then Test finishes and quits
#
      
      
#################MAIN CONTENT#################

  #@tag1
  #Scenario: Navigate to Shop Bags & Sandals sections on Home Page
#	  When I click on Shops Bags Section
#	  When I click KG logo I should be redirected to Home Page
#	  When I click on Shops Sandals Section
#	  Then Test finishes and quits
  #

  
#################FOOTER#################
  
  #@tag1
  #Scenario Outline: Validate the Customer Services options in Footer
    #When I accept cookies
    #When I close pop up menu 
    #And I select <footerCategory> in Customer Services
    #Then Test finishes and quits
#
   #Examples: 
      #| footerCategory           	 |
      #| Contact Us		             |
      #| Stores Locator						 |
      #| Delivery & Services        |
      #| Returns & Exchanges		     |
      #| Payment & Security				 |
      #| FAQ								         |
      #| Terms & Conditions         |
      #| Gift Cards								 |
  #
  #@tag1
  #Scenario Outline: Validate the About Us options in Footer
    #When I accept cookies
    #And I select <footerCategory> in Customer Services
    #Then Test finishes and quits
#
   #Examples: 
      #| footerCategory           	 |
      #| About Us		          	   |
      #| Our History							   |
      #| Careers			               |
      #| Cookies & Privacy			     |
      #| Modern Slavery Act			   |
      #| Accessibility			         |
      #| Gender Pay Gap             |
      #| Tax Strategy					     |
      #| Site Map									 |
  

#################NEWSLETTER SIGN UP#################
  #@tag1
  #Scenario: Validate Newsletter Sign Up
    #When I accept cookies
    #And I enter my email address
    #And I click Sign Up button
    #Then Test finishes and quits


#################NEWSLETTER SIGN UP#################
#	@tag1
#	Scenario Outline: Validate Social Media links in Footer
#	 When I accept cookies
#	 And I click on <socialMedia> in Footer
#	 Then Test finishes and quits
#	
#	Examples: 
#	|	socialMedia					|
#	|	Facebook						|
#	|	Instagram						|
#	|	Twitter							|