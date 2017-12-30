package comcast.test.playlistpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.PlaylistPage;
import comcast.pages.WatchPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies user is navigating back to home page from today’s playlists page by 
 * clicking on bottom watchable logo.
 * user navigating to watch page.
 * Created on 08-November-2016 
 * Last updated on 08-November-2016
 * 
 */

public class VerifyNavigatingToHomePageFromPlaylistsPageClickingOnFooterHomeLink
		extends BaseTest {

	static HomePage homePage;
	static PlaylistPage playlistPage;
	static WatchPage watchPage;

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
	 * Verify home link is present in the footer
	 */
	@Test(description = "Step 5: Verify home link is present in the footer of the page.", priority = 5)
	public void Step05_VerfiyFooterHomeLink() throws Exception {

		// Move to footer home link
		CustomFun.mouseOverElement(driver,
				driver.findElement(By.xpath(ObjRepoProp
						.getProperty("homePageFooterHomeLink_XPATH"))));
		Thread.sleep(1000);

		// Verify home link is present in the footer

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterHomeLink_XPATH")), driver),
				"Home link is notpresent in the footer of the page.");

		log.info("Home link is present in the footer of the page.\n");
		Reporter.log("<p>Home link is present in the footer of the page.");

	}

	/**
	 * Click on footer home link.
	 */
	@Test(description = "Step 6: Click on home link from footer. ", priority = 6)
	public void Step06_ClickOnFooterHomeLink() throws Exception {

		// Click on footer home link
		homePage = playlistPage.clickOnFooterHomeLink();

		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}
}
