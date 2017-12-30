package comcast.test.watchpage;

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
 * Description: This test script verifies navigation to show page from watch page 
 * by clicking on Watch Today’s Playlists button. 
 *Created on 19-November-2016 
 *Last updated on 19-November-2016
 * 
 */

public class VerifyNavigatingToPlaylistsPageFromWatchPage extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
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
	 * Verify videos are present in WHAT WE’RE WATCHING section
	 */
	@Test(description = "Step 2: Verify WHAT WE’RE WATCHING section is present in home page.", priority = 2)
	public void Step02_VerifyWhatWeAreWatchingSection() throws Exception {

		// Verify WHAT WE’RE WATCHING section

		Assertions.verifyWhatWeAreWatchingSection(driver);

	}

	/**
	 * Click on first video Title
	 */
	@Test(description = "Step 3: Click on first video Title from what we are watching section.", priority = 3)
	public void Step03_ClickOnFirstVideoTitle() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		// Click on first video Title
		watchPage = homePage.clickOnFirstVideoTitle();

		log.info("Successfully Clicked on the Video Title: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Successfully Clicked on the Video Title: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoTitle_XPATH")))
						.getText());

		log.info("Successfully navigated to Watch page.\n");
		Reporter.log("<p>Successfully navigated to Watch page.");

	}

	/**
	 * Verify Watch Today’s Playlists button
	 */
	@Test(description = "Step 4: Verify Watch Today’s Playlists button is present in watch page.", priority = 4)
	public void Step04_VerifyTodaysPlaylistButton() throws Exception {

		// Verify Watch Today’s Playlists button

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("watchPageWatchTodaysPlaylistsButton_XPATH"))));
		Thread.sleep(2500);

		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageWatchTodaysPlaylistsButton_XPATH")),
						driver),
				"Watch Today’s Playlists button is not present in watch page below the WHAT WE’RE WATCHING section.");

		log.info("Watch Today’s Playlists button is present in watch page below the WHAT WE’RE WATCHING section.\n");
		Reporter.log("<p>Watch Today’s Playlists button is present in watch page below the WHAT WE’RE WATCHING section.");

	}

	/**
	 * Click on Watch Today’s Playlists button.
	 */
	@Test(description = "Step 5: Click on Today’s Playlists button.", priority = 5)
	public void Step05_ClickOnWatchTodaysPlaylistsButton() throws Exception {

		// Click on Watch Today’s Playlists button.
		playlistPage = watchPage.clickOnWatchTodaysPlaylistButton();

		log.info("Successfully navigate to Today’s Playlists page.\n");
		Reporter.log("<p>Successfully navigate to Today’s Playlists page.");

	}

}
