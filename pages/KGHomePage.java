package pages;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // Define which class to Run
@CucumberOptions( // Cucumber Options are just settings for our Test

		features = "src/feature", // looks for Feature file in the Feature folder I created
		glue = { "stepsdefinition" } // looks for Steps Definition file in the Steps Definition folder I created

)

public class KGHomePage {
		
	private static WebDriver driver;
	private static String baseURL;
	private static KGPageObject KGPageObject; // #2
			
	// Test Preconditions
	@Before
	public static void openTest() {
		
		driver = new ChromeDriver();
		baseURL = "https://test.kurtgeiger.com/";
		KGPageObject = new KGPageObject(driver); // Constructor #3
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(baseURL);
	}

	@Test
	public static void acceptCookies() {
		
		String expectedText = KGPageObject.acceptCookies.getText();

		if (KGPageObject.acceptCookies.isEnabled() && expectedText.contains("I ACCEPT")) { 
	    System.out.println("Element is visible");
		} else {
	    System.out.println("Element is NOT visible");
	}
	
		KGPageObject.acceptCookies.click();	
	}
	
	public static void closePopUp() {
		KGPageObject.closePopUp.click();
	}
	
	@Test
	public static void redirectHomePage() {	
		KGPageObject.redirectHomePage.click();
	}
	
	
	// Header Elements
	@Test
	public static void storesLocatorHeader() {

		KGPageObject.storesLocatorHeader.click();
	}
	
	@Test
	public static void signInIconHeader() {
		KGPageObject.signInIconHeader.click();
	}
	
	
	@Test 
	public static void searchIconHeader() {
		KGPageObject.searchIconHeader.click();
	}
	
	@Test
	public static void miniBagIconHeader() {
		KGPageObject.miniBagIconHeader.click();
	}
	
	// Navbar Elements
	// Navbar Elements
	@Test
	public static void headerCategory() {
				
		String headerCategory = "Women";
				
		if (headerCategory == "New In") {
			KGPageObject.newInTab.click();
		} else if (headerCategory == "Women") {
			KGPageObject.womensTab.click();
		} else if (headerCategory == "Bags") {
			KGPageObject.bagsTab.click();
		} else if (headerCategory == "Sandals") {
			KGPageObject.sandalsTab.click();
		} else if (headerCategory == "Trainers") {
			KGPageObject.trainersTab.click();
		} else if (headerCategory == "Men") {
			KGPageObject.mensTab.click();
		} else if (headerCategory == "Kids") {
			KGPageObject.kidsTab.click();
		} else if (headerCategory == "Carvela") {
			KGPageObject.carvelaTab.click();
		} else if (headerCategory == "Brands") {
			KGPageObject.brandsTab.click();
		} else if (headerCategory == "Stories") {
			KGPageObject.storiesTab.click();
		} else if (headerCategory == "Sales") {
			KGPageObject.salesTab.click();
		} else {
			System.out.println("Couldn't find the page you were looking for.");
		}
	}

//		switch (headerCategory) {
//			case "New In":
//				newInTab.click();
//					break;
//			case "Women":
//				womensTab.click();
//					break;
//			case "Bags":
//				bagsTab.click();
//					break;
//			case "Sandals":
//				sandalsTab.click();
//					break;
//			case "Trainers":
//				trainersTab.click();
//					break;
//			case "Men":
//				mensTab.click();
//					break;
//			case "Kids":
//				kidsTab.click();
//					break;
//			case "Carvela":
//				carvelaTab.click();
//					break;
//			case "Brands":
//				brandsTab.click();
//					break;
//			case "Stories":
//				storiesTab.click();
//					break;
//			case "Sales":
//				salesTab.click();
//					break;
//			default:
//					break;
//		}
//		
//		return;
		
//	}
	
	// Main Content
	
	// Sub Navbar Elements - New In
	public static void subTrainersTab() {
		Actions action = new Actions(driver);
		action.moveToElement(KGPageObject.newInTab).perform();
		KGPageObject.subTrainersTab.click();
		
	}
	
	// Main Content Elements
	public static void shopBagsSection() throws InterruptedException {
		KGPageObject.shopBagsSection.click();
	}	

	@Test
	public static void shopSandalsSection() throws InterruptedException {
		KGPageObject.shopSandalsSection.click();
	}	
	
	// Footer Elements
	// Footer Elements
	public static void footerCategory() {
						
		String footerCategory = "Gender Pay Gap";
		
		if (footerCategory == "Contact Us") {
			KGPageObject.footerContactUs.click();
		} else if (footerCategory == "Stores Locator") {
			KGPageObject.footerStoreLocator.click();
		} else if (footerCategory == "Delivery & Service") {
			KGPageObject.footerDeliveryServices.click();
		} else if (footerCategory == "Returns & Exchanges") {
			KGPageObject.footerReturnsExchanges.click();
		} else if (footerCategory == "Payment & Security") {
			KGPageObject.footerPaymentSecurity.click();
		} else if (footerCategory == "FAQ") {
			KGPageObject.footerFaq.click();
		} else if (footerCategory == "Terms & Conditions") {
			KGPageObject.footerTermsAndConditions.click();
		} else if (footerCategory == "Gift Cards") {
			KGPageObject.footerGiftCards.click();
		} else if (footerCategory == "About Us") {
			KGPageObject.footerAboutUs.click();
		} else if (footerCategory == "Our History") {
			KGPageObject.footerOurHistory.click();
		} else if (footerCategory == "Careers") {
			KGPageObject.footerCareers.click();
		} else if (footerCategory == "Cookies & Privacy") {
			KGPageObject.footerCookiesAndPrivacyPolicy.click();
		} else if (footerCategory == "Modern Slavery Act") {
			KGPageObject.footerModernSlaveryAct.click();
		} else if (footerCategory == "Accessibility") {
			KGPageObject.footerAccessibility.click();
		} else if (footerCategory == "Gender Pay Gap") {
			KGPageObject.footerGenderPayGapReport.click();		
		} else if (footerCategory == "Tax Strategy") {
			KGPageObject.footerTaxStrategy.click();
		} else if (footerCategory == "Site Map") {
			KGPageObject.footerSitemap.click();
		} else {
			System.out.println("Couldn't find the page you were looking for");
		}
	}
		
	
	// Newsletter Sign Up
	public static void enterEmailForNewsletterSignUp() {
		KGPageObject.enterEmailForNewsletterSignUp.click();
		KGPageObject.enterEmailForNewsletterSignUp.sendKeys("test@kurtgeiger.com");
	}
	
	public static void newsLetterSignUpButton() {
		
		KGPageObject.newsLetterSignUpButton.click();
//		
//		String actualString = driver.findElement(By.className("//body[contains(@class, 'thanks-msg____bieg')]")).getText();
//
//		String expectedString = "THANK YOU!\\n\" + \"YOU'RE NOW SUBSCRIBED\\n\" + \"\\n\" + \"\", true";
//
//		assertTrue(actualString.contains(expectedString));
		
//		Assert.assertTrue("THANK YOU!\n" + "YOU'RE NOW SUBSCRIBED\n" + "\n" + "", true);

	}
	
	// Social Media
	public static void socialMedia() {
		
		String socialMedia = "";
		
		if (socialMedia == "Facebook") {
			KGPageObject.facebookIcon.click();
		} else if (socialMedia == "Instagram") {
			KGPageObject.instagramIcon.click();
		} else if (socialMedia == "Twitter") {
			KGPageObject.twitterIcon.click();
		} else {
			System.out.println("Couldn't find the page you were looking for.");
		}	
	}
	
	// After Test
	@After
	public static void closeTest() throws Exception {
	
		Thread.sleep(3000);
		driver.quit();
		
	}
}
	
	
	
	
