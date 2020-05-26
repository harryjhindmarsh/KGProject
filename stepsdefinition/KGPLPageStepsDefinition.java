package stepsdefinition;

import cucumber.api.java.en.When;
import pages.KGPLPage;

public class KGPLPageStepsDefinition {

	// Main Content

	@When("^I click View More for more information$")
	public void i_click_View_More_for_more_information() throws Throwable {
		Thread.sleep(2000);
		KGPLPage.viewMoreInfo();	
	}
	
	@When("^I select Small View on PLP$")
	public void i_select_Small_View_on_PLP() throws Throwable {
	    Thread.sleep(2000);
	    KGPLPage.pageViews();
	}

	@When("^I select Large View on PLP$")
	public void i_select_Large_View_on_PLP() throws Throwable {
	    Thread.sleep(2000);
	    KGPLPage.pageViews();
	}

////////////////////////////////////////////////////////////////////////////////////////
	
	// Side Bar Filters
	@When("^I click Reset All Filters$")
	public void i_click_Reset_All_Filters() throws Throwable {
	    Thread.sleep(3000);
	    KGPLPage.resetAllFilters();
	}

	@When("^I filter by size$")
	public void i_filter_by_size() throws Throwable {
	    Thread.sleep(2000);
	    KGPLPage.sideBarFilter();
	}
}
