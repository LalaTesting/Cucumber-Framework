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
 * Description: This test script verifies the lazy loading functionality of videos in up-next drawer section in watch page
 *Created on 23-November-2016 
 *Last updated on 23-November-2016
 * 
 */

public class VerifyUpNextDrawerVideosLazyLoadingFunctionality extends BaseTest {

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
	 * Verify videos are present in up-next video drawer section
	 */
	@Test(description = "Step 5: Verify videos are present in up-next video drawer section.", priority = 5)
	public void Step05_VerifyVideosArePresentInUpNextVideoDrawerSection()
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

	/**
	 * Scroll down through the video section in up-next video drawer section.
	 */
	@Test(description = "Step 6: Scroll down through the video section in up-next video drawer section.", priority = 6)
	public void Step06_VerifyVideosForLazyLoading() throws Exception {
		// Getting number of videos present before scroll down
		int videosCountBeforeScrollDown = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionVideoImg_XPATH")))
				.size();

		log.info("Videos Count Before Scroll Down: "
				+ videosCountBeforeScrollDown + "\n");

		// Scrolling down in Up-next video section
		watchPage.scrollDownInUpNextVideoSection();

		// Getting number of videos present After scroll down
		int videosCountAfterScrollDown = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSectionVideoImg_XPATH")))
				.size();

		log.info("Video Count After Scroll Down: " + videosCountAfterScrollDown
				+ "\n");

		// Verifying more videos are not loaded on scrolling down
		Assert.assertTrue(
				videosCountAfterScrollDown > videosCountBeforeScrollDown,
				"More videos are not loaded on scrolling down.");

		log.info("More videos are loaded on scrolling down.\n");
		Reporter.log("<p>More videos are loaded on scrolling down.");

	}

}
