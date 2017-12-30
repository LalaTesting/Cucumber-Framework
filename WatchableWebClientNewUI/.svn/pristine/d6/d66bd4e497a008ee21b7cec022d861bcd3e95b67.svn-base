package comcast.test.myshowspage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import static comcast.util.PropertyFileReader.TextProp;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.HomePage;
import comcast.pages.MyShowsPage;
import comcast.pages.ShowPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies navigating to show page from my shows page when there are followed shows 
 * by clicking on followed show name heading.
 * Created on 15-November-2016 
 * Last updated on 15-November-2016
 * 
 */

public class VerifyNavigatingToShowsPageFromMyshowsPageWhenFollowedShows extends
		BaseTest {

	static HomePage homePage;
	static MyShowsPage myShowsPage;
	static ShowPage showsPage;
	boolean showTitlePresent = false;

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
	 * Verify followed shows name title is displaying
	 */
	@Test(description = "Step 6: Verify followed shows name title is displaying in my shows page.", priority = 6)
	public void Step06_VerifyShowsNameTitleDisplaying() throws Exception {

		// Verify followed shows name title is displaying
		int showTitleCount = driver.findElements(
				By.xpath(ObjRepoProp.getProperty("myShowsPageShowTitle_XPATH")))
				.size();
		if (showTitleCount > 0) {
			showTitlePresent = true;
			log.info("Followed shows name title is displaying in my shows page.\n");
			Reporter.log("<p>Followed shows name title is displaying in my shows page.");
		}

		else {
			log.info("There is no Followed shows in my shows page.\n");
			Reporter.log("<p>There is no Followed shows in my shows page.");
		}

	}

	/**
	 * Click on first show name title
	 */
	@Test(description = "Step 7: Click on first show name heading.", priority = 7)
	public void Step07_ClickOnShowNameTitle() throws Exception {

		if (showTitlePresent == true) {

			// Getting the show title from from first row
			String firstShowHeadingTitle = driver.findElement(
					By.xpath(ObjRepoProp
							.getProperty("myShowsPageFirstShowTitle_XPATH")))
					.getText();

			// Click on first show Title
			showsPage = myShowsPage.clickOnFirstShowNameTitle();

			log.info("Successfully Clicked on the show Title: "
					+ firstShowHeadingTitle + "\n");
			Reporter.log("<p>Successfully Clicked on the Fshow Title:  "
					+ firstShowHeadingTitle);

			log.info("Successfully navigate to show page.\n");
			Reporter.log("<p>Successfully navigate to show page.");
		}

	}

}
