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
 * @author karthik Description: This test script verifies the total count of
 *         playlists and their names in today’s Playlists page. Created on
 *         09-November-2016 Last updated on 09-November-2016
 * 
 */

public class VerifyPlaylistsCountAndNameOfPlaylistsInPlaylistsPage extends
		BaseTest {

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
	public void Step03_VerifyTodaysPlaylistsMenu() throws Exception {

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
	 * Verify playlists are displaying in today’s playlists page.
	 */
	@Test(description = "Step 5: Click on Today's Playlists  menu item.", priority = 5)
	public void Step05_VerifyPlaylistsAreDisplayingInPlaylistPage() throws Exception {

		// Verifying the playlist are dispalying
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("playlistsPagePlaylistImage_XPATH")), driver),
				"Playlists are not displaying in today’s playlists page.");

		log.info("Playlists are displaying in today’s playlists page. \n");
		Reporter.log("<p>Playlists are displaying in today’s playlists page.");

		// Getting Playlist count under Todays Playlist page
		int playlistCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("playlistsPagePlaylistImage_XPATH")))
				.size();

		// Verifying whether playlists are present in playlist page
		Assert.assertTrue(playlistCount > 0,
				"Playlists are not present in Today's Playlists page.");

		log.info("Total number of playlists present in playlists page is :"
				+ playlistCount + "\n");
		Reporter.log("<p>Total number of playlists present in playlists page is :"
				+ playlistCount);

	}

	/**
	 * Verify names are displaying on playlists in today’s playlists page.
	 */
	@Test(description = "Step 6: Verify names are displaying on playlists in today’s playlists page. ", priority = 6)
	public void Step06_VerifyPlayListNameDisplayingInPlaylistPage() throws Exception {

		//Scrolling upto footer section of playlist page
		playListPage.scrollUpToFooterSection();
				
		// Getting the total number of playlist name dispalying in Todays playlist page
		int totalPlayListName = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("playlistsPagePlaylistName_XPATH")))
				.size();

		if (totalPlayListName > 0) {
			log.info("Following names are displaying on playlists in today’s playlists page : \n");
			Reporter.log("<p>Following names are displaying on playlists in today’s playlists page : ");
		}

		//Creating global variable 	playlistName
		String playlistName = "";

		for (int i = 1; i <= totalPlayListName; i++) {

			// Validating playlist name dispalying or not
			if (driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("playlistsPagePlaylistNamePartOne_XPATH")
									+ i
									+ ObjRepoProp
											.getProperty("playlistsPagePlaylistNamePartTwo_XPATH")))
					.isDisplayed()) {

				// Getting the names of playlist
				playlistName = driver
						.findElement(
								By.xpath(ObjRepoProp
										.getProperty("playlistsPagePlaylistNamePartOne_XPATH")
										+ i
										+ ObjRepoProp
												.getProperty("playlistsPagePlaylistNamePartTwo_XPATH")))
						.getText();

				// Printing the playlist name 
				log.info(playlistName + "\n");
				Reporter.log("<p>" + playlistName);

			}

		}

	}

}
