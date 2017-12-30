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
 * @author karthik.ashoka Description: This test script verifies the
 *         functionality of the expand icon present at the right end of video
 *         description in watch page Created on 25-November-2016 Last updated on
 *         25-November-2016
 * 
 */

public class VerifyVideoDescriptionExpandIconFunctionality extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
	boolean descriptionExpandIcon = false;

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
	 * Verify video description expand icon is displaying in watch page in video
	 * metadata section..
	 */
	@Test(description = "Step 4: Verify video description expand icon is displaying in watch page in video metadata section.", priority = 4)
	public void Step04_VerifyVideoDescriptionExpandIcon() throws Exception {

		if (driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoDescriptionExpandIcon_XPATH")))
				.isDisplayed()) {
			descriptionExpandIcon = true;
			log.info("Video description expand icon is displaying in watch page.\n");
			Reporter.log("<p>Video description expand icon is displaying in watch page.");
		}

		else {
			log.info("Video description expand icon is not displaying in watch page.\n");
			Reporter.log("<p>Video description expand icon is not displaying in watch page.");
		}

	}

	/**
	 * Click on expand icon.
	 */
	@Test(description = "Step 5: Click on expand icon.", priority = 5)
	public void Step05_ClickOnExpandIcon() throws Exception {

		if (descriptionExpandIcon == true)

		{
			// click on video description expand icon
			watchPage.clickOnVideoDescriptionExpandIcon();

			// verifying the Description Collapse icon
			Assert.assertTrue(
					CustomFun.isElementPresent(
							By.xpath(ObjRepoProp
									.getProperty("watchPageVideoDescriptionCollapseIcon_XPATH")),
							driver),
					"Description Collapse icon not displaying.");

			log.info("More video details are displayed.\n");
			Reporter.log("<p>More video details are displayed.");

		}

	}

}
