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
 * Description: This test script verifies logout the video metadata details displaying in watch page below the player 
 *Created on 24-November-2016 
 *Last updated on 24-November-2016
 * 
 */

public class VerifyVideoDetailsInVideoMetadataSection extends BaseTest {

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
	 * Verify video show name is displaying in video metadata section.
	 */
	@Test(description = "Step 4: Verify video show name is displaying in video metadata section.", priority = 4)
	public void Step04_VerifyVideoShowNameDisplaying() throws Exception {

		// Move to video metadata section
		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH"))));

		Thread.sleep(2500);
		// Verify video show name is displaying

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageVideoShowTitle_XPATH")), driver),
				"Video show name is not displaying in video metadata section.");

		log.info("Video show name is displaying in video metadata section.\n");
		Reporter.log("<p>Video show name is displaying in video metadata section.");

		log.info("The Video show name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoShowTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Video show name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoShowTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify video name is displaying in video metadata section.
	 */
	@Test(description = "Step 5: Verify video name is displaying in video metadata section.", priority = 5)
	public void Step05_VerifyVideoNameDisplaying() throws Exception {

		// Verify video name is displaying

		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("watchPageVideoTitle_XPATH")),
				driver),
				"Video name is not displaying in video metadata section.");

		log.info("Video name is displaying in video metadata section.\n");
		Reporter.log("<p>Video name is displaying in video metadata section.");

		log.info("The Video name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Video name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify video description is displaying in video metadata section.
	 */
	@Test(description = "Step 6: Verify video description is displaying in video metadata section.", priority = 6)
	public void Step05_VerifyVideoDescriptionDisplaying() throws Exception {

		// Verify video description is displaying

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageVideoDescription_XPATH")), driver),
				"Video description is not displaying in video metadata section.");

		log.info("Video description is displaying in video metadata section.\n");
		Reporter.log("<p>Video description is displaying in video metadata section.");

		log.info("The Video description displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoDescription_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Video description displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoDescription_XPATH")))
						.getText());

	}

}
