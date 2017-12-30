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
 * Description: This test script verifies navigating to show page from video overlay when play is paused. 
 * The Show Section from watch page.
 * Created on 23-November-2016 
 * Last updated on 23-November-2016
 * 
 */

public class VerifyNavigatingToShowPageFromVideoOverlay extends BaseTest {

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
	 * Click on pause button from video control.
	 */
	@Test(description = "Step 5: Click on pause button from video control.", priority = 5)
	public void Step05_ClickOnPauseButton() throws Exception {

		// Click on pause button
		watchPage.clickOnPauseButton();

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
	 * Verify show logo is displaying in video overlay.
	 */
	@Test(description = "Step 6: Verify show logo is displaying in video overlay.", priority = 6)
	public void Step06_VerifyShowLogoDisplaying() throws Exception {

		// Verify show logo is displaying in video overlay.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageVideoOverlayShowImg_XPATH")), driver),
				"Show logo is not displaying in video overlay.");

		log.info("Show logo is displaying in video overlay.\n");
		Reporter.log("<p>Show logo is displaying in video overlay.");

	}

	/**
	 * Click on show logo from video overlay.
	 */
	@Test(description = "Step 7: Click on show logo from video overlay.", priority = 7)
	public void Step07_ClickOnShowLogoFromVideoOverlay() throws Exception {

		// Click on show logo from video overlay.

		watchPage.clickOnShowLogoFromVideoOverlay();

		log.info("Successfully navigate to show page.\n");
		Reporter.log("<p>Successfully navigate to show page.");

	}

}
