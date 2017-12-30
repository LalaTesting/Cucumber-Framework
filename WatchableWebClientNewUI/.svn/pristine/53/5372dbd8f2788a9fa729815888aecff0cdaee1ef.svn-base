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
import comcast.pages.BrowseShowsPage;
import comcast.pages.HomePage;
import comcast.pages.MyShowsPage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies the contents of my shows page when there are no followed shows.
 * Created on 15-November-2016 
 * Last updated on 15-November-2016
 * 
 */

public class VerifyMyShowsPageContentsWhenNoFollowedShows extends BaseTest {

	static HomePage homePage;
	static MyShowsPage myShowsPage;
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
	 * Verify message heading is displaying
	 */
	@Test(description = "Step 7: Verify message heading is displaying in my shows page when there are no followed shows.", priority = 7)
	public void Step07_VerifyMessageHeadingDisplaying() throws Exception {

		// Verify the message heading is displaying
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("myShowsPageMessageTitle_XPATH")), driver),
				"Message heading is not displaying in my shows page when there is no followed shows.");

		log.info("Message heading is displaying in my shows page when there is no followed shows.\n");
		Reporter.log("<p>Message heading is displaying in my shows page when there is no followed shows.");

		log.info("The Message heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageMessageTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Message heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageMessageTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify message is displaying
	 */
	@Test(description = "Step 8: Verify message is displaying in my shows page when there are no followed shows.", priority = 8)
	public void Step08_VerifyMessageDisplaying() throws Exception {

		// Verify the message is displaying
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("myShowsPageMessage_XPATH")),
				driver),
				"Message is not displaying in my shows page when there is no followed shows.");

		log.info("Message is displaying in my shows page when there is no followed shows.\n");
		Reporter.log("<p>Message is displaying in my shows page when there is no followed shows.");

		log.info("The Message displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageMessage_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Message displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageMessage_XPATH")))
						.getText());

	}

	/**
	 * Verify ‘here’ link is displaying along with message
	 */
	@Test(description = "Step 9: Verify ‘here’ link is displaying along with message.", priority = 9)
	public void Step09_VerifyHereLinkPresentWithMessage() throws Exception {

		// Verify ‘here’ link is displaying
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("myShowsPageHereLink_XPATH")),
				driver), "‘Here’ link is not displaying along with message.");

		log.info("‘Here’ link is displaying along with message.\n");
		Reporter.log("<p>‘Here’ link is displaying along with message.");

	}

	/**
	 * Verify GET TO KNOW THE SHOW section is displaying
	 */
	@Test(description = "Step 10: Verify GET TO KNOW THE SHOW section is displaying when there are no followed shows..", priority = 10)
	public void Step10_VerifyGetToKnowTheShowSectionDisplay() throws Exception {

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

}
