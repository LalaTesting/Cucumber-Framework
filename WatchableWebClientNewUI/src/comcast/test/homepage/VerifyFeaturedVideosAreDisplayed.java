package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;


/**
 * 
 *@author Karthik.Ashoka 
 * Description: This test script verifies videos are present in what we are watching section in home page. 
 *Created on 28-September-2016 
 *Last updated on 29-September-2016
 *Reviewed by: Manoj
 */

public class VerifyFeaturedVideosAreDisplayed extends BaseTest {

	static HomePage homePage;

	/**
	 * Open the browser, Enter the Watchable URL
	 */
	@Test(description = "Step 1: Open the browser, Enter the Watchable URL", priority = 1)
	public void Step01_NavigeteToURL() throws Exception {

		// Navigates to Watchable application URL
		homePage = HomePage.navigateToWatchableHomePage(driver, baseUrl);

		log.info("Successfully navigated to Watchable web client Home page.\n");
		Reporter.log("<p>Successfully navigated to Watchable web client Home page.</p>");

	}

	/**
	 * Verify WHAT WE’RE WATCHING section is present in home page.
	 */
	@Test(description = "Step 2: Verify WHAT WE’RE WATCHING section is present in home page.", priority = 2)
	public void Step02_VerifyWhatWeAreWatchingSection() throws Exception {

		// Mouse hover on WhatWeAreWatchingSection
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
	 * Verify heading is displaying for WHAT WE’RE WATCHING section.
	 */
	@Test(description = "Step 3: Verify heading is displaying for WHAT WE’RE WATCHING section.", priority = 3)
	public void Step03_VerifyHeadingOfWhatWeAreWatchingSection()
			throws Exception {

		// Verifying WHAT WE’RE WATCHING section Heading
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageVideoSectionTitle_XPATH")), driver),
				"Heading is not displaying for WHAT WE’RE WATCHING section.");

		log.info("The heading  is displaying for what we are watching section and the heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageVideoSectionTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The heading  is displaying for what we are watching section and the heading displayed is:  "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageVideoSectionTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify videos are present in WHAT WE’RE WATCHING section in home page
	 */
	@Test(description = "Step 4: Verify videos are present in WHAT WE’RE WATCHING section in home page.", priority = 4)
	public void Step04_VerifyVideosArePresentInWhatWeAreWatchingSection()
			throws Exception {

		// Verifying the videos are displaying under WHAT WE’RE WATCHING section
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageVideoLogoImage_XPATH")), driver),
				"video are not present in WHAT WE’RE WATCHING section.");

		log.info("video are present in WHAT WE’RE WATCHING section.\n");
		Reporter.log("<p>video are present in WHAT WE’RE WATCHING section.");

		// Assigning videocount for Integer
		int videoCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("homePageVideoLogoImage_XPATH"))).size();

		// Verifying for Video count which is greater than zero
		Assert.assertTrue(videoCount > 0,
				"videos not present in WHAT WE’RE WATCHING section.");
		log.info(videoCount
				+ "  videos are present in WHAT WE’RE WATCHING section.\n");
		Reporter.log(videoCount
				+ "  videos are present in WHAT WE’RE WATCHING section.\n");

	}

	/**
	 * Verify the details displaying on a single video in what we are watching
	 * section.
	 */
	@Test(description = "Step 5: Verify the details displaying on a single video in what we are watching section.", priority = 5)
	public void Step05_VerifyDetailsDisplayingForSingleVideo() throws Exception {

		// Verifying Video Name
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFirstVideoTitle_XPATH")), driver),
				"Video Name is not present in single video.");

		log.info("The Video Name  is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Video Name  is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoTitle_XPATH")))
						.getText());

		// Verifying Show Name
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFirstVideoShowTitle_XPATH")), driver),
				"Show Name is not present in single video.");

		log.info("The Show Name  is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoShowTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Show Name  is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoShowTitle_XPATH")))
						.getText());

		// Verifying when video is last updated
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoLastUpdateInfo_XPATH")),
						driver),
				"Video time/days last updated is not displaying on video.");

		log.info("The Video Updated On: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoLastUpdateInfo_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Video Updated On: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoLastUpdateInfo_XPATH")))
						.getText());

		// Verifying Video Duration/timings
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFirstVideoDuration_XPATH")), driver),
				"Video Duration/Timings are not displaying");

		log.info("The Video Duration is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoDuration_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Video Duration is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoDuration_XPATH")))
						.getText());

	}
}
