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
 * @author Manoj Paragen 
 * Description: This test script verifies the Facebook sharing of video from social sharing 
 * present below the video eta data section from watch page.
 * Created on 10-December-2016 
 * Last updated on 10-December-2016
 * 
 */

public class VerifyFacebookSharingFromWatchPage extends BaseTest {

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
	 * Verify Facebook sharing icon is present below the video metadata section.
	 */
	@Test(description = "Step 4: Verify Facebook sharing icon is present below the video metadata section.", priority = 4)
	public void Step04_VerifyFaceBookSharingIconInWatchPage() throws Exception {

		// Mouse hover on facebook icon to make it visible

		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("watchPageFacebookIcon_XPATH"))));

		Thread.sleep(2500);

		// Verifying facebook sharing icon is present
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageFacebookIcon_XPATH")), driver),
				"Facebook sharing icon is not present below the video metadata section.");

		log.info("Facebook sharing icon is present below the video metadata section.\n");
		Reporter.log("<p>Facebook sharing icon is present below the video metadata section.");

	}

	/**
	 * Click on Facebook sharing icon.
	 */
	@Test(description = "Step 7: Click on Facebook sharing icon.", priority = 7)
	public void Step07_ClickOnFaceBookShareIcon() throws Exception {

		// Click on facebook icon
		watchPage.clickOnWatchPageFaceBookIcon();

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

				log.info("Facebook login pop-up is displayed.\n");
				Reporter.log("<p>Facebook login pop-up is displayed.");

			}

		}

	}
}
