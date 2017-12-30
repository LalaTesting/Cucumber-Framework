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
 * Description: This test script verifies the functionality of more info icon present in metadata content of up-next drawer section.
 *Created on 24-November-2016 
 *Last updated on 24-November-2016
 * 
 */

public class VerifyUpNextDrawerMoreInfoIcon extends BaseTest {

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
	 * Verify more info icon is displaying in up-next video drawer metadata
	 * section.
	 */
	@Test(description = "Step 5: Verify more info icon (3 dots) is displaying in up-next video drawer metadata section.", priority = 5)
	public void Step05_VerifyMoreInfoIconDisplaying() throws Exception {

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
	 * Click on more info icon.
	 */
	@Test(description = "Step 6: Click on more info icon.", priority = 6)
	public void Step06_ClickOnMoreInfoIcon() throws Exception {

		// Click on more info icon.
		if (moreInfoIconPresent == true) {

			String lengthBeforeClick = driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("watchPageUpNextVidoSectionShowPlaylistDescription_XPATH")))
					.getAttribute("style");
			String[] lengthBefore = lengthBeforeClick.split(";");
			lengthBeforeClick = lengthBefore[0];

			log.info("Description length before clicking more info icon: "
					+ lengthBeforeClick + "\n");
			Reporter.log("<p>Description length before clicking more info icon: "
					+ lengthBeforeClick);

			watchPage.clickOnMoreInfoIcon();

			String lengthAfterClick = driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("watchPageUpNextVidoSectionShowPlaylistDescription_XPATH")))
					.getAttribute("style");

			String[] lengthAfter = lengthAfterClick.split(";");
			lengthAfterClick = lengthAfter[0];

			log.info("Description length after clicking more info icon: "
					+ lengthAfterClick + "\n");
			Reporter.log("<p>Description after before clicking more info icon: "
					+ lengthAfterClick);

			Assert.assertNotEquals(lengthBeforeClick, lengthAfterClick,
					"Short description is not expanded after clicking more info icon.");

			log.info("Short description is expanded after clicking more info icon.\n");
			Reporter.log("<p>Short description is expanded after clicking more info icon.");
		}

	}

}
