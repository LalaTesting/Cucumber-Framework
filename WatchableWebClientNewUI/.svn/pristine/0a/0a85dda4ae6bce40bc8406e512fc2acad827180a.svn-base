package comcast.test.watchpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.HomePage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies the functionality of pause and play button present in video player. 
 * The Show Section from watch page.
 * Created on 23-November-2016 
 * Last updated on 23-November-2016
 * 
 */

public class VerifyPausePlayFunctionalityfromVideoPlayer extends BaseTest {

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
	 * Click on video player.
	 */
	@Test(description = "Step 4: Click on video player..", priority = 4)
	public void Step04_ClickOnVideoPlayer() throws Exception {

		// Click on video player.
		watchPage.clickOnVideoPlayer();

		// Video overlay metadata is displayed when play is paused
		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoOverlay_XPATH")))
						.isDisplayed(),
				"Video overlay metadata is not displayed when video got paused.");

		log.info("Video overlay metadata is displayed when video got paused.\n");
		Reporter.log("<p>Video overlay metadata is displayed when video got paused.");

	}

	/**
	 * Click on video player again.
	 */
	@Test(description = "Step 5: Click on video player..", priority = 5)
	public void Step05_ClickOnVideoPlayerAgain() throws Exception {

		// Click on video player again.
		watchPage.clickOnVideoPlayer();

		// Video overlay metadata is hidden when play is started again
		Assert.assertFalse(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoOverlay_XPATH")))
						.isDisplayed(),
				"Video overlay metadata is not hidden when video play again.");

		log.info("Video overlay metadata is hidden when video got play again.\n");
		Reporter.log("<p>Video overlay metadata is hidden when video play again.");

	}

}
