package comcast.test.myshowspage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.MyShowsPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies display of login pop-up on clicking My Shows menu from header 
 * if user is not logged into the application.
 * Created on 14-November-2016 
 * Last updated on 14-November-2016
 * 
 */

public class VerifyNavigatingToMyShowsPageWithoutLogin extends BaseTest {

	static HomePage homePage;
	static MyShowsPage myShowsPage;

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
	 * Verify MY SHOWS menu
	 */
	@Test(description = "Step 3: Verify MY SHOWS menu item present in header section.", priority = 3)
	public void Step03_VerifyTodaysPlaylistsMenu() throws Exception {

		// Verify MY SHOWS menu
		Assertions.verifyMyShowstsMenu(driver);
	}

	/**
	 * Click on MY SHOWS menu item
	 */
	@Test(description = "Step 4: Click on MY SHOWS  menu item.", priority = 4)
	public void Step04_ClickOnMyShowsMenu() throws Exception {

		// Click on MY SHOWS menu item
		homePage.clickOnMyShowsMenuWithOutLogin();

		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("loginForm_XPATH")), driver),
				"Login pop-up is not displayed after clicking on My Shows menu without login.");

		log.info("Login pop-up is displayed after clicking on My Shows menu without login.\n");
		Reporter.log("<p>Login pop-up is displayed after clicking on My Shows menu without login.");

	}

}
