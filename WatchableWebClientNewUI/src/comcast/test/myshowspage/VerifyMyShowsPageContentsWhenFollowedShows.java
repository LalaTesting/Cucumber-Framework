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
 * @author Karthik.Ashoka 
 * Description: This test script verifies the contents of my shows page when there are followed shows.
 * Created on 16-November-2016 
 * Last updated on 16-November-2016
 * 
 */

public class VerifyMyShowsPageContentsWhenFollowedShows extends BaseTest{
	

	static HomePage homePage;
	static MyShowsPage myShowsPage;
	boolean showTitlePresent = false;

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
	 * Verify the page heading is present in My shows page.
	 */
	@Test(description = "Step 6: Verify the page heading is present in My shows page.", priority = 6)
	public void Step06_VerifyPageHeadingPresent() throws Exception {

		// Verify the page heading is present
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("myShowsPageHeading_XPATH")),
				driver), "Page heading is not present in my shows page");

		log.info("Page heading is present in my shows page.\n");
		Reporter.log("<p>Page heading is present in my shows page");

		log.info("The Page heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageHeading_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Page heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageHeading_XPATH")))
						.getText());

	}

	/**
	 * Verify followed shows name is displaying in my shows page.
	 */
	@Test(description = "Step 7: Verify followed shows name is displaying in my shows page.", priority = 7)
	public void Step07_VerifyFollowedShowsName() throws Exception {
		
		// Verify followed shows name title is displaying
		int showTitleCount = driver.findElements(
				By.xpath(ObjRepoProp.getProperty("myShowsPageShowTitle_XPATH")))
				.size();
				
		if (showTitleCount > 0) {
			
			showTitlePresent = true;
			
			log.info("Followed shows name is displaying in my shows page. \n");
			Reporter.log("<p>Followed shows name is displaying in my shows page.");
		}

		else {
			log.info("There is no Followed shows in my shows page.\n");
			Reporter.log("<p>There is no Followed shows in my shows page.");
		}

		
	}
	
	/**
	 * Verify videos are displaying under the followed shows
	 */
	@Test(description = "Step 8: Verify videos are displaying under the followed shows.", priority = 8)
	public void Step08_VerifyVideosAreDisplayingForFollowedShows() throws Exception {
		
		if (showTitlePresent == true) {
			
			int videoCount = driver.findElements(
					By.xpath(ObjRepoProp.getProperty("myShowsPageFollowedVideoImg_XPATH")))
					.size();
			
			if(videoCount > 0)
			{
				log.info("Videos are displaying under the followed shows\n");
				Reporter.log("<p>Videos are displaying under the followed shows.");
				
			}
			
		}
		
	}
}
