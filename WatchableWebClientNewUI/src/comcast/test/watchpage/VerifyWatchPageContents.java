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
import comcast.pages.WatchPage;

/**
 * 
 * @author karthik.ashoka
 * Description: This test script verifies the contents displaying in watch page 
 *Created on 23-November-2016 
 *Last updated on 23-November-2016
 * 
 */

public class VerifyWatchPageContents extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;

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
	 * Verify WHAT WE’RE WATCHING section is present in home page.
	 */
	@Test(description = "Step 2: Verify WHAT WE’RE WATCHING section is present in home page.", priority = 2)
	public void Step02_VerifyWhatWeAreWatchingSection() throws Exception {

		// Verifying the What We are Watching Section
		Assertions.verifyWhatWeAreWatchingSection(driver);

	}

	/**
	 * Click on first video Title from what we are watching section.
	 */
	@Test(description = "Step 3: Click on first video Title from what we are watching section.", priority = 3)
	public void Step03_ClickOnFirstVideoTitle() throws Exception {

		// Clicking on first video title from home page
		watchPage = homePage.clickOnFirstVideoTitle();

		// Getting title of first video under what we are watching section
		String videoTitle = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("homePageFirstVideoTitle_XPATH")))
				.getText();

		log.info("Successfully click on first title - " + videoTitle + "\n");
		Reporter.log("<p>Successfully click on first title - " + videoTitle);

		log.info("Successfully navigate to watch page.\n");
		Reporter.log("<p>Successfully navigate to watch page.");

	}

	/**
	 * Verify Video player is displaying in watch page
	 */
	@Test(description = "Step 4: Verify Video player is displaying in watch page", priority = 4)
	public void Step04_VerifyVideoPlayerInWatchPage() throws Exception {
		// Verifying the Video Player is displaying or not
		Assert.assertTrue(CustomFun.isElementPresent(
				By.id(ObjRepoProp.getProperty("videoPlayer_ID")), driver),
				"Video Player is not displaying in watch page.");

		log.info("Player is displaying in watch page.\n");
		Reporter.log("<p>Player is displaying in watch page.");
	}

	/**
	 * Mouse over the player and verify display of player controls.
	 */
	@Test(description = "Step 5: Mouse over the player and verify display of player controls.", priority = 5)
	public void Step05_VerifyPalyerControlsAreDisplaying() throws Exception {
		
		// Mouse hover on video Player
		CustomFun.mouseOverVideoPlayer(driver);
		
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp.getProperty("watchPageVideoPlayerController_XPATH")), driver),
				"Player controls are not displaying on mouse over the player");

		log.info("Player controls are displaying on mouse over the player.\n");
		Reporter.log("<p>Player controls are displaying on mouse over the player.");

	}

	/**
	 * Verify up-next video drawer section is present in watch page.
	 */
	@Test(description = "Step 6: Verify up-next video drawer section is present in watch page.", priority = 6)
	public void Step06_VerifyUpNextVideoDrawerSection() throws Exception {

		// Verifying the up-next video drawer section is present in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageUpNextVidoSection_XPATH")), driver),
				"Up-next video drawer section is not present in watch page.");

		log.info("Up-next video drawer section is present in watch page.\n");
		Reporter.log("<p>Up-next video drawer section is present in watch page.");

	}

	/**
	 * Mouse over the up-next video drawer section and verify display of share
	 * button.
	 */
	@Test(description = "Step 7: Mouse over the up-next video drawer section and verify display of share button.", priority = 7)
	public void Step07_VerifyShareButton() throws Exception {
		// Mouse hover on up-next video drawer
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("watchPageUpNextVidoSection_XPATH"))));
		
		Thread.sleep(2500);

		// Verifying the share button present in watch page
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("watchPageShareButton_XPATH")), driver),
				"Share button is not displaying on mouse over the up-next video drawer section.");

		log.info("Share button is displaying on mouse over the up-next video drawer section.\n");
		Reporter.log("<p>Share button is displaying on mouse over the up-next video drawer section.");

	}

	/**
	 * Verify video show name is displaying in watch page.
	 */
	@Test(description = "Step 8: Verify video show name is displaying in watch page.", priority = 8)
	public void Step08_VerifyVideoShowName() throws Exception {

		// Verifying the show name is displaying in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageVideoShowTitle_XPATH")), driver),
				"Video show name is not displaying in watch page.");

		log.info("Video show name is displaying in watch page.\n");
		Reporter.log("<p>Video show name is displaying in watch page.");

		// Getting video show name and assigning to variable
		String showName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("watchPageVideoShowTitle_XPATH")))
				.getText();

		log.info("Video show name is displaying in watch page." + showName
				+ "\n");
		Reporter.log("<p>Video show name is displaying in watch page."
				+ showName);

	}

	/**
	 * Verify video name is displaying in watch page.
	 */
	@Test(description = "Step 9: Verify video name is displaying in watch page.", priority = 9)
	public void Step09_VerifyVideoName() throws Exception {

		// Verifying the video name is displaying in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("watchPageVideoTitle_XPATH")),
				driver), "Video name is not displaying in watch page.");

		log.info("Video name is displaying in watch page.\n");
		Reporter.log("<p>Video name is displaying in watch page.");

		// Getting video name and assigning to variable
		String videoName = driver.findElement(
				By.xpath(ObjRepoProp.getProperty("watchPageVideoTitle_XPATH")))
				.getText();

		log.info("Video name is displaying in watch page." + videoName + "\n");
		Reporter.log("<p>Video name is displaying in watch page." + videoName);

	}

	/**
	 * Verify video description is displaying in watch page.
	 */
	@Test(description = "Step 10: Verify video description is displaying in watch page.", priority = 10)
	public void Step10_VerifyVideoDescription() throws Exception {

		// Verifying the video description is displaying in watch page
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageVideoDescription_XPATH")), driver),
				"Video description is not displaying in watch page.");

		log.info("Video description is displaying in watch page.\n");
		Reporter.log("<p>Video description is displaying in watch page.");

		// Getting video description and assigning to variable
		String videoDescription = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("watchPageVideoDescription_XPATH")))
				.getText();

		log.info("Video description is displaying in watch page."
				+ videoDescription + "\n");
		Reporter.log("<p>Video description is displaying in watch page."
				+ videoDescription);

	}

	/**
	 * Verify video description expand icon is displaying in watch page.
	 */
	@Test(description = "Step 11: Verify video description expand icon is displaying in watch page.", priority = 11)
	public void Step11_VerifyVideoDescriptionExpandIcon() throws Exception {

		// Verifying the video description expand icon in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageVideoDescriptionExpandIcon_XPATH")),
				driver),
				"Video description expand icon is not displaying in watch page..");

		log.info("Video description expand icon is displaying in watch page.\n");
		Reporter.log("<p>Video description expand icon is displaying in watch page.");

	}

	/**
	 * Verify follow button is present in watch page.
	 */
	@Test(description = "Step 12: Verify follow button is present in watch page..", priority = 12)
	public void Step12_VerifyFollowButton() throws Exception {

		// Verifying the follow button is displaying in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageFollowButton_XPATH")), driver),
				"Follow button is not present in watch page.");

		log.info("Follow button is present in watch page.\n");
		Reporter.log("<p>Follow button is present in watch page.");

	}

	/**
	 * Verify GET TO KNOW THE SHOW section is present in watch page.
	 */
	@Test(description = "Step 13: Verify GET TO KNOW THE SHOW section is present in watch page.", priority = 13)
	public void Step13_VerifyGetToKnowShowSectionInWatchPage()
			throws Exception {

		// Mouse hover on GET TO KNOW THE SHOW section in watch page.
		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("watchPageGetToKnowTheShowSection_XPATH"))));
		Thread.sleep(2500);

		// Verifying the GET TO KNOW THE SHOW section is displaying in watch page.
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageGetToKnowTheShowSection_XPATH")),
						driver),
				"GET TO KNOW THE SHOW section is not present in watch page below the social sharing option.");

		log.info("GET TO KNOW THE SHOW section is present in watch page below the social sharing option.\n");
		Reporter.log("<p>GET TO KNOW THE SHOW section is present in watch page below the social sharing option.");

	}

	/**
	 * Verify WHAT WE’RE WATCHING section is present in watch page.
	 */
	@Test(description = "Step 14: Verify WHAT WE’RE WATCHING section is present in watch page.", priority = 14)
	public void Step14_VerifyWhatWeAreWatchingSectionInWatchPage()
			throws Exception {
		// Mouse hover on WHAT WE’RE WATCHING section in watch page.
		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("watchPageWhatWeAreWatchingSection_XPATH"))));
		
		Thread.sleep(2500);

		// Verifying the follow button is displaying in watch page.
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageWhatWeAreWatchingSection_XPATH")),
						driver),
				"WHAT WE’RE WATCHING section is not present in watch page below the GET TO KNOW THE SHOW section..");

		log.info("WHAT WE’RE WATCHING section is present in watch page below the GET TO KNOW THE SHOW section.\n");
		Reporter.log("<p>WHAT WE’RE WATCHING section is present in watch page below the GET TO KNOW THE SHOW section.");

	}

	/**
	 * Verify Watch Today’s Playlists button is present in watch page.
	 */
	@Test(description = "Step 15: Verify Watch Today’s Playlists button is present in watch page.", priority = 15)
	public void Step15_VerifyWatchTodaysPlaylistButton() throws Exception {
		// Mouse hover on Watch Today’s Playlists button in watch page.
		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("watchPageWatchTodaysPlaylistsButton_XPATH"))));
		
		Thread.sleep(2500);

		// Verifying the Watch Today’s Playlists button is displaying in watch
		// page.
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageWatchTodaysPlaylistsButton_XPATH")),
						driver),
				"Watch Today’s Playlists button is not present in watch page below the WHAT WE’RE WATCHING section.");

		log.info("Watch Today’s Playlists button is present in watch page below the WHAT WE’RE WATCHING section.\n");
		Reporter.log("<p>Watch Today’s Playlists button is present in watch page below the WHAT WE’RE WATCHING section.");

	}

}
