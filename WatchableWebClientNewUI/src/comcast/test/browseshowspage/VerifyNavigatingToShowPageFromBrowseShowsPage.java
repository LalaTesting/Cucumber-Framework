package comcast.test.browseshowspage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.BrowseShowsPage;
import comcast.pages.HomePage;
import comcast.pages.ShowPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies navigating to shows page from browse shows page 
 * by clicking on first show image. 
 *Created on 27-October-2016 
 *Last updated on 27-October-2016
 * 
 */

public class VerifyNavigatingToShowPageFromBrowseShowsPage extends BaseTest {

	static HomePage homePage;
	static BrowseShowsPage browseShowsPage;
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
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 2: Click on the hamburger menu.", priority = 2)
	public void Step02_ClickOnHamburgerMenu() throws Exception {

		// Click on the hamburger menu.
		homePage.clickOnHamburgerMenu();

		// Verify menu items are displayed
		Assertions.verifyMenuItemsDisplayed(driver);

	}

	/**
	 * Verify BROWSE SHOWS menu.
	 */
	@Test(description = "Step 3: Verify BROWSE SHOWS menu item present in header section.", priority = 3)
	public void Step03_VerifyBrowseShowsMenu() throws Exception {

		// Verify presence of BROWSE SHOWS menu.
		Assertions.verifyBrowseShowsMenu(driver);
	}

	/**
	 * Click on browse shows menu item
	 */
	@Test(description = "Step 4: Click on browse shows menu item.", priority = 4)
	public void Step04_ClickOnbrowseShowsMenu() throws Exception {

		// Click on browse shows menu.
		browseShowsPage = homePage.clickOnBrowseShowsMenu();

		log.info("Successfully navigated to Browse Shows page.\n");
		Reporter.log("<p>Successfully navigated to Browse Shows page.");

	}

	/**
	 * Verify show are present under genre
	 */
	@Test(description = "Step 5: Verify show are present under genre.", priority = 5)
	public void Step05_VerifyShowPresenUnderGenre() throws Exception {

		// VVerify show are present

		int showCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("browseShowsPageShowImage_XPATH"))).size();

		log.info("showCount: " + showCount);

		Assert.assertTrue(showCount > 0,
				"Sows are present not under genre in browse shows page");

		log.info("Sows are present under genre in browse shows page\n");
		Reporter.log("<p>Sows are present under genre in browse shows page");

	}

	/**
	 * Click on first show image.
	 */
	@Test(description = "Step 6: Click on first show image.", priority = 6)
	public void Step06_ClickOnFirstShowsImage() throws Exception {

		// Click on first show image.
		showPage = browseShowsPage.clickOnBrowseShowsMenu();

		log.info("Successfully navigated to Show page.\n");
		Reporter.log("<p>Successfully navigated to Show page.");

	}

}
