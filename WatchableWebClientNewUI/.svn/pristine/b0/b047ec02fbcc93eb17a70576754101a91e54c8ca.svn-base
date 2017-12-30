package comcast.test.followunfollow;

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
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj Paragen
 * Description: This test script verifies un-follow functionality from video metadata section of watch page after login.
 *Created on 01-December-2016 
 *Last updated on 01-December-2016
 * 
 */

public class VerifyUnFollowFromWatchPageAfterLogin extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
	static MyShowsPage myShowsPage;
	String watchPageShowName = "";
	boolean followedShowPresent = false;
	String showName = "";

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
	 * Click on MY SHOWS menu item
	 */
	@Test(description = "Step 4: Click on MY SHOWS  menu item.", priority = 4)
	public void Step04_ClickOnMyShowsMenu() throws Exception {

		// Click on MY SHOWS menu item
		myShowsPage = homePage.clickOnMyShowsMenu();

		log.info("Successfully navigate to my shows page.\n");
		Reporter.log("<p>Successfully navigate to my shows page.");

	}

	/**
	 * Verify the followed show name is displaying in My Shows Page
	 */
	@Test(description = "Step 5: Verify the followed show name is displaying in My Shows Page", priority = 5)
	public void Step05_VerifyFollowedShowName() throws Exception {

		// Getting count of followed shows from my show page
		int followedShowsNameCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageShowTitle_XPATH")))
				.size();

		if (followedShowsNameCount > 0) {
			followedShowPresent = true;
			log.info("The followed show name is displaying as rows heading in my shows page.\n");
			Reporter.log("<p>The followed show name is displaying as rows heading in my shows page.");

		}

		else {
			log.info("There is no followed shows in My Shows Page.\n");
			Reporter.log("<p>There is no followed shows in My Shows Page.");
		}
	}

	/**
	 * Click on video title from first video (If followed shows present).
	 */
	@Test(description = "Step 6: Click on video title from first video (If followed shows  present).", priority = 6)
	public void Step06_ClickOnTitleOfFirstVideo() throws Exception {

		if (followedShowPresent == true) {
			// Getting video title text
			String videoTitle = driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("myShowsPageFirstVideoTitleOfFirstFollowedShows_XPATH")))
					.getText();

			// Clicking on First Video title from My Shows page
			watchPage = myShowsPage.clickOnFirstVideoTitle();

			log.info("Successfully Clicked on the First Video Title: "
					+ videoTitle + "\n");
			Reporter.log("<p>Successfully Clicked on the First Video Title:  "
					+ videoTitle);

			log.info("Successfully navigate to watch page.\n");
			Reporter.log("<p>Successfully navigate to watch page.");
		}

	}

	/**
	 * Verify follow button is present in watch page.
	 */
	@Test(description = "Step 7: Verify follow button is present in watch page..", priority = 7)
	public void Step07_VerifyFollowButton() throws Exception {

		// Verifying the follow button is displaying in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageFollowButton_XPATH")), driver),
				"Follow button is not present in watch page.");

		log.info("Follow button is present in watch page in video metadata section.\n");
		Reporter.log("<p>Follow button is present in watch page in video metadata section.");

	}

	/**
	 * Mouse over the Following button.
	 */
	@Test(description = "Step 8: Mouse over the Following button.", priority = 8)
	public void Step08_MouseOverFollowingButton() throws Exception {

		if (followedShowPresent == true) {

			// Getting show name from watch page
			watchPageShowName = driver.findElement(
					By.xpath(ObjRepoProp
							.getProperty("watchPageVideoShowTitle_XPATH")))
					.getText();

			// Mouse over the Following button.
			CustomFun.mouseOverElement(driver, driver.findElement(By
					.xpath(ObjRepoProp
							.getProperty("watchPageFollowButton_XPATH"))));
			Thread.sleep(2000);

			// Verify label on following button changed to Unfollow on mouse
			// over.

			String unFollowTxt = driver.findElement(
					By.xpath(ObjRepoProp
							.getProperty("watchPageFollowButton_XPATH")))
					.getText();

			Assert.assertEquals(unFollowTxt,
					TextProp.getProperty("unfollowText"),
					"On mouse over the label of the button not changed to Unfollow");

			log.info("On mouse over the label of the button changed to Unfollow.\n");
			Reporter.log("<p>On mouse over the label of the button changed to Unfollow.");
		}
	}

	/**
	 * Click on Un-follow button.
	 */
	@Test(description = "Step 9: Click on follow button.", priority = 9)
	public void Step09_ClickOnUnFollowButton() throws Exception {
		if (followedShowPresent == true) {
			// Click on Un-follow button.
			watchPage.clickOnFollowButton();

			log.info("User successfully unfollowed the show.\n");
			Reporter.log("<p>User successfully unfollowed the show.");
		}

	}

	/**
	 * Mouse over the Un-Follow button.
	 */
	@Test(description = "Step 10: Mouse over the Following button.", priority = 10)
	public void Step10_MouseOverUnFollowButton() throws Exception {

		if (followedShowPresent == true) {
			// Mouse over the Following button.
			CustomFun.mouseOverElement(driver, driver.findElement(By
					.xpath(ObjRepoProp
							.getProperty("watchPageFollowButton_XPATH"))));

			Thread.sleep(2000);

			// Verify label on following button changed to Unfollow on mouse
			// over.

			String followTxt = driver.findElement(
					By.xpath(ObjRepoProp
							.getProperty("watchPageFollowButton_XPATH")))
					.getText();

			Assert.assertEquals(followTxt, TextProp.getProperty("followText"),
					"On mouse over the label of the button not changed to Follow");

			log.info("On mouse over the label of the button changed to Follow.\n");
			Reporter.log("<p>On mouse over the label of the button changed to Follow.");
		}
	}

	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 11: Click on the hamburger menu.", priority = 11)
	public void Step11_ClickOnHamburgerMenu() throws Exception {

		// Scroll down to make top menu items visible
		CustomFun.scrollDownFromTopOfPage(driver);

		// Click on the hamburger menu.
		watchPage.clickOnHamburgerMenu();

		// Verify menu items are displayed
		Assertions.verifyMenuItemsDisplayed(driver);
	}

	/**
	 * Click on MY SHOWS menu item
	 */

	@Test(description = "Step 12: Click on MY SHOWS  menu item.", priority = 12)
	public void Step12_ClickOnMyShowsMenu() throws Exception {

		// clicking on MyShows menu
		myShowsPage = watchPage.clickOnMyShowsMenu();

		log.info("Successfully navigate to My Shows page. \n");

		Reporter.log("<p>Successfully navigate to My Shows page.");

	}

	/**
	 * Verify the un-followed show name is not displaying in My Shows Page
	 */
	@Test(description = "Step 13: Verify the un-followed show name is not displaying in My Shows Page", priority = 13)
	public void Step13_VerifyUnFollowedShowName() throws Exception {

		if (followedShowPresent == true) {

			String myWatchPageShowsName = "";
			boolean showPresent = true;

			// Getting count of followed shows from my show page
			int followedShowsNameCount = driver.findElements(
					By.xpath(ObjRepoProp
							.getProperty("myShowsPageShowTitle_XPATH"))).size();

			if (followedShowsNameCount > 0) {

				for (int i = 0; i < followedShowsNameCount; i++) {

					// Verifying un-followed show is not present in my watch
					// page
					if (driver
							.findElements(
									By.xpath(ObjRepoProp
											.getProperty("myShowsPageShowTitlePartOne_XPATH")
											+ i
											+ ObjRepoProp
													.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
							.size() > 0) {
						if (driver
								.findElement(
										By.xpath(ObjRepoProp
												.getProperty("myShowsPageShowTitlePartOne_XPATH")
												+ i
												+ ObjRepoProp
														.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
								.isDisplayed()) {
							// Getting the name of the un followed show from my
							// shows page (if it is present in my shoes page
							// after
							// unfollowing also)
							myWatchPageShowsName = driver
									.findElement(
											By.xpath(ObjRepoProp
													.getProperty("myShowsPageShowTitlePartOne_XPATH")
													+ i
													+ ObjRepoProp
															.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
									.getText();
							if (myWatchPageShowsName.toUpperCase().equals(
									watchPageShowName.toUpperCase())) {
								showPresent = true;
							}

							else {
								showPresent = false;

							}

						}
					}

				}

				Assert.assertEquals(showPresent, false,
						"The un-followed show name is displaying as rows heading in my shows page.");
				log.info("The un-followed show name is not displaying as rows heading in my shows page.\n");
				Reporter.log("<p>The un-followed show name is not displaying as rows heading in my shows page.");

			}

			else {
				log.info("The un-followed show name is not displaying as rows heading in my shows page.\n");
				Reporter.log("<p>The un-followed show name is not displaying as rows heading in my shows page.");
			}
		}
	}
}
