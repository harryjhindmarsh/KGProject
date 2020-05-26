Feature: PLP
  Ensuring all Links work on the Product Listing Page

  Background: 
    Given I am on the Home Page
    When I accept cookies
    When I close pop up menu
    And I select Women in Navbar


#################SIDEBARFILTERS#################

  #@tag1
  #Scenario: Applying Size Filter on PLP
    #When I filter by size
    #Then Test finishes and quits
#
  #@tag1
  #Scenario: Reset all filters
    #When I click Reset All Filters
    #Then Test finishes and quits
#

#################MAINCONTENT#################
    
   @tag1 
	 Scenario: Click view more description
		When I click View More for more information
		Then Test finishes and quits
			
#	 @tag1
   #Scenario Outline: Apply Small or Large view
    #And I select <pageView> on PLP
    #Then Test finishes and quits
#
   #Examples: 
      #| pageView            	 |
      #| Small View		         |
      #| Large View						 |