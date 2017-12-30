package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies the details displaying in a single playlist. 
 *Created on 30-September-2016 
 *Last updated on 03-October-2016
 * 
 */

public class VerifyDetailsInSinglePlaylist extends BaseTest {

	static HomePage homePage;

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

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePagePlaylistSection_XPATH")), driver),
				"Play list section is not present in home page.");

		log.info("Play list section is present in home page.\n");
		Reporter.log("<p>Play list section is present in home page.");

	}

	/**
	 * Verify play lists present in play lists section
	 */
	@Test(description = "Step 3: Verify playlists are present in playlist section in home page.", priority = 3)
	public void Step03_VerifyPlaylistPresent() throws Exception {

		// Verify play lists present in play lists section

		int playlistCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("homePagePlaylistLogoImage_XPATH")))
				.size();

		Assert.assertTrue(playlistCount > 0,
				"Play list are not present in playlists section in home page");

		log.info("Play list are present in playlists section in home page.\n");
		Reporter.log("<p>Play list are present in playlists section in home page.");

	}

	/**
	 * Verify playlist name is displaying
	 */
	@Test(description = "Step 4: Verify playlist name is displaying on Playlist.", priority = 4)
	public void Step04_VerifyNameDisplayingOnPlaylist() throws Exception {

		// Verify playlist name is displaying

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageSelectedPlaylistTitle_XPATH")), driver),
				"Name is not displaying on play list.");

		log.info("Name is displaying on play list.\n");
		Reporter.log("<p>Name is displaying on play list.");

		log.info("Name displayed on playlist: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Name displayed on playlist: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify playlist description is displaying
	 */
	@Test(description = "Step 5: Verify playlist description is displaying on Playlist.", priority = 5)
	public void Step05_VerifyDescriptionDisplayingOnPlaylist() throws Exception {

		// Verify playlist description is displaying

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageSelectedPlaylistDescription_XPATH")),
				driver), "Description is not displaying on play list.");

		log.info("Description is displaying on play list.\n");
		Reporter.log("<p>Description is displaying on play list.");

		log.info("Description displayed on playlist: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistDescription_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Description displayed on playlist: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistDescription_XPATH")))
						.getText());

	}

	/**
	 * Verify playlist category name is displaying
	 */
	@Test(description = "Step 6: Verify play list category name is displaying on Playlist.", priority = 6)
	public void Step06_VerifyCategoryNameDisplayingOnPlaylist()
			throws Exception {

		// Verify playlist category name is displaying

		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistCategoty_XPATH")),
						driver),
				"Category name is not displaying on play list.");

		log.info("Category name is displaying on play list.\n");
		Reporter.log("<p>Category name is displaying on play list.");

		log.info("Category name displayed on playlist: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistCategoty_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Category name displayed on playlist: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistCategoty_XPATH")))
						.getText());

	}

	/**
	 * Verify playlist Video count is displaying
	 */
	@Test(description = "Step 7: Verify play list Video count is displaying on Playlist.", priority = 7)
	public void Step07_VerifyVideoCountDisplayingOnPlaylist() throws Exception {

		// Verify playlist Video count is displaying

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageSelectedPlaylistVideoCount_XPATH")),
				driver), "Video count is not displaying on play list.");

		log.info("Video count is displaying on play list.\n");
		Reporter.log("<p>Video count is displaying on play list.");

		log.info("Video count displayed on playlist: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistVideoCount_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Video count displayed on playlist: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistVideoCount_XPATH")))
						.getText());

	}

	/**
	 * Verify play icon is displaying on Playlist.
	 */
	@Test(description = "Step 8: Verify play icon is displaying on Playlist.", priority = 8)
	public void Step08_VerifyPlayIconDisplayingOnPlaylist() throws Exception {

		// VVerify play icon is displaying.

		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageSelectedPlaylistPlayIcon_XPATH")),
						driver), "Play icon is not displaying on playlist.");

		log.info("Play icon is displaying on playlist.\n");
		Reporter.log("<p>Play icon is displaying on playlist.");

	}

}
