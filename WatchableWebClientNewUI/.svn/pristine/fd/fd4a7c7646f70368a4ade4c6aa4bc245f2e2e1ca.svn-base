package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verify navigating to watch page from playlist section from home page 
 *Created on 27-September-2016 
 *Last updated on 27-September-2016
 * 
 */

public class VerifyNavigatingToWatchPageFromPlaylistSection extends BaseTest {

	static HomePage homePage;
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
	 * Verify play lists section
	 */
	@Test(description = "Step 2: Verify Play list section is present in home page.", priority = 2)
	public void Step02_VerifyPlaylistSection() throws Exception {

		// Verify play lists section

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePagePlaylistSection_XPATH")), driver),
				"Play list section is not present in home page.");

		log.info("Play list section is present in home page.\n");
		Reporter.log("<p>Play list section is present in home page.");

	}

	/**
	 * Verify play lists present in play lists section
	 */
	@Test(description = "Step 3: Verify playlists are present in playlist section in home page.", priority = 3)
	public void Step03_VerifyPlaylistPresent() throws Exception {

		// Verify play lists present in play lists section

		int playlistCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("homePagePlaylistLogoImage_XPATH")))
				.size();

		Assert.assertTrue(playlistCount > 0,
				"Play list are not present in playlists section in home page");

		log.info("Play list are present in playlists section in home page.\n");
		Reporter.log("<p>Play list are present in playlists section in home page.");

		}

	/**
	 * Click on play icon from any of the playlist
	 */
	@Test(description = "Step 4: Click on play icon from any of the playlist from playlist section.", priority = 4)
	public void Step04_ClickOnPlaylistIcon() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		// Click on play icon from selected playlist.
		watchPage = homePage.clickOnPlaylistPlayIcon();
		log.info("Successfully navigated to Watch page.\n");
		Reporter.log("<p>Successfully navigated to Watch page.");

	}
}
