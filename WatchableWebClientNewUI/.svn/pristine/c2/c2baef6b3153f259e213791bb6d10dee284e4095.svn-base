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


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies the lazy loading functionality of shows in browse shows page. 
 *Created on 01-November-2016 
 *Last updated on 01-November-2016
 * 
 */

public class VerifyLazyLoadingFunctionalityOfShows extends BaseTest {

	static HomePage homePage;
	static BrowseShowsPage browseShowsPage;

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
	 * Scroll down through page down
	 */
	@Test(description = "Step 5: Scroll down from through the page and verify more show rows are loading.", priority = 5)
	public void Step05_VerifyLazyLoadingOfVideos() throws Exception {

		int showCountBeofreScrollDown = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("browseShowsPageShowImage_XPATH"))).size();

		log.info("Video Count Before Scroll Down: " + showCountBeofreScrollDown
				+ "\n");

		// Scroll down through shows section to load more shows

		browseShowsPage.scrollDownThroughShowSection();

		int showCountAfterScrollDown = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("browseShowsPageShowImage_XPATH"))).size();

		log.info("Video Count After Scroll Down: " + showCountAfterScrollDown
				+ "\n");

		// Verifying more videos are not loaded on scrolling down
		Assert.assertTrue(showCountAfterScrollDown > showCountBeofreScrollDown,
				"More videos are not loaded on scrolling down.");

		log.info("More videos are loaded on scrolling down.\n");
		Reporter.log("<pMore videos are loaded on scrolling down.");

	}

}
