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
 * Description: This test script verifies follow functionality from the follow button present in video overlay when play is paused 
 * from watch page after login. 
 * Created on 30-November-2016 
 * Last updated on 30-November-2016
 * 
 */

public class VerifyFollowVideoOverlayAfterLogin extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
	static ShowPage showPage;
	static MyShowsPage myShowsPage;
	String watchPageShowName = "";

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
	 * Verify videos are present in WHAT WE’RE WATCHING section
	 */
	@Test(description = "Step 3: Verify WHAT WE’RE WATCHING section is present in home page.", priority = 3)
	public void Step03_VerifyWhatWeAreWatchingSection() throws Exception {

		// Verify WHAT WE’RE WATCHING section

		Assertions.verifyWhatWeAreWatchingSection(driver);

	}

	/**
	 * Click on first video Title
	 */
	@Test(description = "Step 4: Click on first video Title from what we are watching section.", priority = 4)
	public void Step04_ClickOnFirstVideoTitle() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		// Click on first video Title
		watchPage = homePage.clickOnFirstVideoTitle();

		log.info("Successfully Clicked on the Video Title: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Successfully Clicked on the Video Title: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoTitle_XPATH")))
						.getText());

		log.info("Successfully navigated to Watch page.\n");
		Reporter.log("<p>Successfully navigated to Watch page.");

	}

	/**
	 * Mouse over the player.
	 */
	@Test(description = "Step 5: Mouse over the player.", priority = 5)
	public void Step05_MouseOverVideoPlayer() throws Exception {

		// Mouse over the player.
		CustomFun.mouseOverVideoPlayer(driver);
		CustomFun.mouseOverVideoPlayer(driver);

		// Verify video controls displayed

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageUpNextVidoControler_XPATH")), driver),
				"Video control is not displayed.");

		log.info("Video control is displayed.\n");
		Reporter.log("<p>Video control is displayed.");

	}

	/**
	 * Click on pause button from video control.
	 */
	@Test(description = "Step 6: Click on pause button from video control.", priority = 6)
	public void Step06_ClickOnPauseButton() throws Exception {

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

	/**
	 * Verify follow button is displaying in video overlay.
	 */
	@Test(description = "Step 7: Verify follow button is displaying in video overlay.", priority = 7)
	public void Step07_VerifyFollowButtonDisplaying() throws Exception {

		// Verify follow button is displaying in video overlay.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageVideoOverlayFollowButton_XPATH")),
				driver), "Follow button is not displaying in video overlay.");

		log.info("Follow button is displaying in video overlay.\n");
		Reporter.log("<p>Follow button is displaying in video overlay.");

	}

	/**
	 * Click on follow button.
	 */
	@Test(description = "Step 8: Click on follow button.", priority = 8)
	public void Step07_ClickOnFollowButton() throws Exception {

		// Getting show name from watch page
		watchPageShowName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("watchPageVideoShowTitle_XPATH")))
				.getText();
		// Click on follow button.
		watchPage.clickOnVideoOverlayFollowButton();

		log.info("User successfully followed the show.\n");
		Reporter.log("<p>User successfully followed the show.");

		Thread.sleep(3000);

		// Changing focus from follow button to change the text to Following
		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("watchPageVideoOverlayVideoLastUpdated_XPATH"))));
		Thread.sleep(2000);

		// Verify label on follow button changed to Following from Follow.

		String followingTxt = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoOverlayFollowButton_XPATH")))
				.getText();

		Assert.assertEquals(followingTxt,
				TextProp.getProperty("followingText"),
				"The label on follow button is not changed to Following from Follow.");

		log.info("The label on follow button is changed to Following from Follow.\n");
		Reporter.log("<p>The label on follow button is  to Following from Follow.");

	}

	/**
	 * Mouse over the Following button.
	 */
	@Test(description = "Step 9: Mouse over the Following button.", priority = 9)
	public void Step09_MouseOverFollowingButton() throws Exception {

		// Mouse over the Following button.

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("watchPageVideoOverlayFollowButton_XPATH"))));
		Thread.sleep(2000);

		// Verify label on following button changed to Unfollow on mouse over.

		String unFollowTxt = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageVideoOverlayFollowButton_XPATH")))
				.getText();

		Assert.assertEquals(unFollowTxt, TextProp.getProperty("unfollowText"),
				"On mouse over the label of the button not changed to Unfollow");

		log.info("On mouse over the label of the button changed to Unfollow.\n");
		Reporter.log("<p>On mouse over the label of the button changed to Unfollow.");
	}

	/**
	 * Verify the label of the follow button in video metadata section.
	 */
	@Test(description = "Step 10: Verify the label of the follow button in video metadata section.", priority = 10)
	public void Step09_VerifyVideoMetadataFollowingButton() throws Exception {

		// Verify The label on follow button in video metadata section also
		// changed to Following

		String followingTxt = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH")))
				.getText();

		Assert.assertEquals(
				followingTxt,
				TextProp.getProperty("followingText"),
				"The label on follow button in video metadata section not changed to Following.");

		log.info("The label on follow button in video metadata section also changed to Following.\n");
		Reporter.log("<p>The label on follow button in video metadata section also changed to Following.");
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
	 * Verify the followed show name is displaying in My Shows Page
	 */
	@Test(description = "Step 13: Verify the followed show name is displaying in My Shows Page", priority = 13)
	public void Step13_VerifyFollowedShowName() throws Exception {

		String myWatchPageShowsName = "";

		// Getting count of followed shows from my show page
		int followedShowsNameCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageShowTitle_XPATH")))
				.size();

		if (followedShowsNameCount > 0) {

			for (int i = 0; i < followedShowsNameCount; i++) {

				// Verifying followed show is present in my watch page
				if (driver
						.findElement(
								By.xpath(ObjRepoProp
										.getProperty("myShowsPageShowTitlePartOne_XPATH")
										+ i
										+ ObjRepoProp
												.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
						.isDisplayed()) {
					// Getting the nameof the followed show from my shows page
					myWatchPageShowsName = driver
							.findElement(
									By.xpath(ObjRepoProp
											.getProperty("myShowsPageShowTitlePartOne_XPATH")
											+ i
											+ ObjRepoProp
													.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
							.getText();
					Assert.assertEquals(watchPageShowName.toUpperCase(),
							myWatchPageShowsName.toUpperCase(),
							"The followed show name is not displaying as rows heading in my shows page.");

					log.info("The followed show name is displaying as rows heading in my shows page.\n");
					Reporter.log("<p>The followed show name is displaying as rows heading in my shows page.");
					break;

				}

				else {
					log.info("The followed show name is not displaying as rows heading in my shows page.\n");
					Reporter.log("<p>The followed show name is not displaying as rows heading in my shows page.");
				}
			}

		}

	}
}
