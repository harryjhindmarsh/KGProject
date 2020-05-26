package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.KGHomePage;

public class HomePageStepsDefinition {
	
	// Preconditions
	
	@Given("^I am on the Home Page$")
	public void i_am_on_the_Home_Page() {		
		KGHomePage.openTest();		
	}
	
	@Then("^Test finishes and quits$")
	public void test_finishes_and_quits() throws Exception {		
	    Thread.sleep(3000);
		KGHomePage.closeTest();	    
	}
	
	@When("^I accept cookies$")
	public void i_accept_cookies() throws Throwable {
		Thread.sleep(2000);
	    KGHomePage.acceptCookies();	    
	}
	
	@When("^I close pop up menu$")
	public void i_close_pop_up_menu() throws Throwable {
	    Thread.sleep(2000);
	    KGHomePage.closePopUp();
	}

	
////////////////////////////////////////////////////////////////////////////////////////

	// Header Elements
	
	@When("^I click KG logo I should be redirected to Home Page$")
	public void i_click_KG_logo_I_should_be_redirected_to_Home_Page() throws Throwable { 
		Thread.sleep(2000);
		KGHomePage.redirectHomePage();
	}
	
	@When("^I click Stores Locator icon$")
	public void i_click_Stores_Locator_icon() throws Throwable {
		Thread.sleep(3000);
		KGHomePage.storesLocatorHeader();	
	}

	@When("^I click on Search Icon$")
	public void i_click_on_Search_Icon() throws Throwable {
	    Thread.sleep(3000);
	    KGHomePage.searchIconHeader();
	}


	// Main Content Elements
	
	@When("^I click on Sign In icon$")
	public void i_click_on_Sign_In_icon() throws Throwable {
		Thread.sleep(3000);
		KGHomePage.signInIconHeader();
	}
	
	@When("^I click on Mini Bag Basket icon$")
	public void i_click_on_Mini_Bag_Basket_icon() throws Throwable {
	    Thread.sleep(3000);
		KGHomePage.miniBagIconHeader();
	}

////////////////////////////////////////////////////////////////////////////////////////

	// Navbar Elements	
	
	@And("^I select New In in Navbar$")
	public void i_select_New_In_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Women in Navbar$")
	public void i_select_Women_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Bags in Navbar$")
	public void i_select_Bags_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Sandals in Navbar$")
	public void i_select_Sandals_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Trainers in Navbar$")
	public void i_select_Trainers_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Men in Navbar$")
	public void i_select_Men_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Kids in Navbar$")
	public void i_select_Kids_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Carvela in Navbar$")
	public void i_select_Carvela_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Brands in Navbar$")
	public void i_select_Brands_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Stories in Navbar$")
	public void i_select_Stories_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}

	@And("^I select Sales in Navbar$")
	public void i_select_Sales_in_Navbar() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.headerCategory();
	}
	
////////////////////////////////////////////////////////////////////////////////////////

//	// Sub Navbar Elements - New In
//
//	@When("^I click on Trainers from New In sub options$")
//	public void i_click_on_Trainers_from_New_In_sub_options() throws Throwable {
//		Thread.sleep(2000);
//		KGHomePage.subTrainersTab();
//	}
//	
////////////////////////////////////////////////////////////////////////////////////////

	// Main Sections
	
	@When("^I click on Shops Bags Section$")
	public void i_click_on_Shops_Bags_Section() throws Throwable {    
		Thread.sleep(2000);
		KGHomePage.shopBagsSection();
	}
	
	@When("^I click on Shops Sandals Section$")
	public void i_click_on_Shops_Sandals_Section() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.shopSandalsSection();
	}

////////////////////////////////////////////////////////////////////////////////////////
	
	// Footer Elements
	
	@And("^I select Contact Us in Customer Services$")
	public void i_select_Contact_Us_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}
	 
	@And("^I select Stores Locator in Customer Services$")
	public void i_select_Stores_Locator_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();

	}

	@And("^I select Delivery & Services in Customer Services$")
	public void i_select_Delivery_Services_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@And("^I select Returns & Exchanges in Customer Services$")
	public void i_select_Returns_Exchanges_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@And("^I select Payment & Security in Customer Services$")
	public void i_select_Payment_Security_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@And("^I select FAQ in Customer Services$")
	public void i_select_FAQ_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@Given("^I select Terms & Conditions in Customer Services$")
	public void i_select_Terms_Conditions_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@And("^I select Gift Cards in Customer Services$")
	public void i_select_Gift_Cards_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}
	
	@When("^I select About Us in Customer Services$")
	public void i_select_About_Us_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@When("^I select Our History in Customer Services$")
	public void i_select_Our_History_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@When("^I select Careers in Customer Services$")
	public void i_select_Careers_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@When("^I select Cookies & Privacy in Customer Services$")
	public void i_select_Cookies_Privacy_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@When("^I select Modern Slavery Act in Customer Services$")
	public void i_select_Modern_Slavery_Act_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@When("^I select Accessibility in Customer Services$")
	public void i_select_Accessibility_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@When("^I select Gender Pay Gap in Customer Services$")
	public void i_select_Gender_Pay_Gap_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@When("^I select Tax Strategy in Customer Services$")
	public void i_select_Tax_Strategy_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

	@When("^I select Site Map in Customer Services$")
	public void i_select_Site_Map_in_Customer_Services() throws Throwable {
		Thread.sleep(2000);
		KGHomePage.footerCategory();
	}

////////////////////////////////////////////////////////////////////////////////////////

	// Newletter Sign Up
	@When("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
	    Thread.sleep(2000);
	    KGHomePage.enterEmailForNewsletterSignUp();
	}

	@When("^I click Sign Up button$")
	public void i_click_Sign_Up_button() throws Throwable {
	    Thread.sleep(2000);
	    KGHomePage.newsLetterSignUpButton();
	}

////////////////////////////////////////////////////////////////////////////////////////
	
	// Social Media
	
	@When("^I click on Facebook in Footer$")
	public void i_click_on_Facdbook_in_Footer() throws Throwable {
	    Thread.sleep(2000);
	    KGHomePage.socialMedia();
	}

	@When("^I click on Instagram in Footer$")
	public void i_click_on_Instagram_in_Footer() throws Throwable {
	    Thread.sleep(2000);
	    KGHomePage.socialMedia();
	}

	@When("^I click on Twitter in Footer$")
	public void i_click_on_Twitter_in_Footer() throws Throwable {
	    Thread.sleep(2000);
	    KGHomePage.socialMedia();
	}


	
}
