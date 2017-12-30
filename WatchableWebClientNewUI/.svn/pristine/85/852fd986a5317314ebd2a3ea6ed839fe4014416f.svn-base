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
 * @author Karthik.Ashoka Description: This test script verifies the twitter
 *         sharing of playlist/show from social sharing pop-up window Created on
 *         08-December-2016 Last updated on 08-December-2016
 * 
 */

public class VerifyTwitterSharingFromSocialSharingPopup extends BaseTest {

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
	 * Verify twitter sharing icon is present in social sharing popup.
	 */

	@Test(description = "Step 6: Verify twitter sharing icon is present in social sharing popup.", priority = 6)
	public void Step06_VerifyTwitterSharingIconInSocialSharingPopup()
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
	 * Click on twitter sharing icon.
	 */
	@Test(description = "Step 7: Click on twitter sharing icon.", priority = 7)
	public void Step07_ClickOnTwitterShareIcon() throws Exception {

		// Mouse hover on Twitter icon
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("socialSharingPopupTwitterIcon_XPATH"))));

		Thread.sleep(2500);

		// Click on Twitter icon from social share popup
		watchPage.clickOnTwitterIcon();

		String parentWindows = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindows)) {
				driver.switchTo().window(windowHandle);

				Thread.sleep(5000);

				// Verifying the Twitter login pop-up opened successfully
				Assert.assertTrue(CustomFun.isElementPresent(By
						.xpath(ObjRepoProp
								.getProperty("twitterLoginPopUp_XPATH")),
						driver),
						"FaceBook login pop-up NOT opened successfully.");

			}

		}

		log.info("Twitter login pop-up is displayed.\n");
		Reporter.log("<p>Twitter login pop-up is displayed.");

	}

	/**
	 * Verify twitter login pop-up contains playlist/show URL.
	 */
	@Test(description = "Step 8: Verify twitter login pop-up contains playlist/show URL.", priority = 8)
	public void Step08_VerifyPlaylistUrl() throws Exception {

		// Getting the Playlist title from twitter popup
		String twitterPlaylistTitle = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("twitterLoginPopUpPlaylistUrl_XPATH")))
				.getText();

		// Verifying the twitter login pop-up contains playlist/show URL
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("twitterLoginPopUpPlaylistUrl_XPATH")), driver),
				"Twitter login pop-up not contains playlist/show URL");

		log.info("Twitter login pop-up contains playlist/show URL : -"
				+ twitterPlaylistTitle + "\n");
		Reporter.log("<p>Twitter login pop-up contains playlist/show URL : -"
				+ twitterPlaylistTitle);

		// Closing Child window
		driver.close();

	}

}
