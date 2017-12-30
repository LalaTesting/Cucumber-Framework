package comcast.test.socialsharing;

import static comcast.util.PropertyFileReader.ObjRepoProp;

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
 * @author Karthik.Ashoka Description: This test script verifies the contents of
 *         social sharing pop-up window Created on 07-December-2016 Last updated
 *         on 07-December-2016
 * 
 */

public class VerifySocialSharingPopupContents extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;

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
	 * Verify Play list section is present in home page.
	 */
	@Test(description = "Step 2: Verify Play list section is present in home page.", priority = 2)
	public void Step02_VerifyPlaylistSection() throws Exception {

		// Verifying the Playlist section
		Assertions.verifyPlaylistSection(driver);

	}

	/**
	 * Click on play icon from any of the playlist from playlist section.
	 */
	@Test(description = "Step 3: Click on play icon from any of the playlist from playlist section.", priority = 3)
	public void Step03_ClickOnPlayIconOfAnyPlaylist() throws Exception {

		// Click on play icon from selected playlist.
		watchPage = homePage.clickOnPlaylistPlayIcon();

		log.info("Successfully navigated to Watch page.\n");
		Reporter.log("<p>Successfully navigated to Watch page.");

	}

	/**
	 * Mouse over the up-next video drawer section and verify display of share
	 * button.
	 */
	@Test(description = "Step 4: Mouse over the up-next video drawer section and verify display of share button.", priority = 4)
	public void Step04_VerifyShareButton() throws Exception {

		// scroll down on upnext video section
		watchPage.singleScrollDownInUpNextVideoSection();

		// Verifying the Share button is displaying on mouse over
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
	@Test(description = "Step 5: Click on share button.", priority = 5)
	public void Step05_ClickOnShareButton() throws Exception {

		// clicking on Share Button
		watchPage.clickOnShareButton();

		// Verifying the Social sharing popup dispalying or not
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

	@Test(description = "Step 6: Verify email sharing icon is present in social sharing popup.", priority = 6)
	public void Step06_VerifyEmailSharingIconInSocialSharingPopup()
			throws Exception {

		// Verifying email sharing icon is present in social sharing popup.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("socialSharingPopupEmailIcon_XPATH")), driver),
				"Email sharing icon is not present in social sharing popup ");

		// Getting text of email
		String emailLabel = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("socialSharingPopUpEmailLabel_XPATH")))
				.getText();

		// verifying the Email label
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("socialSharingPopUpEmailLabel_XPATH")), driver),
				"Email label not dispalying below to email icon in social sharing popup");

		log.info("Email sharing icon is present in social sharing popup with the label : "
				+ emailLabel + "\n");
		Reporter.log("<p>Email sharing icon is present in social sharing popup with the label : "
				+ emailLabel);

	}

	/**
	 * Verify twitter sharing icon is present in social sharing popup.
	 */

	@Test(description = "Step 7: Verify twitter sharing icon is present in social sharing popup.", priority = 7)
	public void Step07_VerifyTwitterSharingIconInSocialSharingPopup()
			throws Exception {

		// Verifying twitter sharing icon is present in social sharing popup.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("socialSharingPopupTwitterIcon_XPATH")), driver),
				"Twitter sharing icon is not present in social sharing popup");

		// Getting text of Twitter
		String twitterLabel = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("socialSharingPopUpTwitterLabel_XPATH")))
				.getText();

		// verifying the Twitter label
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("socialSharingPopUpTwitterLabel_XPATH")), driver),
				"Twitter label not dispalying below to twitter icon in social sharing popup");

		log.info("Twitter sharing icon is present in social sharing popup with the label : "
				+ twitterLabel + "\n");
		Reporter.log("<p>Twitter sharing icon is present in social sharing popup with the label : "
				+ twitterLabel);

	}

	/**
	 * Verify Facebook sharing icon is present in social sharing popup.
	 */
	@Test(description = "Step 8: Verify Facebook sharing icon is present in social sharing popup.", priority = 8)
	public void Step08_VerifyFaceBookSharingIconInSocialSharingPopup()
			throws Exception {

		// Verifying facebook sharing icon is present in social sharing popup.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("socialSharingPopupFacebookIcon_XPATH")), driver),
				"Facebook sharing icon is not present in social sharing popup");

		// Getting text of Facebook
		String faceBookLabel = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("socialSharingPopUpFaceBookLabel_XPATH")))
				.getText();

		// verifying the Facebook label
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("socialSharingPopUpFaceBookLabel_XPATH")),
						driver),
				"Facebook label not dispalying below to facebook icon in social sharing popup");

		log.info("Facebook sharing icon is present in social sharing popup with the label : "
				+ faceBookLabel + "\n");
		Reporter.log("<p>Facebook sharing icon is present in social sharing popup with the label : "
				+ faceBookLabel);

	}

	/**
	 * Click on share button again.
	 */
	@Test(description = "Step 9: Click on share button again.", priority = 9)
	public void Step09_ClickAgainShareButton() throws Exception {

		// clicking on Share Button
		watchPage.clickOnShareButton();

		// Verifying the Social sharing popup dispalying or not
		Assert.assertFalse(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("socialSharingPopup_XPATH")))
						.isDisplayed(), "Social sharing popup is not closed.");

		log.info("Social sharing popup is closed.\n");
		Reporter.log("<p>Social sharing popup is closed.");

	}

}
