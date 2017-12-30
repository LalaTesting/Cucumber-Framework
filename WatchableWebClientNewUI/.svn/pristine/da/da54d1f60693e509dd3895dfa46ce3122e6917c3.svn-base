package comcast.test.socialsharing;

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
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies from email address is auto populated in playlist email sharing popup window with 
 * logged in user’s email address.
 * Created on 07-December-2016 
 * Last updated on 07-December-2016
 * 
 */

public class VerifyAutomPopulationOfFromEmailInPlaylistEmailSharingPopup extends
		BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;

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
	 * Verify play lists section
	 */
	@Test(description = "Step 3: Verify Play list section is present in home page.", priority = 3)
	public void Step03_VerifyPlaylistSection() throws Exception {

		// Verify play lists section

		Assertions.verifyPlaylistSection(driver);

	}

	/**
	 * Click on play icon from any of the playlist
	 */
	@Test(description = "Step 4: Click on play icon from any of the playlist from playlist section.", priority = 4)
	public void Step04_ClickOnPlaylistIcon() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		// Click on play icon from selected playlist.
		watchPage = homePage.clickOnPlaylistPlayIcon();
		log.info("Successfully navigated to Watch page.\n");
		Reporter.log("<p>Successfully navigated to Watch page.");

	}

	/**
	 * Mouse over the up-next video drawer section and verify display of share
	 * button.
	 */
	@Test(description = "Step 5: Mouse over the up-next video drawer section and verify display of share button.", priority = 5)
	public void Step05_VerifyShareButton() throws Exception {

		// Scrolling down in Up-next video section to make share button visible
		watchPage.singleScrollDownInUpNextVideoSection();

		Thread.sleep(500);

		// Verifying the share button is displaying
		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageShareButton_XPATH")))
						.isDisplayed(),
				"Share button is not displaying on mouse over the up-next video drawer section.");

		log.info("Share button is displaying on mouse over the up-next video drawer section.\n");
		Reporter.log("<p>Share button is displaying on mouse over the up-next video drawer section.");

	}

	/**
	 * Click on share button.
	 */
	@Test(description = "Step 6: Click on share button.", priority = 6)
	public void Step06_ClickOnShareButton() throws Exception {

		// Click on share button.
		watchPage.clickOnShareButton();

		// Verify Social sharing popup is displayed.
		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("socialSharingPopup_XPATH")))
						.isDisplayed(),
				"Social sharing popup is not displayed.");

		log.info("Social sharing popup is displayed.\n");
		Reporter.log("<p>Social sharing popup is displayed.");

	}

	/**
	 * Verify email sharing icon is present in social sharing popup.
	 */
	@Test(description = "Step 7: Verify email sharing icon is present in social sharing popup.", priority = 7)
	public void Step07_VerifyEmailIconInSocialSharingPopup() throws Exception {

		// Verifying email sharing icon is present
		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("socialSharingPopupEmailIcon_XPATH")))
						.isDisplayed(),
				"Email sharing icon is not present in social sharing popup.");

		log.info("Email sharing icon is present in social sharing popup.\n");
		Reporter.log("<p>Email sharing icon is present in social sharing popup.");

	}

	/**
	 * Click on email sharing icon.
	 */
	@Test(description = "Step 8: Click on email sharing icon.", priority = 8)
	public void Step08_ClickOnEmailSharingIcon() throws Exception {

		// Click on email sharing icon.
		watchPage.clickOnEmailIcon();

		// Verifying Playlist email sharing popup window displayed.
		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailPlaylistPopUp_XPATH")))
						.isDisplayed(),
				"Playlist email sharing popup window is not displayed.");

		log.info("Playlist email sharing popup window is displayed.\n");
		Reporter.log("<p>Playlist email sharing popup window is displayed.");

	}

	/**
	 * Verify from email address is present in playlist email sharing popup.
	 */
	@Test(description = "Step 9: Verify from email address is present in playlist email sharing popup.", priority = 9)
	public void Step09_VerifyFromEmailInPopup() throws Exception {

		// Verify from email address in popup
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageEmailPlaylistPopUpFromEmail_XPATH")),
				driver),
				"From email address is not present in playlist email sharing popup.");

		log.info("From email address is present in playlist email sharing popup.\n");
		Reporter.log("<p>From email address is present in playlist email sharing popup.");

	}

	/**
	 * Verify from email address populated is logged user’s email address.
	 */

	@Test(description = "Step 10: Verify from email address populated is logged user’s email address.", priority = 10)
	public void Step10_VerifyEmailPopulatedInPopup() throws Exception {

		String fromEmail = "";
		// Verify from email address populated
		fromEmail = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailPlaylistPopUpFromEmail_XPATH")))
				.getAttribute("value");

		Assert.assertNotNull(fromEmail,
				"From email address is not auto populated");

		log.info("From email address is auto populated\n");
		Reporter.log("<p>From email address is auto populated");

		log.info("From Email Address populated is: " + fromEmail + "\n");
		Reporter.log("<p>From Email Address populated is: " + fromEmail);

		// Verify From email address populated is logged user’s email address

		Assert.assertEquals(fromEmail, TextProp.getProperty("email"),
				"From email address populated is not logged user’s email address.");
		log.info("From email address populated is logged user’s email address.\n");
		Reporter.log("<p>From email address populated is logged user’s email address.");

	}

	/**
	 * Verify from email address populated is not editable.
	 */
	@Test(description = "Step 11: Verify from email address populated is not editable.", priority = 11)
	public void Step11_VerifyFromEmailNotEditableldInPopup() throws Exception {

		// Verify from email address is not editable.

		Assert.assertFalse(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailPlaylistPopUpFromEmail_XPATH")))
						.isEnabled(),
				"From email address auto populated is editable.");

		log.info("From email address auto populated is not editable.\n");
		Reporter.log("<p>From email address auto populated is not editable.");

	}

}
