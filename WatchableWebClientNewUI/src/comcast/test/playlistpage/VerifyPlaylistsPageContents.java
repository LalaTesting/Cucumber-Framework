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
 * @author karthik
 * Description: This test script verifies the contents of playlists page.
 * Created on 08-November-2016 
 * Last updated on 10-November-2016
 * 
 */

public class VerifyPlaylistsPageContents extends BaseTest {

	static HomePage homePage;
	static PlaylistPage playListPage;

	/**
	 * Open the browser, Enter the Watchable URL
	 */
	@Test(description = "Step 1: Open the browser, Enter the Watchable URL", priority = 1)
	public void Step01_NavigeteToURL() throws Exception {

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

		// Clicking on HamburgerMenu
		homePage.clickOnHamburgerMenu();

		// Verifying the Menu Items under Hamburger Menu
		Assertions.verifyMenuItemsDisplayed(driver);
	}

	/**
	 * Verify TODY'S PLAYLISTS menu item present in header section.
	 */
	@Test(description = "Step 3: Verify TODY'S PLAYLISTS menu item present in header section.", priority = 3)
	public void Step03_VerifyTodaysPlaylists() throws Exception {

		// Verifying the Todays Playlists link displaying
		Assertions.verifyTodaysPlaylistsMenu(driver);

	}

	/**
	 * Click on Today's Playlists menu item
	 */
	@Test(description = "Step 4: Click on Today's Playlists  menu item.", priority = 4)
	public void Step04_ClickOnTodaysPlaylistsMenu() throws Exception {

		// Clicking on Todays Playlists Menu
		playListPage = homePage.clickOnTodaysPlaylistsMenu();

		log.info("Successfully navigate to Today's Playlists page. \n");
		Reporter.log("<p>Successfully navigate to Today's Playlists page.");

	}

	/**
	 * Verify the page heading is present in Today's Playlists page.
	 */

	@Test(description = "Step 5: Verify the page heading is present in Today's Playlists page.", priority = 5)
	public void Step05_VerifyTodaysPlaylistPageHeading() throws Exception {

		// verifying the header of Todays Playlists page

		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("playlistsPageHeading_XPATH")), driver),
				"Page heading is not present in Today's Playlists page");

		log.info("Page heading is present in Today's Playlists page \n");
		Reporter.log("<p>Page heading is present in Today's Playlists page.");

		log.info("The page heading displayed is : "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageHeading_XPATH")))
						.getText() + "\n");

		Reporter.log("<p>The page heading displayed is : "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("playlistsPageHeading_XPATH")))
						.getText());
	}

	/**
	 * Verify playlists are present under genre
	 */
	@Test(description = "Step 6: Verify playlists are present under genre.", priority = 6)
	public void Step06_VerifyPlaylistUnderGenre() throws Exception {

		// scrolling up-to footer section of playlist page
		playListPage.scrollUpToFooterSection();

		// Getting the count of playlist under Genre
		int playlistCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("playlistsPagePlaylistImage_XPATH")))
				.size();

		log.info("Total count of playlist present in playlist page are: "
				+ playlistCount + "\n");

		// Verifying whether playlists are present in playlist page
		Assert.assertTrue(playlistCount > 0,
				"Playlists are not present in Today's Playlists page.");
		log.info("Playlists are present in Today's Playlists page. \n");
		Reporter.log("<p>Playlists are present in Today's Playlists page.");

	}
}
