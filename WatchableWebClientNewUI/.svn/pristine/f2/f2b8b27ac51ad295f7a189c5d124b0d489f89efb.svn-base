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
 * Description: This test script verifies contents of video email sharing popup window.
 * Created on 06-December-2016 
 * Last updated on 06-December-2016
 * 
 */

public class VerifyVideoEmailSharingPopupContent extends BaseTest {

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
	 * Verify email sharing icon is present in watch page.
	 */
	@Test(description = "Step 5: Verify email sharing icon is present in watch page.", priority = 5)
	public void Step05_VerifyEmailIconInWatchPage() throws Exception {

		// mouse over email icon to make it visible
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("watchPageEmailIcon_XPATH"))));

		// Verifying email sharing icon is present
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("watchPageEmailIcon_XPATH")),
				driver),
				"Email sharing icon is not present in watch page below the video metadata.");

		log.info("Email sharing icon is present in watch page below the video metadata.\n");
		Reporter.log("<p>Email sharing icon is present in watch page below the video metadata.");

	}

	/**
	 * Click on email sharing icon.
	 */
	@Test(description = "Step 6: Click on email sharing icon.", priority = 6)
	public void Step06_ClickOnEmailSharingIcon() throws Exception {

		// Click on email sharing icon.
		watchPage.clickOnVideoMetadataEmailIcon();

		// Verifying video email sharing popup window displayed.
		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailVideoPopUp_XPATH")))
						.isDisplayed(),
				"Video email sharing popup window is not displayed.");

		log.info("Video email sharing popup window is displayed.\n");
		Reporter.log("<p>Video email sharing popup window is displayed.");

	}

	/**
	 * Verify close(X) button is present in Video email sharing popup.
	 */
	@Test(description = "Step 7: Verify close(X) button is present in Video email sharing popup.", priority = 7)
	public void Step07_VerifyCloseButtonInPopup() throws Exception {

		// Verify close (X) button is present
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailVideoPopUpCloseButton_XPATH")),
						driver),
				"Close(X) button is not present in Video email sharing popup at right top corner.");

		log.info("Close(X) button is present in Video email sharing popup at right top corner.\n");
		Reporter.log("<p>Close (X) button is present in playlist Video sharing popup at right top corner.");

	}

	/**
	 * Verify title is present in Video email sharing popup.
	 */
	@Test(description = "Step 8: Verify title is present in show email sharing popup.", priority = 8)
	public void Step08_VerifyTitleInPopup() throws Exception {

		// Verify title is present
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageEmailVideoPopUpTitle_XPATH")), driver),
				"Title is not present in Video email sharing popup.");

		log.info("Title is present in Video email sharing popup.\n");
		Reporter.log("<p>Title is Video in playlist email sharing popup.");

		log.info("The title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailVideoPopUpTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailVideoPopUpTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify from email address is present in Video email sharing popup.
	 */
	@Test(description = "Step 9: Verify from email address is present in show email sharing popup.", priority = 9)
	public void Step09_VerifyFromEmailInPopup() throws Exception {

		// Verify from email address in popup
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageEmailVideoPopUpFromEmail_XPATH")), driver),
				"From email address is not present in Video email sharing popup.");

		log.info("From email address is present in Video email sharing popup.\n");
		Reporter.log("<p>From email address is present in Video email sharing popup.");

	}

	/**
	 * Verify to email address text field is present in Video email sharing
	 * popup.
	 */
	@Test(description = "Step 10: Verify to email address text field is present in Video email sharing popup.", priority = 10)
	public void Step10_VerifyToEmailInPopup() throws Exception {

		// Verify to email address in popup
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageEmailVideoPopUpToEmail_XPATH")), driver),
				"To email address text field is not present in Video email sharing popup.");

		log.info("To email address text field is present in Video email sharing popup.\n");
		Reporter.log("<p>To email address text field is present in Video email sharing popup.");

	}

	/**
	 * Verify message text area field is present in Video email sharing popup.
	 */
	@Test(description = "Step 11: Verify message text area field is present in Video email sharing popup.", priority = 11)
	public void Step11_VerifyMessageFieldInPopup() throws Exception {

		// Verify to message in popup
		Assert.assertTrue(CustomFun.isElementPresent(By.id(ObjRepoProp
				.getProperty("watchPageEmailVideoPopUpMessage_ID")), driver),
				"Message text area field is not present in Video email sharing popup.");

		log.info("Message text area field is present in Video email sharing popup.\n");
		Reporter.log("<p>Message text area field is present in Video email sharing popup.");

	}

	/**
	 * Verify send button is present in Video email sharing popup.
	 */
	@Test(description = "Step 12: Verify send button is present in Video email sharing popup.", priority = 12)
	public void Step12_VerifySendButtonInPopup() throws Exception {

		// Verify to send button in popup
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageEmailVideoPopUpSendButton_XPATH")),
				driver),
				"Send button is not present in Video email sharing popup");

		log.info("Send button is present in Video email sharing popup\n");
		Reporter.log("<p>Send button is present in Video email sharing popup");

	}

}
