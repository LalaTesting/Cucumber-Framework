package comcast.test.watchpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies the display of playlist title in header while scrolling down from top of the page. 
 * Created on 22-November-2016 
 * Last updated on 22-November-2016
 * 
 */

public class VerifyDisplayOfPlaylistTitleWhileScrollDownFromTop extends
		BaseTest {

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

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePagePlaylistSection_XPATH")), driver),
				"Play list section is not present in home page.");

		log.info("Play list section is present in home page.\n");
		Reporter.log("<p>Play list section is present in home page.");

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
	 * Scroll down from the top of the page.
	 */
	@Test(description = "Step 4: Scroll down from the top of the page.", priority = 4)
	public void Step04_ScrollDownFromTopOfPage() throws Exception {

		// Scroll down from the top of the page.
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2500);

		// Verify Playlist title is displaying

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPagePLaylistShowTitle_XPATH")), driver),
				"Playlist  title is displayed next to the hamburger menu.");

		log.info("Playlist  title is displayed next to the hamburger menu.\n");
		Reporter.log("<p>Playlist  title is displayed next to the hamburger menu.");

		log.info("Show title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPagePLaylistShowTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Show title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPagePLaylistShowTitle_XPATH")))
						.getText());
	}

}
