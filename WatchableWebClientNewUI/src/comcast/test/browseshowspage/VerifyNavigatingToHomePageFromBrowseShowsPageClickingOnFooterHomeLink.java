package comcast.test.browseshowspage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.BrowseShowsPage;
import comcast.pages.HomePage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies user is navigating back to home page from Browse shows page by clicking on 
 * footer home link.
 *Created on 01-November-2016 
 *Last updated on 01-November-2016
 * 
 */

public class VerifyNavigatingToHomePageFromBrowseShowsPageClickingOnFooterHomeLink
		extends BaseTest {

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
	 * Verify home link is present in the footer
	 */
	@Test(description = "Step 5: Verify home link is present in the footer of the page.", priority = 5)
	public void Step05_VerfiyFooterHomeLink() throws Exception {

		// Move to footer home link
		CustomFun.mouseOverElement(driver,
				driver.findElement(By.xpath(ObjRepoProp
						.getProperty("homePageFooterHomeLink_XPATH"))));
		Thread.sleep(1000);

		// Verify home link is present in the footer

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterHomeLink_XPATH")), driver),
				"Home link is notpresent in the footer of the page.");

		log.info("Home link is present in the footer of the page.\n");
		Reporter.log("<p>Home link is present in the footer of the page.");

	}

	/**
	 * Click on footer home link.
	 */
	@Test(description = "Step 6: Click on home link from footer. ", priority = 6)
	public void Step06_ClickOnFooterHomeLink() throws Exception {

		// Click on footer home link
		homePage = browseShowsPage.clickOnFooterHomeLink();

		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}
}
