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
 * @author Manoj.Paragen 
 * Description: This test script verifies the elapsed time is increasing while playing video which is present in video control. 
 * The Show Section from watch page.
 * Created on 23-November-2016 
 * Last updated on 23-November-2016
 * 
 */

public class VerifyElapsedTimeIncreasingWhilePlayingVideo extends BaseTest {

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
	 * Mouse over the player.
	 */
	@Test(description = "Step 4: Mouse over the player.", priority = 4)
	public void Step04_MouseOverVideoPlayer() throws Exception {

		// Mouse over the player.
		CustomFun.mouseOverVideoPlayer(driver);

		// Verify video controls displayed

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageUpNextVidoControler_XPATH")), driver),
				"Video control is not displayed.");

		log.info("Video control is displayed.\n");
		Reporter.log("<p>Video control is displayed.");

	}

	/**
	 * Verify video elapsed time is display
	 */
	@Test(description = "Step 5: Verify video elapsed time is displaying in video control", priority = 5)
	public void Step05_VerifyVideoElapsedTimeInVideoControl() throws Exception {

		// Verify video elapsed time is displaying
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("vidoControlerVideoElapsedTime_XPATH")), driver),
				"Video elapsed time is not displaying in video control.");

		log.info("Video elapsed time is displaying in video control.\n");
		Reporter.log("<p>Video elapsed time is displaying in video control.");

	}

	/**
	 * Verify elapsed time is increasing while playing video.
	 */
	@Test(description = "Step 6: Verify elapsed time is increasing while playing video.", priority = 6)
	public void Step06_VerifyElapsedTimeIncreasingDuringPlay() throws Exception {

		// Verify elapsed time is increasing
		String elapsedTimeAfterStartOfPlay = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("vidoControlerVideoElapsedTime_XPATH")))
				.getText();
		
		log.info("Elapsed Time After Start Of Play: " + elapsedTimeAfterStartOfPlay + "\n");
		Reporter.log("<p>Elapsed Time After Start Of Play: " + elapsedTimeAfterStartOfPlay);

		Thread.sleep(20000);
		// Mouse over the player.
		CustomFun.mouseOverVideoPlayer(driver);

		String elapsedTimeAfterSomeTimeStartOfPlay = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("vidoControlerVideoElapsedTime_XPATH")))
				.getText();
		
		log.info("Elapsed Time After 20000 MS Start Of Play: "
				+ elapsedTimeAfterSomeTimeStartOfPlay + "\n");
		Reporter.log("<p>Elapsed Time After 20000 MS Start Of Play: "
				+ elapsedTimeAfterSomeTimeStartOfPlay);

		Assert.assertNotEquals(elapsedTimeAfterSomeTimeStartOfPlay, elapsedTimeAfterStartOfPlay, 
				"Elapsed time is not increasing while playing video.");

		log.info("Elapsed time is increasing while playing video.\n");
		Reporter.log("<p>Elapsed time is increasing while playing video.");

	}

	

}
