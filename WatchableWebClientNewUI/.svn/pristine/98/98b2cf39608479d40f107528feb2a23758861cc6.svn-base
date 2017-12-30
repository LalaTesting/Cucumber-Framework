package comcast.test.showpage;

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

/**
 * 
 * @author karthik.ashoka 
 * Description: This test script verifies the details displaying on a single video (First video) in show page.
 *Created on 14-October-2016 
 *Last updated on 14-October-2016
 * 
 */

public class VerifyDetailsOnSingleVideoInShowPage extends BaseTest {
	
	static HomePage homePage;
	static ShowPage showPage;
	

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
	 * Verify shows are present in GET TO KNOW THE SHOW section in home page
	 */
	@Test(description = "Step 2: Verify shows are present in GET TO KNOW THE SHOW section in home page.", priority = 2)
	public void Step02_VerifyShowsPresentInGetToKnowTheShowSection()
			throws Exception {

		// Move to GET TO KNOW THE SHOW section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageGetToKnowTheShowSection_XPATH"))));

		// Verify shows are present in GET TO KNOW THE SHOW section
		Assertions.verifyShowsPresent(driver);
	}

	/**
	 * Click on any show image from get to know the show section.
	 */
	@Test(description = "Step 3: Click on any show image from get to know the show section.", priority = 3)
	public void Step03_ClickOnShowImage() throws Exception {

		//Assigning the show title to string variable showName
		String showName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("homePageFirstShowTitle_XPATH")))
				.getAttribute("alt");

		// Click on first show image
		showPage = homePage.clickOnFirstShowLogo();

		log.info("Successfully Clicked on the Show: " + showName + "\n");
		Reporter.log("<p>Successfully Clicked on the Show: " + showName);

		log.info("Successfully navigated to Show page.\n");
		Reporter.log("<p>Successfully navigated to Show page.");

	}
	
	/**
	 * Verify videos are present in video section in show page
	 */
	@Test(description = "Step 4: Verify videos are present in video section in show page", priority = 4)
	public void Step04_VerfiyVideosArePresentInShowPage() throws Exception {

		//Verify number of videos are displaying.
		int videoCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("showPageVideoCount_XPATH")))
				.size();
		
		//Verifying whether video count is greater than 0 or not
		Assert.assertTrue(videoCount > 0,
				"Video are not present in video section in show page.");

		log.info("Video are present in video section in show page.\n");
		Reporter.log("<p>Video are present in video section in show page.");
		
	}

	/**
	 * Verify details displaying on a single video in show page.
	 */
	@Test(description = "Step 5: Verify details displaying on a single video in show page.", priority = 5)
	public void Step05_VerifyDetailsDisplayingOnSingleVideo() throws Exception {
			
		
		// Verifying Video Name
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("showPageFirstVideoTitle_XPATH")), driver),
				"Video Name is not present in single video.");
		
		log.info("Video Name is present in single video.\n");
		
		Reporter.log("<p>Video Name is present in single video.");

		log.info("The Video Name  is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Video Name  is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoTitle_XPATH")))
						.getText());

		// Verifying Show Name
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("showPageFirstVideoShowTitle_XPATH")), driver),
				"Show Name is not present in single video.");
		
		log.info("Show Name is present in single video\n");
		
		Reporter.log("<p>Show Name is present in single video");

		log.info("The Show Name  is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoShowTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Show Name  is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoShowTitle_XPATH")))
						.getText());

		// Verifying when video is last updated
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoUpdated_XPATH")),
						driver),
				"Videos last updated days not displaying on video.");
		
		log.info("Videos last updated days displaying on video\n");
		
		Reporter.log("<p>Videos last updated days displaying on video");


		log.info("Last update value: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoUpdated_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Last update value: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoUpdated_XPATH")))
						.getText());

		// Verifying Video Duration/timings
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("showPageFirstVideoDuration_XPATH")), driver),
				"Video Duration/Timings are not displaying");
		
		log.info("Video Duration/Timings are displaying on video\n");
		
		Reporter.log("<p>Video Duration/Timings are displaying on video");

		log.info("The Video Duration is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoDuration_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Video Duration is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFirstVideoDuration_XPATH")))
						.getText());
		
	}
	
}
