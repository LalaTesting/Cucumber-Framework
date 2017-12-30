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
 * @author karthik.ashoka
 * Description: This test script verifies follow functionality from the follow button present in video
 * metadata section of watch page after login
 *Created on 29-November-2016 
 *Last updated on 01-December-2016
 * 
 */

public class VerifyFollowFromWatchPageAfterLogin extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
	static MyShowsPage myShowsPage;
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
	 * Verify WHAT WE’RE WATCHING section is present in home page.
	 */
	@Test(description = "Step 3: Verify WHAT WE’RE WATCHING section is present in home page.", priority = 3)
	public void Step03_VerifyWhatWeAreWatchingSection() throws Exception {

		// Verifying the What We are Watching Section
		Assertions.verifyWhatWeAreWatchingSection(driver);

	}

	/**
	 * Click on first video Title from what we are watching section.
	 */
	@Test(description = "Step 4: Click on first video Title from what we are watching section.", priority = 4)
	public void Step04_ClickOnFirstVideoTitle() throws Exception {

		// Clicking on first video title from home page
		watchPage = homePage.clickOnFirstVideoTitle();

		// Getting title of first video under what we are watching section
		String videoTitle = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("homePageFirstVideoTitle_XPATH")))
				.getText();

		log.info("Successfully click on first title - " + videoTitle + "\n");
		Reporter.log("<p>Successfully click on first title - " + videoTitle);

		log.info("Successfully navigate to watch page.\n");
		Reporter.log("<p>Successfully navigate to watch page.");

	}

	/**
	 * Verify follow button is present in watch page.
	 */
	@Test(description = "Step 5: Verify follow button is present in watch page..", priority = 5)
	public void Step05_VerifyFollowButton() throws Exception {

		// Verifying the follow button is displaying in watch page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageFollowButton_XPATH")), driver),
				"Follow button is not present in watch page.");

		log.info("Follow button is present in watch page in video metadata section.\n");
		Reporter.log("<p>Follow button is present in watch page in video metadata section.");

	}

	/**
	 * Click on follow button.
	 */
	@Test(description = "Step 6: Click on follow button.", priority = 6)
	public void Step06_ClickOnFollowButton() throws Exception {

		// Getting text before clicking follow button
		String beforeClickFollowButton = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH")))
				.getText();

		log.info("Text before Clicking Follow BUtton :- "
				+ beforeClickFollowButton + "\n");

		// Click on Follow button

		watchPage.clickOnFollowButton();

		// Getting Followed show name
		showName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("watchPageVideoShowTitle_XPATH")))
				.getText();

		log.info("The Followed Show Name is :- " + showName);

		log.info("User successfully followed the show.\n");
		Reporter.log("<p>User successfully followed the show.");

		// Getting text After clicking follow button
		String afterClickFollowButton = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH")))
				.getText();

		log.info("Text After Clicking Follow BUtton :- "
				+ afterClickFollowButton + "\n");

		Assert.assertEquals(afterClickFollowButton,
				TextProp.getProperty("followingText"));

		log.info("The label on follow button changed to Following.\n");
		Reporter.log("<p>The label on follow button changed to Following. ");

	}

	/**
	 * Mouse over the Following button.
	 */
	@Test(description = "Step 7: Mouse over the Following button..", priority = 7)
	public void Step07_VerifyMouseHoverOnFollowingButton() throws Exception {

		// Getting text before mouse hover on Following button
		String beforeMouseHoverOnFollowingButton = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH")))
				.getText();

		log.info("Text Before mouse hover on Following BUtton :- "
				+ beforeMouseHoverOnFollowingButton + "\n");

		// Mouse hover on Follow button
		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH"))));

		Thread.sleep(2500);

		// Getting text after mouse hover on Following button
		String afterMouseHoverOnFollowingButton = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH")))
				.getText();

		log.info("Text After mouse hover on Following Button :- "
				+ afterMouseHoverOnFollowingButton + "\n");

		Assert.assertEquals(afterMouseHoverOnFollowingButton,
				TextProp.getProperty("unfollowText"));

		log.info("On mouse over the label of the button changed to Unfollow. \n");
		Reporter.log("<p>On mouse over the label of the button changed to Unfollow. ");

	}

	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 8: Click on the hamburger menu.", priority = 8)
	public void Step08_ClickOnHamburgerMenu() throws Exception {

		// Scroll down for page
		CustomFun.scrollDownForAPage(driver);

		// Click on the hamburger menu.
		watchPage.clickOnHamburgerMenu();

		// Verify menu items are displayed
		Assertions.verifyMenuItemsDisplayed(driver);
	}

	/**
	 * Click on MY SHOWS menu item
	 */

	@Test(description = "Step 9: Click on MY SHOWS  menu item.", priority = 9)
	public void Step09_ClickOnMyShowsMenu() throws Exception {

		// clicking on MyShows menu
		myShowsPage = watchPage.clickOnMyShowsMenu();

		log.info("Successfully navigate to My Shows page. \n");
		Reporter.log("<p>Successfully navigate to My Shows page.");

	}

	/**
	 * Verify the followed show name is displaying in My Shows Page
	 */
	@Test(description = "Step 10: Verify the followed show name is displaying in My Shows Page", priority = 10)
	public void Step10_VerifyFollowedShowName() throws Exception {

		String followedShowsNames = "";

		// Getting count of followed show names
		int followedShowsNameCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageShowTitle_XPATH")))
				.size();

		if (followedShowsNameCount > 0) {

			for (int i = 0; i < followedShowsNameCount; i++) {

				// Validating show tiles are displaying or not
				if (driver
						.findElement(
								By.xpath(ObjRepoProp
										.getProperty("myShowsPageShowTitlePartOne_XPATH")
										+ i
										+ ObjRepoProp
												.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
						.isDisplayed()) {
					// Getting the text values of shows
					followedShowsNames = driver
							.findElement(
									By.xpath(ObjRepoProp
											.getProperty("myShowsPageShowTitlePartOne_XPATH")
											+ i
											+ ObjRepoProp
													.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
							.getText();

					if (followedShowsNames.toUpperCase().contains(
							showName.toUpperCase())) {

						log.info("The Followed Shows is present in My Shows Page: "
								+ showName + "\n");
						Reporter.log("<p>The Followed Shows is present in My Shows Page: "
								+ showName);

						break;
					} else {
						log.info("The followed show name is not present in My Shows Page.\n");
						Reporter.log("<p>The followed show name is not present in My Shows Page.");
					}

					// Printing the show name values
					log.info("The Shows Followed are :- " + followedShowsNames
							+ "\n");
					Reporter.log("<p> The Shows Followed are :- "
							+ followedShowsNames);

					log.info("The show name is displaying as rows heading in my shows page.\n");
					Reporter.log("<p>The show name is displaying as rows heading in my shows page.");

					break;

				} else {
					log.info("The followed show name is not displaying as rows heading in my shows page.\n");
					Reporter.log("<p>The followed show name is not displaying as rows heading in my shows page.");
				}

			}

		}

	}
}
