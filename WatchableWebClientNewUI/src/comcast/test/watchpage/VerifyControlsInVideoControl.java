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
 * Description: This test script verifies the controls which are present in video control. 
 *Created on 18-November-2016 
 *Last updated on 19-November-2016
 * 
 */

public class VerifyControlsInVideoControl extends BaseTest
{

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
	 * Verify videos are present in WHAT WE�RE WATCHING section
	 */
	@Test(description = "Step 2: Verify WHAT WE�RE WATCHING section is present in home page.", priority = 2)
	public void Step02_VerifyWhatWeAreWatchingSection() throws Exception {

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
	@Test(description = "Step 4: Verify WHAT WE�RE WATCHING section is present in home page.", priority = 4)
	public void Step04_MouseOverVideoPlayer() throws Exception {

		// Mouse over the player.
				CustomFun.mouseOverVideoPlayer(driver);		
		// Verify video controls displayed

		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoControler_XPATH")),
						driver),
				"Video control is not displayed.");

		log.info("Video control is displayed.\n");
		Reporter.log("<p>Video control is displayed.");

	}
	
	
	/**
	 * Verify pause button is present
	 */
	@Test(description = "Step 5: Verify pause button is present in video control.", priority = 5)
	public void Step05_VerifyPauseButtonInVideoControl() throws Exception {

		//Verify pause button is present
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("vidoControlerPauseIcon_XPATH")),
						driver),
				"Pause button is not present in video control.");

		log.info("Pause button is present in video control.\n");
		Reporter.log("<p>Pause button is present in video control.");

	}
	
	
	/**
	 * Verify Volume  button is present
	 */
	@Test(description = "Step 6: Verify Volume  off button is present in video control.", priority = 6)
	public void Step06_VerifyVolumeButtonInVideoControl() throws Exception {

		//Verify Volume  button is present
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("vidoControlerVolumeMuteIcon_XPATH")),
						driver),
				"Volume  button is not present in video control.");

		log.info("Volume button is present in video control.\n");
		Reporter.log("<p>Volume button is present in video control.");

	}
	
	
	/**
	 * Verify video elapsed time is display
	 */
	@Test(description = "Step 7: Verify video elapsed time is displaying in video control", priority = 7)
	public void Step07_VerifyVideoElapsedTimeInVideoControl() throws Exception {

		//Verify video elapsed time is displaying
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("vidoControlerVideoElapsedTime_XPATH")),
						driver),
				"Video elapsed time is not displaying in video control.");

		log.info("Video elapsed time is displaying in video control.\n");
		Reporter.log("<p>Video elapsed time is displaying in video control.");

	}

	
	/**
	 * Verify video progress bar is present
	 */
	@Test(description = "Step 8: Verify video progress bar is present in video control.", priority = 8)
	public void Step08_VerifyVideoProgressBarInVideoControl() throws Exception {

		//Verify video elapsed time is displaying
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("vidoControlerVideoProgressBar_XPATH")),
						driver),
				"Video progress bar is not present in video control.");

		log.info("Video progress bar is present in video control.\n");
		Reporter.log("<p>Video progress bar is present in video control.");

	}
	
	
	/**
	 * Verify video total duration is displaying
	 */
	@Test(description = "Step 9: Verify video total duration is displaying in video control.", priority = 9)
	public void Step09_VerifyVideoTotalDurationInVideoControl() throws Exception {

		//Verify video total duration is displaying
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("vidoControlerVideoTotalDuration_XPATH")),
						driver),
				"Video total duration is not displaying in video control.");

		log.info("Video total duration is displaying in video control.\n");
		Reporter.log("<p>Video total duration is displaying in video control.");

	}

	
	

	/**
	 * Verify full screen button is present
	 */
	@Test(description = "Step 10: Verify full screen button is present in video control.", priority = 10)
	public void Step10_VerifyFullScreenButtonInVideoControl() throws Exception {

		//Verify full screen button is present 
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("vidoControlerFullScreeIcon_XPATH")),
						driver),
				"Full screen button is not present in video control");

		log.info("Full screen button is present in video control.\n");
		Reporter.log("<p>Full screen button is present in video control.");

	}


}
