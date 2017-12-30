package comcast.test.browseshowspage;

import static comcast.util.PropertyFileReader.TextProp;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.BrowseShowsPage;
import comcast.pages.HomePage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies logout from browse shows  page user is navigating back to home page.
 * Created on 01-November-2016 
 * Last updated on 01-November-2016
 * 
 */

public class VerifyLogoutFromBrowseShowsPageNavigatingToHomePage extends
		BaseTest {

	static HomePage homePage;
	static BrowseShowsPage browseShowsPage;

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
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 3: Click on the hamburger menu.", priority = 3)
	public void Step03_ClickOnHamburgerMenu() throws Exception {

		// Click on the hamburger menu.
		homePage.clickOnHamburgerMenu();

		// Verify menu items are displayed
		Assertions.verifyMenuItemsDisplayed(driver);

	}

	/**
	 * Verify BROWSE SHOWS menu.
	 */
	@Test(description = "Step 4: Verify BROWSE SHOWS menu item present in header section.", priority = 4)
	public void Step03_VerifyBrowseShowsMenu() throws Exception {

		// Verify presence of BROWSE SHOWS menu.
		Assertions.verifyBrowseShowsMenu(driver);
	}

	/**
	 * Click on browse shows menu item
	 */
	@Test(description = "Step 5: Click on browse shows menu item.", priority = 5)
	public void Step04_ClickOnbrowseShowsMenu() throws Exception {

		// Click on browse shows menu.
		browseShowsPage = homePage.clickOnBrowseShowsMenu();

		log.info("Successfully navigated to Browse Shows page.\n");
		Reporter.log("<p>Successfully navigated to Browse Shows page.");

	}

	/**
	 * Click on logout from user menu
	 */
	@Test(description = "Step 6: Click on logout from user menu . ", priority = 6)
	public void Step06_ClickOnLogoutFromBrowseShowsPage() throws Exception {

		// Click on logout from browse showse Page
		homePage = browseShowsPage.clickOnLogoutMenu();

		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}
}
