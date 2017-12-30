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
 * Description: This test script verifies the metadata content of up-next video drawer section in watch page.
 *Created on 24-November-2016 
 *Last updated on 24-November-2016
 * 
 */

public class VerifyUpNextDrawerMetadataContent extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
	boolean moreInfoIconPresent = false;

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

		String videoTitle = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("homePageFirstVideoTitle_XPATH")))
				.getText();

		log.info("Successfully navigate to watch page by clicking on title - "
				+ videoTitle + "\n");
		Reporter.log("<p>Successfully navigate to watch page by clicking on title - "
				+ videoTitle);

		log.info("Successfully navigate to watch page.\n");
		Reporter.log("<p>Successfully navigate to watch page.");
	}

	/**
	 * Verify up-next video drawer section is present in watch page.
	 */
	@Test(description = "Step 4: Verify up-next video drawer section is present in watch page.", priority = 4)
	public void Step04_VerifyUpNextVideoDrawerSection() throws Exception {

		// Verifying the up-next video drawer section is present in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageUpNextVidoSection_XPATH")), driver),
				"Up-next video drawer section is not present in watch page.");

		log.info("Up-next video drawer section is present in watch page.\n");
		Reporter.log("<p>Up-next video drawer section is present in watch page.");

	}

	/**
	 * Verify Show/Playlist name is displaying in up-next video drawer metadata
	 * section.
	 */
	@Test(description = "Step 5: Verify Show/Playlist name is displaying in up-next video drawer metadata section.", priority = 5)
	public void Step05_VerifyShowPlaylistNameDisplaying() throws Exception {

		// Verifying Show/Playlist name is displaying
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionShowPlaylistTitle_XPATH")),
						driver),
				"Show/Playlist name is not displaying in up-next video drawer metadata section.");

		log.info("Show/Playlist name is displaying in up-next video drawer metadata section.\n");
		Reporter.log("<p>Show/Playlist name is displaying in up-next video drawer metadata section.");

		log.info("The Show/Playlist name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionShowPlaylistTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Show/Playlist name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionShowPlaylistTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify Show/Playlist description is displaying in up-next video drawer
	 * metadata section.
	 */
	@Test(description = "Step 6: Verify Show/Playlist description is displaying in up-next video drawer metadata section.", priority = 6)
	public void Step05_VerifyShowPlaylistDescriptionDisplaying()
			throws Exception {

		// Verifying Show/Playlist description is displaying
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionShowPlaylistDescription_XPATH")),
						driver),
				"Show/Playlist description is not displaying in up-next video drawer metadata section.");

		log.info("Show/Playlist description is displaying in up-next video drawer metadata section.\n");
		Reporter.log("<p>Show/Playlist description is displaying in up-next video drawer metadata section.");

		log.info("The Show/Playlist description displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionShowPlaylistDescription_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Show/Playlist description displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionShowPlaylistDescription_XPATH")))
						.getText());

	}

	/**
	 * Verify more info icon is displaying in up-next video drawer metadata
	 * section.
	 */
	@Test(description = "Step 7: Verify more info icon (3 dots) is displaying in up-next video drawer metadata section.", priority = 7)
	public void Step07_VerifyMoreInfoIconDisplaying() throws Exception {

		// Verify more info icon is displaying

		if (driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionShowPlaylistMoreInfoIcon_XPATH")))
				.isDisplayed()) {

			moreInfoIconPresent = true;

			log.info("More info icon (3 dots) is displaying in up-next video drawer metadata section below the short description.\n");
			Reporter.log("<p>More info icon (3 dots) is displaying in up-next video drawer metadata section below the short description.");
		} else {
			log.info("More info icon (3 dots) is not displaying in up-next video drawer metadata section below the short description.\n");
			Reporter.log("<p>More info icon (3 dots) is not displaying in up-next video drawer metadata section below the short description.");
		}

	}

	/**
	 * Verify video count is displaying in up-next video drawer metadata
	 * section.
	 */
	@Test(description = "Step 8: Verify video count is displaying in up-next video drawer metadata section.", priority = 8)
	public void Step08_VerifyVideoCountDisplaying() throws Exception {

		// Verifying video count is displaying
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageUpNextVidoSectionVideoCount_XPATH")),
				driver),
				"Video count is not displaying in up-next video drawer metadata section.");

		log.info("Video count is displaying in up-next video drawer metadata section.\n");
		Reporter.log("<p>Video count is displaying in up-next video drawer metadata section.");

		log.info("The Video count displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionVideoCount_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Video count displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionVideoCount_XPATH")))
						.getText());

	}

	/**
	 * Verify videos are present in up-next video drawer section
	 */
	@Test(description = "Step 9: Verify videos are present in up-next video drawer section.", priority = 9)
	public void Step09_VerifyVideosArePresentInUpNextVideoDrawerSection()
			throws Exception {
		// Getting number videos present under up-next video drawer section

		int videosCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionVideoImg_XPATH")))
				.size();

		Assert.assertTrue(videosCount > 0,
				"Videos are not present in up-next video drawer section");

		log.info("Videos are present in up-next video drawer section.\n");
		Reporter.log("<p>Videos are present in up-next video drawer section.");

	}
	
}
