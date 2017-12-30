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
 * Description: This test script verifies default message is displaying in message field in show email sharing popup.
 * Created on 09-December-2016 
 * Last updated on 09-December-2016
 * 
 */

public class VerifyDefaultMessageInShowEmailSharingPopup extends BaseTest {

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
	 * Verify videos are present in WHAT WE’RE WATCHING section
	 */
	@Test(description = "Step 3: Verify WHAT WE’RE WATCHING section is present in home page.", priority = 3)
	public void Step03_VerifyWhatWeAreWatchingSection() throws Exception {

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
				"Show email sharing popup window is not displayed.");

		log.info("Show email sharing popup window is displayed.\n");
		Reporter.log("<p>Show email sharing popup window is displayed.");

	}

	/**
	 * Verify message text area field is present in playlist email sharing
	 * popup.
	 */
	@Test(description = "Step 9: Verify message text area field is present in playlist email sharing popup.", priority = 9)
	public void Step09_VerifyMessageFieldInPopup() throws Exception {

		// Verify to message in popup
		Assert.assertTrue(
				CustomFun.isElementPresent(By.id(ObjRepoProp
						.getProperty("watchPageEmailPlaylistPopUpMessage_ID")),
						driver),
				"Message text area field is not present in playlist email sharing popup.");

		log.info("Message text area field is present in playlist email sharing popup.\n");
		Reporter.log("<p>Message text area field is present in playlist email sharing popup.");

	}

	/**
	 * Verify default message is displaying in message field in sharing popup
	 * windows.
	 * 
	 * */
	@Test(description = "Step 10:Verify default message is displaying in message field in sharing popup windows.", priority = 10)
	public void Step10_VerifyeDefaultMessageDisplay() throws Exception {

		// Verify default message display
		String defaultMsg = driver.findElement(
				By.id(ObjRepoProp
						.getProperty("watchPageEmailPlaylistPopUpMessage_ID")))
				.getText();

		Assert.assertTrue(defaultMsg.length() > 0,
				"Default message is displaying in message field in sharing popup windows.");

		log.info("Default message is displaying in message field in sharing popup windows.\n");
		Reporter.log("<p>Default message is displaying in message field in sharing popup windows.");

		log.info("The message is displayed is: "
				+ driver.findElement(
						By.id(ObjRepoProp
								.getProperty("watchPageEmailPlaylistPopUpMessage_ID")))
						.getText() + ".\n");
		Reporter.log("<p>The message is displayed is: "
				+ driver.findElement(
						By.id(ObjRepoProp
								.getProperty("watchPageEmailPlaylistPopUpMessage_ID")))
						.getText());

	}

}
