package comcast.test.socialsharing;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import java.util.Set;

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
 * @author Karthik.Ashoka Description: This test script verifies the Facebook
 *         sharing of playlist/show from social sharing pop-up window. Created
 *         on 09-December-2016 Last updated on 09-December-2016
 * 
 */

public class VerifyFacebookSharingFromSocialSharingPopup extends BaseTest {

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

		// Verifying the socail share button dispalyign or not
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

		// Verifying the socail share popup dispalyign or not
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
	 * Verify Facebook sharing icon is present in social sharing popup.
	 */
	@Test(description = "Step 6: Verify Facebook sharing icon is present in social sharing popup.", priority = 6)
	public void Step06_VerifyFaceBookSharingIconInSocialSharingPopup()
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
	 * Click on Facebook sharing icon.
	 */
	@Test(description = "Step 7: Click on Facebook sharing icon.", priority = 7)
	public void Step07_ClickOnFaceBookShareIcon() throws Exception {

		// Mouse hover on Twitter icon
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("socialSharingPopupFacebookIcon_XPATH"))));

		Thread.sleep(2500);

		// Click on facebook icon from social share popup
		watchPage.clickOnFaceBookIcon();

		String parentWindows = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindows)) {
				driver.switchTo().window(windowHandle);

				Thread.sleep(5000);

				// Verifying the Facebook login pop-up opened successfully
				Assert.assertTrue(CustomFun.isElementPresent(By
						.xpath(ObjRepoProp
								.getProperty("facebookLoginPopUp_XPATH")),
						driver),
						"FaceBook login pop-up NOT opened successfully.");

			}

		}

		// Closing Child window
		driver.close();

		log.info("Facebook login pop-up is displayed.\n");
		Reporter.log("<p>Facebook login pop-up is displayed.");

	}
}
