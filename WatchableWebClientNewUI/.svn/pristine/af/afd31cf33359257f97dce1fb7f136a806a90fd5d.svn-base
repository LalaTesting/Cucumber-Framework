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
 * Description: This test script verifies the items displaying in home page header section before login to application. 
 *Created on 24-September-2016 
 *Last updated on 24-September-2016
 * 
 */

public class VerifyHeaderHomePageSectionBeforeLogIn extends BaseTest {

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
	 * Verify header section
	 */
	@Test(description = "Step 2: Verify header section is present in home page", priority = 2)
	public void Step02_VerifyHeaderSection() throws Exception {

		// Verify header section
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHeaderSection_XPATH")), driver),
				"Header section is not present in home page.");

		log.info("Header section is present in home page.\n");
		Reporter.log("<p>Header section is present in home page.");

	}

	/**
	 * Verify the header items Present in header before login
	 */
	@Test(description = "Step 3: Verify the header items Present in header before login.", priority = 3)
	public void Step03_VerifyHeaderItemsBeforeLogin() throws Exception {

		// Verify Hamburger Menu
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("hamburgerMenuIcon_XPATH")),
				driver), "Hamburger Menu is not present in header section.");

		log.info("Hamburger Menu is present in header section.\n");
		Reporter.log("<p>Hamburger Menu is present in header section.");

		// Verify Home Header Text
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHomeHeadingText_XPATH")), driver),
				"Home header Text is not present in header section.");

		log.info("Home header Text is present in header section.\n");
		Reporter.log("<p>Home header Text is present in header section.");
		log.info("The header displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageHomeHeadingText_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The header displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageHomeHeadingText_XPATH")))
						.getText());

		// Verify WATCHABLE Logo
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHeaderWatchableLogo_XPATH")), driver),
				"WATCHABLE Logo is not present in header section.");

		log.info("WATCHABLE Logo is present in header section.\n");
		Reporter.log("<p>WATCHABLE Logo is present in header section.");

		// Verify LOG IN button
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("homePageLoginButton_XPATH")),
				driver), "LOG IN button is not present in header section.");

		log.info("LOG IN button is present in header section.\n");
		Reporter.log("<p>LOG IN button is present in header section.");

		// Verify SIGN UP button
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageSignupButton_XPATH")), driver),
				"SIGN UP button is not present in header section.");

		log.info("SIGN UP button is present in header section.\n");
		Reporter.log("<p>SIGN UP button is present in header section.");

		// Verify Search icon
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageSearchButton_XPATH")), driver),
				"Search icon is not present in header section.");

		log.info("Search icon is present in header section.\n");
		Reporter.log("<p>Search icon button is present in header section.");

	}

}
