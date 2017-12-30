package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies navigating to watch page from what we are watching section home page 
 *Created on 27-September-2016 
 *Last updated on 27-September-2016
 * 
 */

public class VerifyNavigatingToWatchPageFromWhatWeAreWatchingSection extends
		BaseTest {

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

		// Move to WHAT WE’RE WATCHING section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageWhatWeAreWatchingSection_XPATH"))));

		// Verify WHAT WE’RE WATCHING section

		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageWhatWeAreWatchingSection_XPATH")),
						driver),
				"WHAT WE’RE WATCHING section is not present in home page.");

		log.info("WHAT WE’RE WATCHING section is present in home page.\n");
		Reporter.log("<p>WHAT WE’RE WATCHING section is present in home page.");

	}

	/**
	 * Verify videos are present in WHAT WE’RE WATCHING section
	 */
	@Test(description = "Step 3: Verify videos are present in WHAT WE’RE WATCHING section in home page.", priority = 3)
	public void Step06_VerifyVideoPresentInWhatWeAreWatchingSection()
			throws Exception {

		// Verify video present in WHAT WE’RE WATCHING section

		int videoCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("homePageVideoLogoImage_XPATH"))).size();

		Assert.assertTrue(videoCount > 0,
				"Videos are not present in WHAT WE’RE WATCHING section");

		log.info("Videos are present in WHAT WE’RE WATCHING section in home page.\n");
		Reporter.log("<p>Videos are present in WHAT WE’RE WATCHING section in home page.");

	}

	/**
	 * Click on first video Title
	 */
	@Test(description = "Step 4: Click on first video Title from what we are watching section.", priority = 4)
	public void Step04_ClickOnTodayPlaylistButton() throws Exception {

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
}
