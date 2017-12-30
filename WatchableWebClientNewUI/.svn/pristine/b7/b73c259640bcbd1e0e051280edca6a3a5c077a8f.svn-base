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
import comcast.pages.HomePage;
import comcast.pages.MyShowsPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: TThis test script verifies user is navigating back to home page from my shows page by 
 * clicking on top watchable logo.
 * Created on 14-November-2016 
 * Last updated on 14-November-2016
 * 
 */

public class VerifyNavigatingToHomePageFromMyShowsPageClickingOnTopWatchableLogo
		extends BaseTest {

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
	 * Verify watchable logo is present in the header
	 */
	@Test(description = "Step 6: Verify watchable logo is present in the header.", priority = 6)
	public void Step06_VerfiyHeaderWatchableLogo() throws Exception {

		// Verify watchable logo is present in the header

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("showPageHeaderWatchableLogo_XPATH")), driver),
				"Watchable logo is not present in the header of the page.");

		log.info("Watchable logo is present in the header of the page.\n");
		Reporter.log("<p>Watchable logo is present in the header of the page.");

	}

	/**
	 * Click on header watchable logo.
	 */
	@Test(description = "Step 7: Click on header watchable logo. ", priority = 7)
	public void Step07_ClickOnHeaderWatchableLogo() throws Exception {

		// Click on header watchable logo
		homePage = myShowsPage.clickOnHeaderWatchableLogo();

		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}

}
