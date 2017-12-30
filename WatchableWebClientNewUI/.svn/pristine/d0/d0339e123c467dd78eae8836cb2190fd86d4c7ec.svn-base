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
 * Description: This test script verifies the functionality of handle icon present in up-next drawer section.
 *Created on 24-November-2016 
 *Last updated on 24-November-2016
 * 
 */

public class VerifyUpNextDrawerHandleIcon extends BaseTest {

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
	 * Verify handle icon is displaying in up-next video drawer section.
	 */
	@Test(description = "Step 5: Verify handle icon is displaying in up-next video drawer section.", priority = 5)
	public void Step05_VerifyHandleIconDisplaying() throws Exception {

		// Verify handle icon is displaying
		Assert.assertTrue(CustomFun.isElementPresent(By.id(ObjRepoProp
				.getProperty("watchPageUpNextVideoSectionDrawerHandle_ID")),
				driver),
				"Handle icon is not displaying in up-next video drawer section.");

		log.info("Handle icon is displaying in up-next video drawer section.\n");
		Reporter.log("<p>Handle icon is displaying in up-next video drawer section.");
	}

	/**
	 * Click on handle icon.
	 */
	@Test(description = "Step 6: Click on handle icon.", priority = 6)
	public void Step06_ClickOnHandleIcon() throws Exception {

		// Click on handle icon.
		watchPage.clickOnHandleIcon();

		Assert.assertFalse(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSection_XPATH")))
						.isDisplayed(),
				"Up-next video drawer section not got hidden after clicking on Handle icon.");

		log.info("Up-next video drawer section got hidden after clicking on Handle icon.\n");
		Reporter.log("<p>Up-next video drawer section got hidden after clicking on Handle icon.");
	}

	/**
	 * Click on handle again icon.
	 */
	@Test(description = "Step 7: Click on again handle icon.", priority = 7)
	public void Step07_ClickOnAgainHandleIcon() throws Exception {

		// Click on again handle icon.
		watchPage.clickOnHandleIcon();

		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageUpNextVidoSection_XPATH")))
						.isDisplayed(),
				"Up-next video drawer section not displayed after clicking on again Handle icon.");

		log.info("Up-next video drawer section displayed after clicking on again Handle icon.\n");
		Reporter.log("<p>Up-next video drawer section displayed after clicking on again Handle icon.");
	}

}
