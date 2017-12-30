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
 * @author Manoj.Paragen 
 * Description:This test script verifies the twitter sharing of video from social sharing present below 
 * the video metadata section from watch page.
 * Created on 13-December-2016 
 * Last updated on 13-December-2016
 * 
 */

public class VerifyTwitterSharingFromWatchPage extends BaseTest {

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
	 * Verify twitter sharing icon is present below the video metadata section.
	 */

	@Test(description = "Step 4:Verify twitter sharing icon is present below the video metadata section.", priority = 4)
	public void Step04_VerifyTwitterSharingIconInWatchPage() throws Exception {

		// Mouse hover on Twitter icon
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("watchPageTwitterIcon_XPATH"))));

		Thread.sleep(2500);

		// Verifying twitter sharing icon is present in watch page
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("watchPageTwitterIcon_XPATH")), driver),
				"Twitter sharing icon is not present in Watch Page");

		log.info("Twitter sharing icon is present in Watch Page" + "\n");
		Reporter.log("<p>Twitter sharing icon is present in Watch Page");

	}

	/**
	 * Click on twitter sharing icon.
	 */
	@Test(description = "Step 5: Click on twitter sharing icon.", priority = 5)
	public void Step05_ClickOnTwitterShareIcon() throws Exception {

		// Click on Twitter icon from watch page
		watchPage.clickOnWatchPageTwitterIcon();

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

				log.info("Twitter login pop-up is displayed.\n");
				Reporter.log("<p>Twitter login pop-up is displayed.");

			}

		}

	}

	/**
	 * Verify twitter login pop-up contains video URL.
	 */
	@Test(description = "Step 6: Verify twitter login pop-up contains video URL.", priority = 6)
	public void Step06_VerifyVideoUrl() throws Exception {

		// Getting the video title from twitter popup
		String twitterVideoTitle = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("twitterLoginPopUpPlaylistUrl_XPATH")))
				.getText();

		// Verifying the twitter login pop-up contains video URL
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("twitterLoginPopUpPlaylistUrl_XPATH")), driver),
				"Twitter login pop-up not contains video URL");

		log.info("Twitter login pop-up contains video URL : -"
				+ twitterVideoTitle + "\n");
		Reporter.log("<p>Twitter login pop-up contains video URL : -"
				+ twitterVideoTitle);

		// Closing Child window
		driver.close();

	}

}
