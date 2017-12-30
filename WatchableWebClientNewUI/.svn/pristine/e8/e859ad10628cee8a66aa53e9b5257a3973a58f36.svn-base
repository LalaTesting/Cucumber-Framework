package comcast.test.myshowspage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import static comcast.util.PropertyFileReader.TextProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.ShowPage;
import comcast.pages.HomePage;
import comcast.pages.MyShowsPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies navigating to shows page from my shows page when 
 * there are no followed shows by clicking on show (first) image from GET TO KNOW THE SHOW section.
 * Created on 15-November-2016 
 * Last updated on 15-November-2016
 * 
 */

public class VerifyNavigatingToShowsPageFromMyshowsPageWhenNoFollowedShows
		extends BaseTest {

	static HomePage homePage;
	static MyShowsPage myShowsPage;
	static ShowPage showsPage;

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
	 * Login to the application with valid credentials.
	 */
	@Test(description = "Step 2: Login to the application with valid credentials.", priority = 2)
	public void Step02_LoginToApplicationWithValidCredentials()
			throws Exception {

		// Login to application with valid credentials

		String email = TextProp.getProperty("nofollowedshows");
		String pass = TextProp.getProperty("password");

		homePage.loginToWebClient(email, pass);

	}

	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 3: Click on the hamburger menu.", priority = 3)
	public void Step03_ClickOnHamburgerMenu() throws Exception {

		// Click on the hamburger menu.
		homePage.clickOnHamburgerMenu();

		// Verify menu items are displayed
		Assertions.verifyMenuItemsDisplayed(driver);

	}

	/**
	 * Verify MY SHOWS menu
	 */
	@Test(description = "Step 4: Verify MY SHOWS menu item present in header section.", priority = 4)
	public void Step04_VerifyTodaysPlaylistsMenu() throws Exception {

		// Verify MY SHOWS menu
		Assertions.verifyMyShowstsMenu(driver);
	}

	/**
	 * Click on MY SHOWS menu item
	 */
	@Test(description = "Step 5: Click on MY SHOWS  menu item.", priority = 5)
	public void Step05_ClickOnMyShowsMenu() throws Exception {

		// Click on MY SHOWS menu item
		myShowsPage = homePage.clickOnMyShowsMenu();

		log.info("Successfully navigate to my shows page.\n");
		Reporter.log("<p>Successfully navigate to my shows page.");

	}

	/**
	 * Verify GET TO KNOW THE SHOW section is displaying
	 */
	@Test(description = "Step 6: Verify GET TO KNOW THE SHOW section is displaying when there are no followed shows..", priority = 6)
	public void Step06_VerifyGetToKnowTheShowSectionDisplay() throws Exception {

		// Verify GET TO KNOW THE SHOW section is displaying
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageGetToKnowTheShowSection_XPATH")),
						driver),
				"‘GET TO KNOW THE SHOW section is not displaying below the message when there are no followed shows.");

		log.info("‘GET TO KNOW THE SHOW section is displaying below the message when there are no followed shows.\n");
		Reporter.log("<p>GET TO KNOW THE SHOW section is displaying below the message when there are no followed shows.");

	}

	/**
	 * Click on first show image from GET TO KNOW THE SHOW section.
	 */
	@Test(description = "Step 7: Click on first show image from GET TO KNOW THE SHOW section.", priority = 7)
	public void Step07_ClickOnFirstShowImage() throws Exception {

		// Click on first show image
		showsPage = myShowsPage.clickOnFirstShowLogo();

		log.info("Successfully navigate to show page.\n");
		Reporter.log("<p>Successfully navigate to show page.");

	}

}
