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
 * Description: This test script verifies from email address is auto populated in video email sharing popup window with 
 * logged in user’s email address.
 * Created on 07-December-2016 
 * Last updated on 07-December-2016
 * 
 */

public class VerifyAutomPopulationOfFromEmailInVideoEmailSharingPopup extends BaseTest {

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
	 * Verify from email address is present in video email sharing popup.
	 */
	@Test(description = "Step 7: Verify from email address is present in video email sharing popup.", priority = 7)
	public void Step07_VerifyFromEmailInPopup() throws Exception {

		// Verify from email address in popup
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageEmailVideoPopUpFromEmail_XPATH")),
				driver),
				"From email address is not present in video email sharing popup.");

		log.info("From email address is present in video email sharing popup.\n");
		Reporter.log("<p>From email address is video in playlist email sharing popup.");

	}

	/**
	 * Verify from email address populated is logged user’s email address.
	 */

	@Test(description = "Step 8: Verify from email address populated is logged user’s email address.", priority = 8)
	public void Step08_VerifyEmailPopulatedInPopup() throws Exception {

		String fromEmail = "";
		// Verify from email address populated
		fromEmail = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailVideoPopUpFromEmail_XPATH")))
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
	@Test(description = "Step 9: Verify from email address populated is not editable.", priority = 9)
	public void Step09_VerifyFromEmailNotEditableldInPopup() throws Exception {

		// Verify from email address is not editable.

		Assert.assertFalse(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPageEmailVideoPopUpFromEmail_XPATH")))
						.isEnabled(),
				"From email address auto populated is editable.");

		log.info("From email address auto populated is not editable.\n");
		Reporter.log("<p>From email address auto populated is not editable.");

	}

}
