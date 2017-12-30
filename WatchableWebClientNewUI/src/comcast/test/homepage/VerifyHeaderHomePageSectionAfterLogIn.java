package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import static comcast.util.PropertyFileReader.TextProp;
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
 * Description: This test script verifies the items displaying in home page header section after login to application 
 *Created on 26-September-2016 
 *Last updated on 26-September-2016
 * 
 */

public class VerifyHeaderHomePageSectionAfterLogIn extends BaseTest {

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
	 * Login to the application with valid credentials.
	 */
	@Test(description = "Step 2: Login to the application with valid credentials.", priority = 2)
	public void Step02_LoginToApplicationWithValidCredentials()
			throws Exception {

		// Login to application with valid credentials

		String email = TextProp.getProperty("email");
		String pass = TextProp.getProperty("password");

		homePage.loginToWebClient(email, pass);

	}

	/**
	 * Verify header section
	 */
	@Test(description = "Step 3: Verify header section is present in home page", priority = 3)
	public void Step03_VerifyHeaderSection() throws Exception {

		// Verify header section
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHeaderSection_XPATH")), driver),
				"Header section is not present in home page.");

		log.info("Header section is present in home page.\n");
		Reporter.log("<p>Header section is present in home page.");

	}

	/**
	 * Verify the header items Present in header after login
	 */
	@Test(description = "Step 4: Verify the header items Present in header before login.", priority = 4)
	public void Step04_VerifyHeaderItemsAftern() throws Exception {

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

		// Verify logged in user name
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("homePageLoginName_XPATH")),
				driver),
				"Logged in user name is not displayed left top corner.");

		log.info("Logged in user name is displayed left top corner.\n");
		Reporter.log("<p>Logged in user name is displayed left top corner.");

		// Verify down arrow tool menu.
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageUserProfileIcon_XPATH")), driver),
				"Down arrow tool menu is not present beside to logged in user name in header section.");

		log.info("Down arrow tool menu is present beside to logged in user name in header section.\n");
		Reporter.log("<p>Down arrow tool menu is present beside to logged in user name in header section.");

		// Verify Search icon
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageSearchButton_XPATH")), driver),
				"Search icon is not present in header section.");

		log.info("Search icon is present in header section.\n");
		Reporter.log("<p>Search icon button is present in header section.");

	}

}
