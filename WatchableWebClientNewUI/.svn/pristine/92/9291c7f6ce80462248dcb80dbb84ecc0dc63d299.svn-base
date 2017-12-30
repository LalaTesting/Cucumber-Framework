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
 * Description: This test script verifies the clicking on play icon from playlist (first) from playlists page 
 * user navigating to watch page.
 * Created on 08-November-2016 
 * Last updated on 08-November-2016
 * 
 */

public class VerifyNavigatingToWatchPageClickingOnPlayIcon extends BaseTest {

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
	 * Verify play icon is present in first paly list
	 */
	@Test(description = "Step 5: Verify play icon is present in first paly list.", priority = 5)
	public void VerifyPlayIconOnPlaylist() throws Exception {

		// Mouse over the first playlist image
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("playlistsPageFirstPlaylistLogo_XPATH"))));
		Thread.sleep(2000);

		// Verify play icon is present on first play-list
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("playlistsPageFirstPlaylistPlayIcon_XPATH")),
				driver), "Play icon is not present on first play list image.");

		log.info("Play icon is present on first play list image.\n");
		Reporter.log("<p>Play icon is present on first play list image.");

	}

	/**
	 * Click on Play icon from play list
	 */
	@Test(description = "Step 6: Click on Play icon from playlist.", priority = 6)
	public void Step06_ClickOnPlaylistIcon() throws Exception {

		// Click on play icon from first play-list.
		watchPage = playlistPage.clickOnFirstPlaylistPlayIcon();

		log.info("Successfully navigated to Watch page.\n");
		Reporter.log("<p>Successfully navigated to Watch page.");

	}

}
