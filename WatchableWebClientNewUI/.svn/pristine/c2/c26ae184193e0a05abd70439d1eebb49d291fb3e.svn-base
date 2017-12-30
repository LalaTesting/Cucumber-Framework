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
import comcast.pages.ShowPage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies navigation to show page from video metadata section from watch page. 
 *Created on 18-November-2016 
 *Last updated on 19-November-2016
 * 
 */

public class VerifyNavigatingToShowPageFromVideoMetadataSection extends
		BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
	static ShowPage showPage;

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

		// Verify video show name is displaying

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageVideoShowTitle_XPATH")), driver),
				"Video show name is not displaying in video metadata section.");

		log.info("Video show name is displaying in video metadata section.\n");
		Reporter.log("<p>Video show name is displaying in video metadata section.");

	}

	/**
	 * Click on video show name.
	 */
	@Test(description = "Step 5: Click on video show name.", priority = 5)
	public void Step05_ClickOnFirstShowImage() throws Exception {

		// Click on video show name.
		showPage = watchPage.clickOnShowTitle();

		log.info("Successfully navigate to show page.\n");
		Reporter.log("<p>Successfully navigate to show page.");

	}
}
