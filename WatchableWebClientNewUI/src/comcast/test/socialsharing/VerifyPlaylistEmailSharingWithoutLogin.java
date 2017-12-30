package comcast.test.socialsharing;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.HomePage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies display of login pop-up when user tries to share playlist through email 
 * without login from watch page. 
 *Created on 05-December-2016 
 *Last updated on 05-December-2016
 * 
 */

public class VerifyPlaylistEmailSharingWithoutLogin extends BaseTest {

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
	 * Verify play lists section
	 */
	@Test(description = "Step 2: Verify Play list section is present in home page.", priority = 2)
	public void Step02_VerifyPlaylistSection() throws Exception {

		// Verify play lists section

		Assertions.verifyPlaylistSection(driver);

	}

	/**
	 * Click on play icon from any of the playlist
	 */
	@Test(description = "Step 3: Click on play icon from any of the playlist from playlist section.", priority = 3)
	public void Step03_ClickOnPlaylistIcon() throws Exception {

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
	@Test(description = "Step 4: Mouse over the up-next video drawer section and verify display of share button.", priority = 4)
	public void Step04_VerifyShareButton() throws Exception {

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
	@Test(description = "Step 5: Click on share button.", priority = 5)
	public void Step05_ClickOnShareButton() throws Exception {

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
	@Test(description = "Step 6: Verify email sharing icon is present in social sharing popup.", priority = 6)
	public void Step06_VerifyEmailIconInSocialSharingPopup() throws Exception {

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
	@Test(description = "Step 7: Click on email sharing icon.", priority = 7)
	public void Step07_ClickOnEmailSharingIcon() throws Exception {

		// Click on email sharing icon.
		watchPage.clickOnEmailIcon();

		// Verifying Login pop-up is displayed to user
		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp.getProperty("loginForm_XPATH")))
						.isDisplayed(),
				"Login pop-up is not displayed to user.");

		log.info("Login pop-up is displayed to user.\n");
		Reporter.log("<p>Login pop-up is displayed to user.");

	}

}
