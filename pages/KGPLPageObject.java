package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KGPLPageObject {
	
	// View More Info Element
	
	@FindBy (xpath = "//*[@id=\"plp-title\"]//div/button")
	WebElement viewMoreInfo;
	
	
	// Page Views
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[1]/button[1]")
	WebElement largeView;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[1]/button[2]")
	WebElement smallView;
	
	
	// Side Bar Elements
	
	@FindBy (xpath = "//*[@data-e2eid='resetAllFilters']")
	WebElement resetAllFilters;
	
	@FindBy (xpath = "//*/div[1]/div/ol/li[1]/button")
	WebElement sizeFilter;
	
	@FindBy (xpath = "//*/div[2]/div/ol/li[1]/button")
	WebElement categoriesFilter;
	
	@FindBy (xpath = "//*/div[3]/div/ol/li[1]/button")
	WebElement colourFilter;
	
	@FindBy (xpath = "//*/div[4]/div/ol/li[1]/button")
	WebElement brandFilter;
	
	@FindBy (xpath = "//*/div[5]/div/ol/li[1]/button")
	WebElement priceFilter;
	
	
	// Pagination
	
	@FindBy (xpath = "//*[@data-e2eid='nextButton']")
	WebElement nextButton;
	
}
