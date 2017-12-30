package comcast.test.watchpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.HomePage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: test script verifies page title is displaying for watch page and title content.
 * Created on 22-November-2016 
 * Last updated on 22-November-2016
 * 
 */

public class VerifyWatchPageTitle extends BaseTest {

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

		// Verify WHAT WE’RE WATCHING section

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
	 * Verify watch page title.
	 */
	@Test(description = "Step 4: Verify title is displaying for watch page.", priority = 4)
	public void Step04_VerifyWatchPageTitle() throws Exception {

		// Verify watch page title.

		String pageTitle = driver.getTitle();

		Assert.assertNotNull(pageTitle,
				"Page title is not present for watch page");

		log.info("Page title is present for watch page.\n");
		Reporter.log("<p>Page title is present for watch page");

		log.info("Watch Page title displayed is: " + pageTitle
				+ " \n");
		Reporter.log("<p>Watch Page title displayed is: "
				+ pageTitle);

	}

}
