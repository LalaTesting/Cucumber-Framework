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
 * Description: This test script verifies the clicking on playlist description from playlist (first) from playlists 
 * page user navigating to watch page. 
 * user navigating to watch page.
 * Created on 08-November-2016 
 * Last updated on 08-November-2016
 * 
 */

public class VerifyNavigatingToWatchPageClickingOnPlaylistDdescription extends
		BaseTest {

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
	 * Verify playlist description is present in first paly list
	 */
	@Test(description = "Step 5: Verify playlist description is present in first paly list.", priority = 5)
	public void Step05_VerifyPlaylistDescriptionPresent() throws Exception {

		// Verify playlist description is present
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("playlistsPageFirstPlaylistDecription_XPATH")),
				driver),
				"Playlist description is not present on first play list image.");

		log.info("Playlist description is present on first play list image.\n");
		Reporter.log("<p>Playlist description is present on first play list image.");

	}

	/**
	 * Click on Playlist description from playlist
	 */
	@Test(description = "Step 6: Click on Playlist description from playlist.", priority = 6)
	public void Step06_ClickOnPlaylistDescription() throws Exception {

		String playlistDescription = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistDecription_XPATH")))
				.getText();

		// Click on Playlist description
		watchPage = playlistPage.clickOnFirstPlaylistDescription();

		log.info("Clicked Playlist Description: " + playlistDescription + "\n");
		Reporter.log("<p>Clicked Playlist Description: " + playlistDescription);

		log.info("Successfully navigated to Watch page.\n");
		Reporter.log("<p>Successfully navigated to Watch page.");

	}

}
