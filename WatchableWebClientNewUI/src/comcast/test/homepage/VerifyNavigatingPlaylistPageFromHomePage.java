package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.PlaylistPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verify the main contents of home page sections 
 *Created on 22-September-2016 
 *Last updated on 22-September-2016
 * 
 */

public class VerifyNavigatingPlaylistPageFromHomePage extends BaseTest {

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
	 * Verify Watch Today’s Playlist button
	 */
	@Test(description = "Step 2: Verify Watch Today’s Playlist button is present in home.", priority = 2)
	public void Step02_VerifyWatchTodaysPlaylistButton() throws Exception {

		// Move to Watch Today’s Playlist button

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageWatchTodaysPlaylistsButton_XPATH"))));

		// Verify Watch Today’s Playlist button
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageWatchTodaysPlaylistsButton_XPATH")),
				driver),
				"Watch Today’s Playlist button is not present in home page");

		log.info("Watch Today’s Playlist button is present in home page below the WHAT WE’RE WATCHING section.\n");
		Reporter.log("<p>Watch Today’s Playlist button is present in home page below the WHAT WE’RE WATCHING section.");

	}

	/**
	 * Click on Watch Today’s Playlist button.
	 */
	@Test(description = "Step 3: Click on Watch Today’s Playlist button.", priority = 3)
	public void Step03_ClickOnTodayPlaylistButton() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		// Click on Watch Today’s Playlist button.
		playlistPage = homePage.clickOnTodaysPlaylistButton();
		log.info("Successfully navigated to All playlists page.\n");
		Reporter.log("<p>Successfully navigated to All playlists page.");

	}
}
