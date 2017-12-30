package comcast.test.playlistpage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.HomePage;
import comcast.pages.PlaylistPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies page title is displaying for today’s playlists page and title content.
 * user navigating to watch page.
 * Created on 09-November-2016 
 * Last updated on 09-November-2016
 * 
 */

public class VerifyPlaylistsPageTitle extends BaseTest {

	static HomePage homePage;
	static PlaylistPage playlistPage;

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
	 * Verify TODY'S PLAYLISTS menu
	 */
	@Test(description = "Step 3: Verify TODY'S PLAYLISTS menu item present in header section.", priority = 3)
	public void Step03_VerifyTodaysPlaylistsMenu() throws Exception {

		// Verify TODY'S PLAYLISTS menu
		Assertions.verifyTodaysPlaylistsMenu(driver);
	}

	/**
	 * Click on Today's Playlists menu item
	 */
	@Test(description = "Step 4: Click on Today's Playlists  menu item.", priority = 4)
	public void Step04_ClickOnTodaysPlaylistsMenu() throws Exception {

		// Click on Today's Playlists menu item
		playlistPage = homePage.clickOnTodaysPlaylistsMenu();

		log.info("Successfully navigate to Today's Playlists page.\n");
		Reporter.log("<p>Successfully navigate to Today's Playlists page.");

	}

	/**
	 * Verify today’s playlists page title.
	 */
	@Test(description = "Step 5: Verify title is displaying for today’s playlists page.", priority = 5)
	public void Step05_VerifyTodaysPlaylistsPageTitle() throws Exception {

		// Verify today’s playlists page title.

		String pageTitle = driver.getTitle();

		Assert.assertNotNull(pageTitle,
				"Page title is not present for today’s playlists page");

		log.info("Page title is present for today’s playlists page.\n");
		Reporter.log("<p>Page title is present for today’s playlists page");

		log.info("Today’s Playlists Page title displayed is: " + pageTitle
				+ " \n");
		Reporter.log("<p>Today’s Playlists Page title displayed is: "
				+ pageTitle);

	}
}
