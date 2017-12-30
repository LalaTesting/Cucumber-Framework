package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies the display of footer and the links present in the footer. 
 *Created on 04-October-2016 
 *Last updated on 04-October-2016
 * 
 */

public class VerifyFooterLinks extends BaseTest {

	static HomePage homePage;

	/**
	 * Open the browser, Enter the Watchable URL
	 */
	@Test(description = "Step 1: Open the browser, Enter the Watchable URL", priority = 1)
	public void Step01_NavigeteToURL() throws Exception {

		// Home page object instance creation
		// homePage = new HomePage(driver);

		// Navigates to Watchable application URL
		homePage = HomePage.navigateToWatchableHomePage(driver, baseUrl);

		log.info("Successfully navigated to Watchable Home page\n");
		Reporter.log("<p>Successfully navigated to Watchable Home page");

	}

	/**
	 * Verify footer link sections
	 */
	@Test(description = "Step 02: Verify footer link sections.", priority = 02)
	public void Step02_VerifyFooterSection() throws Exception {

		// Move to Footer section

		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("homePageFooterSection_XPATH"))));

		// Verify footer link sections
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageDownloadBadge_XPATH")), driver),
				"Footer link section is not present in home page");

		log.info("Footer link section is present in home page.\n");
		Reporter.log("<p>Footer link section is present in home page.");

	}

	/**
	 * Verify the links present in footer link sections.
	 */
	@Test(description = "Step 03: Verify footer link sections.", priority = 03)
	public void Step03_VerifyFooterLinks() throws Exception {

		// Verify Home link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterHomeLink_XPATH")), driver),
				"Home link not present in footer section.");

		log.info("Home link present in footer section.\n");
		Reporter.log("<p>Home link present in footer section.");

		// Verify Learn More link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterLearnMoreLink_XPATH")), driver),
				"Learn More link not present in footer section.");

		log.info("Learn More link present in footer section.\n");
		Reporter.log("<p>Learn More link present in footer section.");

		// Verify Help link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterHelpLink_XPATH")), driver),
				"Help link not present in footer section.");

		log.info("Help link present in footer section.\n");
		Reporter.log("<p>Help link present in footer section.");

		// Verify Contact Us link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterContactUsLink_XPATH")), driver),
				"Contact Us link not present in footer section.");

		log.info("Contact Us link present in footer section.\n");
		Reporter.log("<p>Contact Us link present in footer section.");

		// Verify Privacy Policy link
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageFooterPrivacyPolicyLink_XPATH")),
						driver),
				"Privacy Policy link not present in footer section.");

		log.info("Privacy Policy link present in footer section.\n");
		Reporter.log("<p>Privacy Policy link present in footer section.");

		// Verify Terms Of Service link
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageFooterTermsOfServiceLink_XPATH")),
						driver),
				"Terms Of Service link not present in footer section.");

		log.info("Terms Of Service link present in footer section.\n");
		Reporter.log("<p>Terms Of Service link present in footer section.");

		// Verify AdChoices link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterAdChoicesLink_XPATH")), driver),
				"AdChoices link not present in footer section.");

		log.info("AdChoices link present in footer section.\n");
		Reporter.log("<p>TAdChoices link present in footer section.");

	}

	/**
	 * Verify footer home link is not clickable
	 */
	@Test(description = "Step 4: Verify the footer “HOME” link is not clickable in footer from home page.", priority = 4)
	public void Step04_VerifyFooterHomeLinkNotClickable() throws Exception {

		// Verify footer home link is not clickable
		boolean match = false;

		CustomFun.isElementClickable(driver.findElement(By.xpath(ObjRepoProp
				.getProperty("homePageFooterHomeLink_XPATH"))),
				"Watchable Logo", false);
		log.info(match);

		Assert.assertFalse(match,
				"The footer home link is clickable in Home Page");

		log.info("Home link from footer is not clickable from home page.\n");
		Reporter.log("<p>Home link from footer is not clickable from home page.");

	}

}
