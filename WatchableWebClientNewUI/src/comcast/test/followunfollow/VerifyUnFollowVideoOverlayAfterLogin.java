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
import comcast.pages.ShowPage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description:This test script verifies un-follow functionality from the un-follow button present in video overlay 
 * when play is paused from watch page after login.
 * Created on 30-November-2016 
 * Last updated on 01-December-2016
 * 
 */

public class VerifyUnFollowVideoOverlayAfterLogin extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
	static ShowPage showPage;
	static MyShowsPage myShowsPage;
	String watchPageShowName = "";
	boolean followedShowPresent = false;

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
	 * Mouse over the player.
	 */
	@Test(description = "Step 7: Mouse over the player.", priority = 7)
	public void Step07_MouseOverVideoPlayer() throws Exception {

		if (followedShowPresent == true) {

			// Mouse over the player.
			CustomFun.mouseOverVideoPlayer(driver);
			CustomFun.mouseOverVideoPlayer(driver);

			// Verify video controls displayed

			Assert.assertTrue(
					CustomFun.isElementPresent(
							By.xpath(ObjRepoProp
									.getProperty("watchPageUpNextVidoControler_XPATH")),
							driver), "Video control is not displayed.");

			log.info("Video control is displayed.\n");
			Reporter.log("<p>Video control is displayed.");
		}

	}

	/**
	 * Click on pause button from video control.
	 */
	@Test(description = "Step 8: Click on pause button from video control.", priority = 8)
	public void Step08_ClickOnPauseButton() throws Exception {

		if (followedShowPresent == true) {

			// Click on pause button
			watchPage.clickOnPauseButton();

			// Video overlay metadata is displayed when play is paused
			Assert.assertTrue(
					driver.findElement(
							By.xpath(ObjRepoProp
									.getProperty("watchPageVideoOverlay_XPATH")))
							.isDisplayed(),
					"Video overlay metadata is not displayed when video got paused.");

			log.info("Video overlay metadata is displayed when video got paused.\n");
			Reporter.log("<p>Video overlay metadata is displayed when video got paused.");
		}

	}

	/**
	 * Verify following button is present in video overlay.
	 */
	@Test(description = "Step 9: Verify following button is present in video overlay.", priority = 9)
	public void Step09_VerifyFollowingButtonDisplaying() throws Exception {
		if (followedShowPresent == true) {

			// Verify following button is displaying in video overlay.
			Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
					.getProperty("watchPageVideoOverlayFollowButton_XPATH")),
					driver),
					"Following button is not present in watch page in video overlay.");

			log.info("Following button is present in watch page in video overlay.\n");
			Reporter.log("<p>Following button is present in watch page in video overlay.");
		}

	}

	/**
	 * Mouse over the Following button.
	 */
	@Test(description = "Step 10: Mouse over the Following button.", priority = 10)
	public void Step10_MouseOverFollowingButton() throws Exception {

		if (followedShowPresent == true) {

			// Getting show name from watch page
			watchPageShowName = driver.findElement(
					By.xpath(ObjRepoProp
							.getProperty("watchPageVideoShowTitle_XPATH")))
					.getText();

			// Mouse over the Following button.
			CustomFun
					.mouseOverElement(
							driver,
							driver.findElement(By.xpath(ObjRepoProp
									.getProperty("watchPageVideoOverlayFollowButton_XPATH"))));

			// Verify label on following button changed to Unfollow on mouse
			// over.

			String unFollowTxt = driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("watchPageVideoOverlayFollowButton_XPATH")))
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
	@Test(description = "Step 11: Click on follow button.", priority = 11)
	public void Step11_ClickOnUnFollowButton() throws Exception {
		if (followedShowPresent == true) {
			// Click on Un-follow button.
			watchPage.clickOnVideoOverlayFollowButton();

			log.info("User successfully unfollowed the show.\n");
			Reporter.log("<p>User successfully unfollowed the show.");
		}

	}

	/**
	 * Mouse over the Un-Follow button.
	 */
	@Test(description = "Step 12: Mouse over the Following button.", priority = 12)
	public void Step09_MouseOverUnFollowButton() throws Exception {

		if (followedShowPresent == true) {
			// Mouse over the Following button.
			CustomFun
					.mouseOverElement(
							driver,
							driver.findElement(By.xpath(ObjRepoProp
									.getProperty("watchPageVideoOverlayFollowButton_XPATH"))));

			Thread.sleep(2000);

			// Verify label on following button changed to Unfollow on mouse
			// over.

			String followTxt = driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("watchPageVideoOverlayFollowButton_XPATH")))
					.getText();

			Assert.assertEquals(followTxt, TextProp.getProperty("followText"),
					"On mouse over the label of the button not changed to Follow");

			log.info("On mouse over the label of the button changed to Follow.\n");
			Reporter.log("<p>On mouse over the label of the button changed to Follow.");
		}
	}

	/**
	 * Verify the label of the follow button in video metadata section.
	 */
	@Test(description = "Step 13: Verify the label of the follow button in video metadata section.", priority = 13)
	public void Step09_VerifyVideoMetadataFollowingButton() throws Exception {

		// Verify The label on un-follow button in video metadata section also
		// changed to Follow

		String followTxt = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH")))
				.getText();

		Assert.assertEquals(
				followTxt,
				TextProp.getProperty("followText"),
				"The label on un-follow button in video metadata section not changed to Follow.");

		log.info("The label on un-follow button in video metadata section also changed to Follow.\n");
		Reporter.log("<p>The label on un-follow button in video metadata section also changed to Follow.");
	}

	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 14: Click on the hamburger menu.", priority = 14)
	public void Step14_ClickOnHamburgerMenu() throws Exception {

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

	@Test(description = "Step 15: Click on MY SHOWS  menu item.", priority = 15)
	public void Step15_ClickOnMyShowsMenu() throws Exception {

		// clicking on MyShows menu
		myShowsPage = watchPage.clickOnMyShowsMenu();

		log.info("Successfully navigate to My Shows page. \n");

		Reporter.log("<p>Successfully navigate to My Shows page.");

	}

	/**
	 * Verify the un-followed show name is not displaying in My Shows Page
	 */
	@Test(description = "Step 16: Verify the un-followed show name is not displaying in My Shows Page", priority = 16)
	public void Step16_VerifyUnFollowedShowName() throws Exception {

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
