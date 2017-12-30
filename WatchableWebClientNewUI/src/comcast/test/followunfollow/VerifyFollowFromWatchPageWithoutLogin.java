package comcast.test.followunfollow;

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
 * Description: This test script verifies display of login pop-up when user tries to do follow functionality from the follow button present in video metadata section of 
 * watch page without login. 
 *Created on 29-November-2016 
 *Last updated on 29-November-2016
 * 
 */

public class VerifyFollowFromWatchPageWithoutLogin extends BaseTest {

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
	 * Verify follow button is present in watch page.
	 */
	@Test(description = "Step 4: Verify follow button is present in watch page..", priority = 4)
	public void Step04_VerifyFollowButton() throws Exception {

		// Move to follow button section
		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH"))));

		// Verifying the follow button is displaying in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageFollowButton_XPATH")), driver),
				"Follow button is not present in watch page in video metadata section.");

		log.info("Follow button is present in watch page in video metadata section.\n");
		Reporter.log("<p>Follow button is present in watch page in video metadata section.");

	}

	/**
	 * Click on follow button.
	 */
	@Test(description = "Step 5: Click on follow button.", priority = 5)
	public void Step05_ClickOnFollowButton() throws Exception {

		// Click on follow button.

		watchPage.clickOnVideoMetadataFollowButton();

		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp.getProperty("loginForm_XPATH")))
						.isDisplayed(),
				"Login pop-up is not displayed after clicking on Follow button without login.");

		log.info("Login pop-up is displayed after clicking on Follow button without login.\n");
		Reporter.log("<p>Login pop-up is displayed after clicking on Follow button without login.");

	}
}
