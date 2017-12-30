package comcast.test.playlistpage;

import static comcast.util.PropertyFileReader.TextProp;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.HomePage;
import comcast.pages.PlaylistPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies logout from playlists page user is navigating back to home page.
 * Created on 09-November-2016 
 * Last updated on 09-November-2016
 * 
 */

public class VerifyLogoutFromPlaylistsPageNavigatingToHomePage extends BaseTest {

	static HomePage homePage;
	static PlaylistPage playlistPage;

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

		String email = TextProp.getProperty("email");
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
	 * Verify TODY'S PLAYLISTS menu
	 */
	@Test(description = "Step 4: Verify TODY'S PLAYLISTS menu item present in header section.", priority = 4)
	public void Step04_VerifyTodaysPlaylistsMenu() throws Exception {

		// Verify TODY'S PLAYLISTS menu
		Assertions.verifyTodaysPlaylistsMenu(driver);
	}

	/**
	 * Click on Today's Playlists menu item
	 */
	@Test(description = "Step 5: Click on Today's Playlists  menu item.", priority = 5)
	public void Step05_ClickOnTodaysPlaylistsMenu() throws Exception {

		// Click on Today's Playlists menu item
		playlistPage = homePage.clickOnTodaysPlaylistsMenu();

		log.info("Successfully navigate to Today's Playlists page.\n");
		Reporter.log("<p>Successfully navigate to Today's Playlists page.");

	}

	/**
	 * Click on logout from user menu
	 */
	@Test(description = "Step 6: Click on logout from user menu . ", priority = 6)
	public void Step06_ClickOnLogoutFromTodaysPlaylistPage() throws Exception {

		// Click on logout from browse showse Page
		homePage = playlistPage.clickOnLogoutMenu();

		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}

}
