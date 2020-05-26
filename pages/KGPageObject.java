package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class KGPageObject {

	WebDriver driver;
	
	// Constructor
	
	public KGPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Social Media Icons
	
	@FindBy(xpath = "//*[@id=\"footer-container\"]/div[1]/div[1]/div[3]/ul/li[1]")
	WebElement facebookIcon;
	
	@FindBy(xpath = "//*[@id=\"footer-container\"]/div[1]/div[1]/div[3]/ul/li[2]")
	WebElement instagramIcon;
	
	@FindBy(xpath = "//*[@id=\"footer-container\"]/div[1]/div[1]/div[3]/ul/li[3]")
	WebElement twitterIcon;
	
	
	// Accept Cookies
	
	@FindBy(xpath = "//*[@id=\"notice-cookie-block\"]/div/div[2]/button")
	WebElement acceptCookies;
	
	// Pop Up Discount
	
	@FindBy(xpath = "//*[@id=\"popup-wrapper\"]/button")
	WebElement closePopUp;
	
	
	// Redirect to Home Page
	
	@FindBy(xpath = "//*[@id=\"ss17-wrapLinksSearch\"]/ul/li[2]")
	WebElement redirectHomePage;

	
	// Header Elements
	
	@FindBy(how = How.ID, using = "search-icon")
	WebElement searchIconHeader;
	
	@FindBy(xpath = "//*[@id='ss17-wrapLinksSearch']//ul//ul/li[@class='store-locator___1s6R8']")
	WebElement storesLocatorHeader;
	
	@FindBy(xpath = "//*[@datae2eid='headerSignIn']")
	WebElement signInIconHeader;

	@FindBy(xpath = "//*[@data-e2eid='minibagBlock']")
	WebElement miniBagIconHeader; 
	
	
	// Navbar Elements
	
	@FindBy(xpath = "//*[@data-e2eid='categoryNewIn']")
	WebElement newInTab;

	@FindBy(xpath = "//*[@data-e2eid='categoryWomen']")
	WebElement womensTab;

	@FindBy(xpath = "//*[@data-e2eid='categoryBags']")
	WebElement bagsTab;

	@FindBy(xpath = "//*[@data-e2eid='categorySandals']")
	WebElement sandalsTab;

	@FindBy(xpath = "//*[@data-e2eid='categoryTrainers']")
	WebElement trainersTab;

	@FindBy(xpath = "//*[@data-e2eid='categoryMen']")
	WebElement mensTab;

	@FindBy(xpath = "//*[@data-e2eid='categoryKids']")
	WebElement kidsTab;

	@FindBy(xpath = "//*[@data-e2eid='categoryCarvela']")
	WebElement carvelaTab;

	@FindBy(xpath = "//*[@data-e2eid='categoryBrands']")
	WebElement brandsTab;

	@FindBy(xpath = "//*[@data-e2eid='categoryStories']")
	WebElement storiesTab;

	@FindBy(xpath = "//*[@data-e2eid='categorySale']")
	WebElement salesTab;
	
	
	// Sub Navbar Elements
	
	@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[1]/div[2]/div/div/ul/li[2]/a") 
	WebElement subTrainersTab;
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[1]/div[2]/div/div/ul/li[2]/a"), // Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[1]/div[2]/div/div/ul/li[3]/a"), // Bags
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[1]/div[2]/div/div/ul/li[4]/a"), // Sandals
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[1]/div[2]/div/div/ul/li[5]/a"), // Heels
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[1]/div[2]/div/div/ul/li[6]/a"), // Flats
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[1]/div[2]/div/div/ul/li[7]/a"), // NHS Tote Bag
	})
	public List <WebElement> subNewInOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[2]/div[2]/div/div/ul[1]/li[3]/a"), // Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[2]/div[2]/div/div/ul[1]/li[4]/a"), // Flats
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[2]/div[2]/div/div/ul[1]/li[5]/a"), // Sandals
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[2]/div[2]/div/div/ul[1]/li[6]/a"), // Wedges
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[2]/div[2]/div/div/ul[1]/li[7]/a"), // Flats
	})
	public List <WebElement> subWomenOptions;

	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[3]/div[2]/div/div/ul/li[2]/a"), // Kensington
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[3]/div[2]/div/div/ul/li[3]/a"), // Cross Body Bags
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[3]/div[2]/div/div/ul/li[4]/a"), // Shoreditch Bags
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[3]/div[2]/div/div/ul/li[5]/a"), // KG London
	})
	public List <WebElement> subBagsOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[4]/div[2]/div/div/ul/li[2]/a"), // Wedges
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[4]/div[2]/div/div/ul/li[3]/a"), // Flat Sandals
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[4]/div[2]/div/div/ul/li[4]/a"), // Heeled Sandals
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[4]/div[2]/div/div/ul/li[5]/a"), // Espadrilles
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[4]/div[2]/div/div/ul/li[6]/a"), // Sliders
	})
	public List <WebElement> subSandalsOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[5]/div[2]/div/div/ul/li[1]/a"), // White Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[5]/div[2]/div/div/ul/li[2]/a"), // Chunky Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[5]/div[2]/div/div/ul/li[3]/a"), // Embellished Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[5]/div[2]/div/div/ul/li[4]/a"), // Sock Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[5]/div[2]/div/div/ul/li[5]/a"), // Carvela Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[5]/div[2]/div/div/ul/li[6]/a"), // All Women's Trainers
	})
	public List <WebElement> subTrainersOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[6]/div[2]/div/div/ul/li[2]/a"), // Mens Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[6]/div[2]/div/div/ul/li[3]/a"), // Loafers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[6]/div[2]/div/div/ul/li[4]/a"), // Formals
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[6]/div[2]/div/div/ul/li[5]/a"), // Boots
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[6]/div[2]/div/div/ul/li[6]/a"), // Sandals & Sliders
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[6]/div[2]/div/div/ul/li[7]/a"), // Mens New In
	})
	public List <WebElement> subMensOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[7]/div[2]/div/div/ul/li[1]/a"), // All Kids
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[7]/div[2]/div/div/ul/li[2]/a"), // Girls
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[7]/div[2]/div/div/ul/li[3]/a"), // Boys
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[7]/div[2]/div/div/ul/li[4]/a"), // Toddler
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[7]/div[2]/div/div/ul/li[5]/a"), // Girls Trainers
	})
	public List <WebElement> subKidsOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[8]/div[2]/div/div/ul/li[1]/a"), // All Carvela
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[8]/div[2]/div/div/ul/li[2]/a"), // Carvela Comfort
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[8]/div[2]/div/div/ul/li[3]/a"), // Trainers
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[8]/div[2]/div/div/ul/li[4]/a"), // Heels
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[8]/div[2]/div/div/ul/li[5]/a"), // Bags
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[8]/div[2]/div/div/ul/li[6]/a"), // Sandals
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[8]/div[2]/div/div/ul/li[7]/a"), // Flats
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[8]/div[2]/div/div/ul/li[8]/a"), // Boots
	})
	public List <WebElement> subCarvelaOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[1]/li[1]/a"), // KG London
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[1]/li[2]/a"), // KG Kurt Geiger
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[1]/li[3]/a"), // Miss KG
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[1]/li[4]/a"), // Carvela
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[1]/li[5]/a"), // Carvela Comfort
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[1]/li[6]/a"), // UGG
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[2]/li[1]/a"), // Nine West
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[2]/li[2]/a"), // Aldo
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[2]/li[3]/a"), // Steven Madden
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[2]/li[4]/a"), // Michael Kors
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[2]/li[5]/a"), // All Brands
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[9]/div[2]/div/div/ul[2]/li[6]/a"), // Who What Wear
	})
	public List <WebElement> subBrandsOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[10]/div[2]/div/div/ul/li[1]/a"), // We Are One NHS Tote
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[10]/div[2]/div/div/ul/li[2]/a"), // COVID-19 Update
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[10]/div[2]/div/div/ul/li[3]/a"), // We Love NHS
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[10]/div[2]/div/div/ul/li[4]/a"), // Small Acts of Kindness
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[10]/div[2]/div/div/ul/li[5]/a"), // Get Creative 
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[10]/div[2]/div/div/ul/li[6]/a"), // Rainbow Collection
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[10]/div[2]/div/div/ul/li[7]/a"), // Read Our Stories
	})
	public List <WebElement> subStoriesOptions;
	
	
	@FindAll ({
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[11]/div[2]/div/div/ul/li[1]/a"), // Womens Shoes
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[11]/div[2]/div/div/ul/li[2]/a"), // Bags
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[11]/div[2]/div/div/ul/li[3]/a"), // Boots
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[11]/div[2]/div/div/ul/li[4]/a"), // Heels
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[11]/div[2]/div/div/ul/li[5]/a"), // Trainers 
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[11]/div[2]/div/div/ul/li[6]/a"), // Flats
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[11]/div[2]/div/div/ul/li[7]/a"), // Mens
		@FindBy (xpath = "//*[@id=\"top-nav\"]/ul/li[11]/div[2]/div/div/ul/li[8]/a"), // Kids
	})
	public List <WebElement> subSalesOptions;
	
	
	// Main Content Elements
	
	// Main Content Elements
	
	@FindBy(xpath= "//*[text()[contains(.,'SHOP BAGS')]]")
	WebElement shopBagsSection;
	
	@FindBy(xpath= "//*[text()[contains(.,'SHOP SANDALS')]]")
	WebElement shopSandalsSection;
	
	
	
	// Footer Elements
	
	// Footer Elements

	@FindBy(xpath = "//*[@data-e2eid='footerContactUs']")
	WebElement footerContactUs;

	@FindBy(xpath = "//*[@data-e2eid='footerStoreLocator']")
	WebElement footerStoreLocator;

	@FindBy(xpath = "//*[@data-e2eid='footerDelivery&Services']")
	WebElement footerDeliveryServices;

	@FindBy(xpath = "//*[@data-e2eid='footerReturns&Exchanges']")
	WebElement footerReturnsExchanges;

	@FindBy(xpath = "//*[@data-e2eid='footerPayment&Security']")
	WebElement footerPaymentSecurity;

	@FindBy(xpath = "//*[@data-e2eid='footerFaq']")
	WebElement footerFaq;

	@FindBy(xpath = "//*[@data-e2eid='footerTermsAndConditions']")
	WebElement footerTermsAndConditions;

	@FindBy(xpath = "//*[@data-e2eid='footerGiftCards']")
	WebElement footerGiftCards;
	
	@FindBy(xpath = "//*[@data-e2eid='footerAboutUs']")
	WebElement footerAboutUs;

	@FindBy(xpath = "//*[@data-e2eid='footerOurHistory']")
	WebElement footerOurHistory;

	@FindBy(xpath = "//*[@data-e2eid='footerCareers']")
	WebElement footerCareers;

	@FindBy(xpath = "//*[@data-e2eid='footerCookiesAndPrivacyPolicy']")
	WebElement footerCookiesAndPrivacyPolicy;

	@FindBy(xpath = "//*[@data-e2eid='footerModernSlaveryAct']")
	WebElement footerModernSlaveryAct;

	@FindBy(xpath = "//*[@data-e2eid='footerAccessibility']")
	WebElement footerAccessibility;

	@FindBy(xpath = "//*[@data-e2eid='footerGenderPayGapReport']")
	WebElement footerGenderPayGapReport;

	@FindBy(xpath = "//*[@data-e2eid='footerTaxStrategy']")
	WebElement footerTaxStrategy;

	@FindBy(xpath = "//*[@data-e2eid='footerSitemap']")
	WebElement footerSitemap;
		
	
	// NewsLetter Elements
	
	// Newsletter Sign Up
	
	@FindBy(xpath = "//*[@data-e2eid='signUpBox']")
	WebElement enterEmailForNewsletterSignUp;
	
	@FindBy(xpath = "//*[@data-e2eid='signUpButton']")
	WebElement newsLetterSignUpButton;
}


	
	