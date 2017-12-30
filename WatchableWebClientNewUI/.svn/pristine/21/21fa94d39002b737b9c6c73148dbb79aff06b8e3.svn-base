package comcast.test.browseshowspage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.BrowseShowsPage;
import comcast.pages.HomePage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies navigating to browse shows page on clicking browse shows menu from header. 
 *Created on 26-October-2016 
 *Last updated on 26-October-2016
 * 
 */

public class VerifyBrowseShowsPageTitle extends BaseTest {

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
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 2: Click on the hamburger menu.", priority = 2)
	public void Step02_ClickOnHamburgerMenu() throws Exception {

		// Click on the hamburger menu.
		homePage.clickOnHamburgerMenu();

		// Verify menu items are displayed
		Assertions.verifyMenuItemsDisplayed(driver);

	}

	/**
	 * Verify BROWSE SHOWS menu.
	 */
	@Test(description = "Step 3: Verify BROWSE SHOWS menu item present in header section.", priority = 3)
	public void Step03_VerifyBrowseShowsMenu() throws Exception {

		// Verify presence of BROWSE SHOWS menu.
		Assertions.verifyBrowseShowsMenu(driver);
	}

	/**
	 * Click on browse shows menu item
	 */
	@Test(description = "Step 4: Click on browse shows menu item.", priority = 4)
	public void Step04_ClickOnbrowseShowsMenu() throws Exception {

		// Click on browse shows menu.
		browseShowsPage = homePage.clickOnBrowseShowsMenu();

		log.info("Successfully navigated to Browse Shows page.\n");
		Reporter.log("<p>Successfully navigated to Browse Shows page.");

	}

	/**
	 * Verify browse shows page title.
	 */
	@Test(description = "Step 5: Verify title is displaying for browse shows page.", priority = 5)
	public void Step05_VerifyBrowseShowsPageTitle() throws Exception {

		// Verify browse shows page title.

		String pageTitle = driver.getTitle();

		Assert.assertNotNull(pageTitle,
				"Page title is not present for browse shows page");

		log.info("Page title is present for browse shows page.\n");
		Reporter.log("<p>Page title is present for browse shows page");

		log.info("Browse shows Page title displayed is: " + pageTitle + " \n");
		Reporter.log("<p>Browse shows Page title displayed is: " + pageTitle);

	}
}
