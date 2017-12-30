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


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies the metadata contents displaying on a single (first) playlist in playlists page.
 * Created on 09-November-2016 
 * Last updated on 09-November-2016
 * 
 */

public class VerifyMetadataContentsOnPlaylists extends BaseTest {

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
	 * Verify playlist name is present in first paly list
	 */
	@Test(description = "Step 5: Verify playlist name is present in first paly list.", priority = 5)
	public void Step05_VerifyPlaylistNamePresent() throws Exception {

		// Verify playlist name is present
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("playlistsPageFirstPlaylistName_XPATH")), driver),
				"Playlist name is not present on first play list image.");

		log.info("Playlist name is present on first play list image.\n");
		Reporter.log("<p>Playlist name is present on first play list image.");

		log.info("The name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistName_XPATH")))
						.getText() + ".\n");
		Reporter.log("<p>The name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistName_XPATH")))
						.getText());

	}

	/**
	 * Verify playlist genre title is present in first paly list
	 */
	@Test(description = "Step 6: Verify playlist genre title is present in first paly list.", priority = 6)
	public void Step06_VerifyPlaylistGenreTtlePresent() throws Exception {

		// Verify playlist genre title is present
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("playlistsPageFirstPlaylistGenreTitle_XPATH")),
				driver),
				"Playlist genre title is not present on first play list image.");

		log.info("Playlist genre title is present on first play list image.\n");
		Reporter.log("<p>Playlist genre title is present on first play list image.");

		log.info("Playlist Genre Title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistGenreTitle_XPATH")))
						.getText().replace("|", "") + ".\n");
		Reporter.log("<p>Playlist Genre Title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistGenreTitle_XPATH")))
						.getText().replace("|", ""));

	}

	/**
	 * Verify playlist description is present in first paly list
	 */
	@Test(description = "Step 7: Verify playlist description is present in first paly list.", priority = 7)
	public void Step07_VerifyPlaylistDescriptionPresent() throws Exception {

		// Verify playlist description is present
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("playlistsPageFirstPlaylistDecription_XPATH")),
				driver),
				"Playlist description is not present on first play list image.");

		log.info("Playlist description is present on first play list image.\n");
		Reporter.log("<p>Playlist description is present on first play list image.");

		log.info("Playlist Description displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistDecription_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Clicked Platyist Description displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistDecription_XPATH")))
						.getText());

	}

	/**
	 * Verify playlist video count is displaying on playlist.
	 */
	@Test(description = "Step 8: Verify playlist video count is displaying on playlist.", priority = 8)
	public void Step07_VerifyPlaylistVideoCountPresent() throws Exception {

		// Verify playlist video count is present
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("playlistsPageFirstPlaylistVideoCount_XPATH")),
				driver),
				"Playlist video count is not present on first play list image.");

		log.info("Playlist video count is present on first play list image.\n");
		Reporter.log("<p>Playlist video count is present on first play list image.");

		log.info("Playlist video count displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistVideoCount_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Platlist video count displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageFirstPlaylistVideoCount_XPATH")))
						.getText());

	}
}
