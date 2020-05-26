package pages;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // Define which class to Run
@CucumberOptions( // Cucumber Options are just settings for our Test

		features = "src/feature", // looks for Feature file in the Feature folder I created
		glue = { "stepsdefinition" } // looks for Steps Definition file in the Steps Definition folder I created

)

public class KGPLPage {
	
	private static KGPLPageObject KGPLPageObject;
		
	// Main Content
	@Test
	public static void viewMoreInfo() {
		String expectedText = KGPLPageObject.viewMoreInfo.getText();

		if (expectedText.contains("View more")) { 
			    System.out.println("Element is visible");
			} else {
			    System.out.println("Element is NOT visible");
			}
			
//		KGPLPageObject.viewMoreInfo.click();
	}
	
	public static void pageViews() {
		
		String pageView = "Small View";
		
		if (pageView == "Small View") {
			KGPLPageObject.smallView.click();
		} else if (pageView == "Large View") {
			KGPLPageObject.largeView.click();
		} else {
			System.out.println("Couldn't find the view you were looking for.");
		}
		
	}

	// Side Bar Filters
	@Test 
	public static void resetAllFilters() {

	String expectedText = KGPLPageObject.resetAllFilters.getText();

	if (expectedText.contains("Reset all filters")) { 
		    System.out.println("Element is there");
		} else {
		    System.out.println("Element is NOT there");
		}
		
		KGPLPageObject.resetAllFilters.click();
	}
	
	@Test
	public static void sideBarFilter() {
		KGPLPageObject.sizeFilter.click();	
	}

}
